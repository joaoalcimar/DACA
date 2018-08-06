package com.ufcg.daca.service;

import com.ufcg.daca.model.Tutor;

import exceptions.ObjetoInexistenteException;

public class DoarServiceImpl implements DoarService{
	double dinheiroSistema = 0;
	DefinirTutorServiceImpl service = new DefinirTutorServiceImpl();
	

	@Override
	public void doar(String matriculaTutor, int totalCentavos) throws ObjetoInexistenteException {
		Tutor t = service.getTutorPorMatricula(matriculaTutor);
		double totalSistema = 1 - calculaTaxa(totalCentavos, t);
		double totalTutor = totalCentavos - totalSistema;
		t.setDinheiro(t.getDinheiro() + totalTutor);
		dinheiroSistema += totalSistema;
		service.setTutor(t);
	}

	@Override
	public double totalDinheiroTutor(String matricula) throws ObjetoInexistenteException {
		return service.getTutorPorMatricula(matricula).getDinheiro();
	}

	@Override
	public double totalDinheiroSistema() {

		return dinheiroSistema;
	}
	
	public double calculaTaxa(double doacao, Tutor t) {
		if (t.getNivel().equals("TOP")) {
			return 0.9 + (0.01*(t.getNota()-4.5));
		}else if (t.getNivel().equals("Tutor")) {
			return 0.8;
		}else {
			return 0.4 - (0.01*(3 - t.getNota()));
		}
	}

}
