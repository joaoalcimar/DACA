package com.ufcg.daca.service;

import com.ufcg.daca.model.Tutor;

import exceptions.ObjetoInexistenteException;
import exceptions.ObjetoInvalidoException;
import exceptions.ObjetoJaExistenteException;
import exceptions.Rep;

public interface DefinirTutorService {
	
	void tornarTutor(String matricula, String disciplina, double proficiencia, String horario,
			String diaDisponivel,String localAtendimento) throws ObjetoJaExistenteException, ObjetoInvalidoException;
	
	String recuperaTutor(String matricula) throws Rep, ObjetoInexistenteException;
	
	String listarTutores();

	void salvaDados();

	Tutor recuperaTutorPorEmail(String email) throws Rep, ObjetoInexistenteException;

	Tutor getTutorPorMatricula(String matricula) throws ObjetoInexistenteException;
}
