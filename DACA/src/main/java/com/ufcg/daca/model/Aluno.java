package com.ufcg.daca.model;

import java.io.Serializable;

import org.springframework.core.style.ToStringCreator;

public class Aluno implements Serializable{

	String nome;
	String matricula;
	int codigoCurso;
	String telefone;
	String email;
	
	public Aluno(){
		super();
	}
	
	public Aluno(String nome, String matricula, int codigoCurso, String telefone, String email) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.codigoCurso = codigoCurso;
		this.telefone = telefone;
		this.email = email;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		String s = getMatricula() + " - " + getNome() + " - " + getCodigoCurso() + " - "
				+ getTelefone() + " - " + getEmail();
		return s;	
	}
	
	public String noTelToString() {
		String s = getMatricula() + " - " + getNome() + " - " + getCodigoCurso() + " - "
				+ getEmail();
		return s;	
	}

}
