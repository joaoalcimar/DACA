package com.ufcg.daca.service;

import com.ufcg.daca.model.Ajuda;

import exceptions.ObjetoInexistenteException;
import exceptions.Rep;

public interface CadastrarPedidoAjudaService {
	
	int pedirAjudaPresencial (String matrAluno, String disciplina, String horario, String dia, String localInteresse) throws Rep, ObjetoInexistenteException;
	
	int pedirAjudaOnline (String matrAluno, String disciplina) throws Rep, ObjetoInexistenteException;
	
	String pegarTutor(int idAjuda);
	
	String getInfoAjuda(int idAjuda) throws ObjetoInexistenteException;

	void salvaDados();

	Ajuda getPedidoPorId(int id) throws ObjetoInexistenteException;

}
