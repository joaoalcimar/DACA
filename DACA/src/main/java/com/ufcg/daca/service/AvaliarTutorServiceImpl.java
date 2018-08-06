package com.ufcg.daca.service;

import com.ufcg.daca.model.Ajuda;
import com.ufcg.daca.model.Tutor;

import exceptions.ObjetoInexistenteException;
import exceptions.Rep;

public class AvaliarTutorServiceImpl implements AvaliarTutorService{
	CadastrarPedidoAjudaServiceImpl service = new CadastrarPedidoAjudaServiceImpl();
	DefinirTutorServiceImpl serviceTut = new DefinirTutorServiceImpl();
	double dinheiroSistema = 0;
	
	@Override
	public String avaliarTutor(int idAjuda, double nota)throws Rep, ObjetoInexistenteException {
		Ajuda ajuda = service.getPedidoPorId(idAjuda);
		String matricula = ajuda.getTutor().getMatricula();
		Tutor tutor = serviceTut.getTutorPorMatricula(matricula);
		if(!ajuda.isAvaliacao()) {
			ajuda.setAvaliacao(true);
			tutor.setNota((tutor.getNota()*5 + nota)/6);
		}else {
			throw new Rep("Pedido já avaliado");
		}
		
		String saida= "Pedido avaliado com sucesso :)";
		return saida;
	}

	@Override
	public double pegarNota(String matriculaTutor) throws ObjetoInexistenteException {
		
		double nota = 0.0;
		for(int i = 0; i <= DefinirTutorServiceImpl.getTutores().size(); i++) {
			if (matriculaTutor.equals(DefinirTutorServiceImpl.getTutores().get(i).getMatricula())) {
				nota = DefinirTutorServiceImpl.getTutores().get(i).getNota();
			}else{
				throw new ObjetoInexistenteException("Tutor não cadastrado");
			}
		}
		return nota;
	}

	@Override
	public String pegarNivel(String matriculaTutor) throws Rep, ObjetoInexistenteException {
		String nivel = "";
		for(int i = 0; i <= DefinirTutorServiceImpl.getTutores().size(); i++) {
			if (matriculaTutor.equals(DefinirTutorServiceImpl.getTutores().get(i).getMatricula())) {
				DefinirTutorServiceImpl.getTutores().get(i).getNivel();
			}else{
				throw new ObjetoInexistenteException("Tutor não cadastrado");
			}
		}
		return nivel;
	}
}