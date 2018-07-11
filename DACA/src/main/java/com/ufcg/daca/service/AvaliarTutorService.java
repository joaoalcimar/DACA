package com.ufcg.daca.service;

public interface AvaliarTutorService {
	
	String avaliarTutor (int idAjuda, int nota);
	
	String pegarNota(String matriculaTutor);
	
	String pegarNivel(String matriculaTutor);
}
