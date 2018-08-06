package com.ufcg.daca.service;

import exceptions.ObjetoInexistenteException;
import exceptions.Rep;

public interface AvaliarTutorService {
	
	String avaliarTutor (int idAjuda, double nota) throws Rep, ObjetoInexistenteException;
	
	double pegarNota(String matriculaTutor) throws ObjetoInexistenteException;
	
	String pegarNivel(String matriculaTutor) throws Rep, ObjetoInexistenteException;
}
