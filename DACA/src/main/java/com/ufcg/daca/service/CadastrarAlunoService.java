package com.ufcg.daca.service;

import com.ufcg.daca.model.Aluno;

import exceptions.ObjetoInexistenteException;
import exceptions.ObjetoJaExistenteException;
import exceptions.Rep;


public interface CadastrarAlunoService{
	
	void cadastrarAluno(String nome, String matricula, int codigoCurso, String telefone, String email)
		throws Rep, ObjetoJaExistenteException;
	
	String recuperaAluno(String matricula) throws ObjetoInexistenteException, Rep, ObjetoInexistenteException;
	
	String listarAlunos();
	
    void salvaDados();

	Aluno getAluno(String email) throws Rep, ObjetoInexistenteException;

	Aluno getAlunoPorMatricula(String matricula) throws Rep, ObjetoInexistenteException;

	String getInfoAluno(String matricula) throws ObjetoInexistenteException;

}
