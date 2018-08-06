 package com.ufcg.daca.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ufcg.daca.model.Ajuda;
import com.ufcg.daca.model.Tutor;
import com.ufcg.daca.util.Deserializador;
import com.ufcg.daca.util.Serializador;

import exceptions.ObjetoInexistenteException;
import exceptions.Rep;

@Service("CadastrarPedidoAjudaService")
public class CadastrarPedidoAjudaServiceImpl implements CadastrarPedidoAjudaService{
	
	CadastrarAlunoServiceImpl service = new CadastrarAlunoServiceImpl();
	
    public CadastrarPedidoAjudaServiceImpl() {
		super();
	}	
    
    private static List<Ajuda> pedidos;
    
    static {
        carregarDados();
    }
    
    public static void carregarDados(){
    	Deserializador d = new Deserializador();
    	try{
    		ArrayList<Ajuda> lista= (ArrayList<Ajuda>) d.deserializar("./src/arquivos/pedidos.bd");
    		if(lista != null){
    			pedidos = lista;
    		}
    	}catch (Exception e) {
    		System.out.println("Erro"+e.getMessage());
		}
    	
    }
    
    @Override
    public void salvaDados(){
    	Serializador s = new Serializador();
    	try {
			s.serializar("./src/arquivos/pedidos.bd", pedidos);
		} catch (Exception e) {
			System.out.println("Erro"+e.getMessage());
		}
    }
    
    
	@Override
	public int pedirAjudaPresencial(String matrAluno, String disciplina, String horario, String dia,
			String localInteresse) throws Rep, ObjetoInexistenteException {
		ArrayList<Tutor> disponiveis = new ArrayList<Tutor>();
		ArrayList<Tutor> tutores = (ArrayList<Tutor>) DefinirTutorServiceImpl.getTutores();
		for (int i = 0; i <= tutores.size(); i++) {
			if (tutores.get(i).getDiaDisponivel().equals(dia) &&
			tutores.get(i).getHorario().equals(horario) && tutores.get(i).getDisciplina().equals(disciplina)){
				disponiveis.add(tutores.get(i));
			}
 		}
		Tutor melhor = disponiveis.get(0);
		for(int j = 1; j <= disponiveis.size(); j++) {
			if (disponiveis.get(j).getProeficiencia() > melhor.getProeficiencia()) {
				melhor = disponiveis.get(j);
			}
		}
		Ajuda a = new Ajuda(getNumPedidosAjuda(),disciplina,
				horario,dia,localInteresse,service.getAlunoPorMatricula(matrAluno),melhor);
		pedidos.add(a);
		return getNumPedidosAjuda();
	}

	@Override
	public int pedirAjudaOnline(String matrAluno, String disciplina) throws Rep, ObjetoInexistenteException {
		ArrayList<Tutor> disponiveis = new ArrayList<Tutor>();
		ArrayList<Tutor> tutores = (ArrayList<Tutor>) DefinirTutorServiceImpl.getTutores();
		for (int i = 0; i <= tutores.size(); i++) {
			if (tutores.get(i).getDisciplina().equals(disciplina)){
				disponiveis.add(tutores.get(i));
			}
 		}
		Tutor melhor = disponiveis.get(0);
		for(int j = 1; j <= disponiveis.size(); j++) {
			if (disponiveis.get(j).getProeficiencia() > melhor.getProeficiencia()) {
				melhor = disponiveis.get(j);
			}
		}
		Ajuda a = new Ajuda(getNumPedidosAjuda(),matrAluno,disciplina,service.getAlunoPorMatricula(matrAluno),melhor);
		pedidos.add(a);
		return getNumPedidosAjuda();
	}
	
	public int getNumPedidosAjuda() {
		int contador = 1;
		for(int k = 0; k <= pedidos.size(); k++) {
			contador ++;
		}
		return contador;
	}

	@Override
	public String pegarTutor(int idAjuda) {
		String matricula = pedidos.get(idAjuda).getTutor().getMatricula();
		double proficiencia = pedidos.get(idAjuda).getTutor().getProeficiencia();
		String disciplina = pedidos.get(idAjuda).getTutor().getDisciplina();
		String saida = "O tutor responsável pelo pedido de ajuda número " + idAjuda +
				" é o de matricula " + matricula + " , tem proeficiêcia " + proficiencia +
				" na disciplina " + disciplina;
		return saida;
	}

	@Override
	public String getInfoAjuda(int idAjuda) throws ObjetoInexistenteException {
		String saida = "";
		for(int i = 0; i <= pedidos.size(); i++) {
			if (pedidos.get(i).getId() == idAjuda) {
				Ajuda pedido = pedidos.get(i);
				String nome = pedido.getAluno().getNome();
				String dia = pedido.getDia();
				String disc = pedido.getDisciplina();
				String hora = pedido.getHorario();
				String loc = pedido.getLocal();
				String mat = pedido.getTutor().getMatricula();
				saida = "O nome do solicitante é " + nome + ", o pedido é do dia " + dia +
						" na hora " + hora + " no local " + loc + ", da disciplina " +
						disc + " e o tutor responsável é " + mat;
			}else {
				throw new ObjetoInexistenteException("Pedido não encontrado no sistema");
			}
		}
		
		return saida;
	}
	
	@Override
	public Ajuda getPedidoPorId(int id) throws ObjetoInexistenteException{
		Ajuda pedido = new Ajuda();
			for(int i = 0; i <= pedidos.size();i++) {
				if(pedidos.get(i).getId() == id) {
					pedido = pedidos.get(i);
				}else {
					throw new ObjetoInexistenteException("Pedido não cadastrado");
				}
			}
		return pedido;
	}
	
	

}
