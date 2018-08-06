package com.ufcg.daca.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ufcg.daca.model.Aluno;
import com.ufcg.daca.model.Tutor;
import com.ufcg.daca.util.Deserializador;
import com.ufcg.daca.util.Serializador;

import exceptions.ObjetoInexistenteException;
import exceptions.ObjetoInvalidoException;
import exceptions.ObjetoJaExistenteException;
import exceptions.Rep;

@Service("DefinirTutorService") 
public class DefinirTutorServiceImpl implements DefinirTutorService{
	
    private static List<Tutor> tutores;
    CadastrarAlunoService cadastrarAlunoService = new CadastrarAlunoServiceImpl();
	
    public DefinirTutorServiceImpl() {
		super();
	}

	static {
        tutores = populateTutores();
        carregarDados();
    }
    
    public static void carregarDados(){
    	Deserializador d = new Deserializador();
    	try{
    		ArrayList<Tutor> lista= (ArrayList<Tutor>) d.deserializar("./src/arquivos/tutores.bd");
    		if(lista != null){
    			tutores = lista;
    		}
    	}catch (Exception e) {
    		System.out.println("Erro"+e.getMessage());
		}
    	
    }
    
    @Override
    public void salvaDados(){
    	Serializador s = new Serializador();
    	try {
			s.serializar("./src/arquivos/tutores.bd", tutores);
		} catch (Exception e) {
			System.out.println("Erro"+e.getMessage());
		}
    }
    
    private static List<Tutor> populateTutores(){   // para fins de teste
        List<Tutor> tutores = new ArrayList<Tutor>();

        tutores.add(new Tutor("1234567", "redes", 3 , "14:00 as 16:00", "Quinta", "CA202"));
        tutores.add(new Tutor("1357911", "programacao", 4 , "14:00 as 16:00", "Quinta", "CA202"));
        tutores.add(new Tutor("2468101", "complicadores", 4 , "14:00 as 16:00", "Quinta", "CA202"));
        
        return tutores;
    }
    

	@Override
	public void tornarTutor(String matricula, String disciplina, double proficiencia, String horario,
			String diaDisponivel,String localAtendimento) throws
	ObjetoJaExistenteException, ObjetoInvalidoException{
		Tutor t = new Tutor(matricula,disciplina,proficiencia,horario,diaDisponivel, localAtendimento);
		
    	if (tutores.contains(t)) {
			throw new ObjetoJaExistenteException("Tutor ja cadastrado");
		}
    	if (proficiencia < 1 || proficiencia > 5) {
    		throw new ObjetoInvalidoException("Proficiencia invalida");
    	}
		
        tutores.add(t);
        this.salvaDados();
		
	}

	@Override
	public String recuperaTutor(String matricula)  throws Rep, ObjetoInexistenteException{
		for (int i = 0; i <= tutores.size(); i++) {
			if (tutores.get(i).getMatricula().equals(matricula)){
				return tutores.get(i).toString();
			}
		}
        throw new ObjetoInexistenteException("Tutor Inexistente");
	}
	
	@Override
	public Tutor recuperaTutorPorEmail(String email)  throws Rep, ObjetoInexistenteException{
		
		Aluno a = new Aluno();
		a = cadastrarAlunoService.getAluno(email);
		for (int i = 0; i <= tutores.size(); i++) {
			if (tutores.get(i).getMatricula().equals(a.getMatricula())){
				return tutores.get(i);
			}
		}
        throw new ObjetoInexistenteException("Tutor Inexistente");
	}

	@Override
	public String listarTutores() {
    	String s = "";
    	for(int i = 0; i <= tutores.size(); i++){
    		s += tutores.get(i).toString() + "\n";
    	}
    	return s;
	}

	public static List<Tutor> getTutores() {
		return tutores;
	}

	public static void setTutores(List<Tutor> tutores) {
		DefinirTutorServiceImpl.tutores = tutores;
	}
	
	@Override
	public Tutor getTutorPorMatricula(String matricula) throws ObjetoInexistenteException {
		for (int i = 0; i <= tutores.size(); i++) {
			if (tutores.get(i).getMatricula().equals(matricula)){
				return tutores.get(i);
			}
		}
        throw new ObjetoInexistenteException("Tutor Inexistente");
	}
	
	public void setTutor(Tutor t) {
		for (int i = 0; i <= tutores.size(); i++) {
			if (tutores.get(i).getMatricula().equals(t.getMatricula())){
				tutores.set(i, t);
			}
		}
	}
	
	

}
