package com.ufcg.daca.service;

public interface DoarService {
	
	void doar(String matriculaTutor, int totalCentavos);
	
	int totalDinheiroTutor(String emailTutor);
	
	int totalDinheiroSistema();

}
