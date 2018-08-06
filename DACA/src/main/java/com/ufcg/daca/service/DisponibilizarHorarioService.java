package com.ufcg.daca.service;

import exceptions.ObjetoInexistenteException;
import exceptions.Rep;

public interface DisponibilizarHorarioService {

	void cadastrarHorario(String email, String horario, String dia) throws Rep, ObjetoInexistenteException;
	
	void cadastrarLocalDeAtendimento(String email, String local) throws Rep, ObjetoInexistenteException;
	
	boolean consultaHorario(String email, String horario, String dia) throws Rep, ObjetoInexistenteException;
	
	boolean consultaLocal(String email, String local) throws Rep, ObjetoInexistenteException;
}
