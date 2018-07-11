package com.ufcg.daca.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.ufcg.daca.model.Aluno;
import com.ufcg.daca.util.Deserializador;
import com.ufcg.daca.util.Serializador;

import exceptions.ObjetoInexistenteException;
import exceptions.ObjetoJaExistenteException;
import exceptions.Rep;

@Service("casdastrarAlunoService") 
public class CadastrarAlunoServiceImpl implements CadastrarAlunoService{
	
    private static List<Aluno> alunos;
    
    static {
        alunos = populateAlunos();
        carregarDados();
    }
    
    public static void carregarDados(){
    	Deserializador d = new Deserializador();
    	try{
    		ArrayList<Aluno> lista= (ArrayList<Aluno>) d.deserializar("./src/arquivos/alunos.bd");
    		if(lista != null){
    			alunos = lista;
    		}
    	}catch (Exception e) {
    		System.out.println("Erro"+e.getMessage());
		}
    	
    }
    
    @Override
    public void salvaDados(){
    	Serializador s = new Serializador();
    	try {
			s.serializar("./src/arquivos/alunos.bd", alunos);
		} catch (Exception e) {
			System.out.println("Erro"+e.getMessage());
		}
    }
    
    private static List<Aluno> populateAlunos() {   // para fins de teste
        List<Aluno> alunos = new ArrayList<Aluno>();

        alunos.add(new Aluno("Lucas", "201810055", 100, "(83)99999-9999", "lucasmedicina@medico.com"));
        alunos.add(new Aluno("Nicole", "201811022", 110, "(83)99999-9998", "nicole_Htinha@gmail.com"));
        alunos.add(new Aluno("Mario", "201811011", 110, "(83)99999-9997", "que_mario@gmail.com"));
        
        return alunos;
    }
	
    @Override
	public void cadastrarAluno(String nome, String matricula, int codigoCurso, String telefone, String email) throws ObjetoJaExistenteException{
		Aluno a = new Aluno(nome,matricula,codigoCurso,telefone,email);
		
    	if (alunos.contains(a)) {
			throw new ObjetoJaExistenteException("Aluno ja cadastrado");
		}
		
        alunos.add(a);
        this.salvaDados();
	}
   
	
    @Override
	public String recuperaAluno(String matricula) throws Rep, ObjetoInexistenteException{
		for (int i = 0; i <= alunos.size(); i++) {
			if (alunos.get(i).getMatricula().equals(matricula)){
				if (alunos.get(i).getTelefone() != null){
					System.out.println(alunos.get(i).toString());
				}else {
					System.out.println(alunos.get(i).noTelToString());
				}
			}
		}
        throw new ObjetoInexistenteException("Aluno Inexistente");
	}
	
    @Override
	public String listarAlunos() {
    	String s = "";
    	// TODO ordenar por nome depois
    	for(int i = 0; i <= alunos.size(); i++){
    		s += alunos.get(i).noTelToString() + "\n";
    	}
    	return s;
	}
	
    @Override
	public String getInfoAluno(String matricula, String atributo) {
    	// TODO nem ideia do que eh essa saida e esse atributo
		return atributo;
		
    }


}
