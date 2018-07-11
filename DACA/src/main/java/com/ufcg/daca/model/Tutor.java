package com.ufcg.daca.model;

import java.io.Serializable;

public class Tutor implements Serializable{

	String matricula;
	String disciplina;
	int proeficiencia;
	
	public Tutor(String matricula, String disciplina, int proeficiencia) {
		super();
		this.matricula = matricula;
		this.disciplina = disciplina;
		this.proeficiencia = proeficiencia;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public int getProeficiencia() {
		return proeficiencia;
	}
	public void setProeficiencia(int proeficiencia) {
		this.proeficiencia = proeficiencia;
	}

}
