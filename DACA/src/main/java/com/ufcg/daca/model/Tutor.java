package com.ufcg.daca.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Tutor implements Serializable{ // nao achei herança necessaria nesse caso
											// aproveitamento seria pouco
	String matricula;
	String disciplina;
	double proeficiencia;
	double nota = 4;
	double dinheiro = 0;
	String horario;
	String diaDisponivel;
	String localAtendimento;
	String status;
	ArrayList<String> avaliadoPor = new ArrayList<String>();
	String nivel;
	
	
	public Tutor(String matricula, String disciplina, double proeficiencia, String horario,
			String diaDisponivel,String localAtendimento) {
		super();
		this.matricula = matricula;
		this.disciplina = disciplina;
		this.proeficiencia = proeficiencia;
		this.horario = horario;
		this.diaDisponivel = diaDisponivel;
		this.localAtendimento = localAtendimento;
	}
	
	public Tutor() {
		super();
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
	public double getProeficiencia() {
		return proeficiencia;
	}
	public void setProeficiencia(int proeficiencia) {
		this.proeficiencia = proeficiencia;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double d) {
		this.nota = d;
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getDiaDisponivel() {
		return diaDisponivel;
	}

	public void setDiaDisponivel(String diaDisponivel) {
		this.diaDisponivel = diaDisponivel;
	}

	public String getLocalAtendimento() {
		return localAtendimento;
	}

	public void setLocalAtendimento(String localAtendimento) {
		this.localAtendimento = localAtendimento;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNivel() {
		if (nota > 4.5) {
			return "TOP";
		}else if(nota <= 4.5) {
			return "Tutor";
		}else {
			return "Aprendiz";
		}
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public void setProeficiencia(double proeficiencia) {
		this.proeficiencia = proeficiencia;
	}
	

}
