package com.ufcg.daca.service;

public interface DisponibilizarHorarioService {

	void cadastrarHorario(String email, String horario, String dia);
	
	void cadastrarLocalDeAtendimento(String email, String local);
	
	boolean consultaHorario(String email, String horario, String dia);
	
	boolean consultaLocal(String email, String local);
}
