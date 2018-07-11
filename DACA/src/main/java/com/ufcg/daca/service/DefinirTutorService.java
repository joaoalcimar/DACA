package com.ufcg.daca.service;

public interface DefinirTutorService {
	
	void tornarTutor(String matricula, String disciplina, int proficiencia);
	
	String recuperaTutor(String matricula);
	
	String listarTutores();
}
