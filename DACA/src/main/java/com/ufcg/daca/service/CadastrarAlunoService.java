package com.ufcg.daca.service;

import java.util.Iterator;

import com.ufcg.daca.model.Aluno;

import exceptions.ObjetoInexistenteException;
import exceptions.ObjetoJaExistenteException;
import exceptions.Rep;


public interface CadastrarAlunoService{
	
	void cadastrarAluno(String nome, String matricula, int codigoCurso, String telefone, String email)
		throws Rep, ObjetoJaExistenteException;
	
	String recuperaAluno(String matricula) throws ObjetoInexistenteException, Rep, ObjetoInexistenteException;
	
	String listarAlunos();
	
	String getInfoAluno(String matricula, String atributo);
	
    void salvaDados();

}
