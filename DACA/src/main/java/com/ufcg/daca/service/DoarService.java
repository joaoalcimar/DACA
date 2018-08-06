package com.ufcg.daca.service;

import exceptions.ObjetoInexistenteException;

public interface DoarService {
	
	void doar(String matriculaTutor, int totalCentavos) throws ObjetoInexistenteException;
	
	double totalDinheiroTutor(String emailTutor) throws ObjetoInexistenteException;
	
	double totalDinheiroSistema();

}
