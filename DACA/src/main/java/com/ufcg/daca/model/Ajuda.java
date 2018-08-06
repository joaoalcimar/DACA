package com.ufcg.daca.model;

import java.io.Serializable;

public class Ajuda implements Serializable{
	
	int id;
	String disciplina;
	String horario;
	String dia;
	String local;
	Aluno aluno;
	Tutor tutor;
	boolean avaliacao;
	
	public Ajuda(int id, String disciplina, String horario, String dia, String local, Aluno aluno, Tutor tutor) {
		super();
		this.disciplina = disciplina;
		this.horario = horario;
		this.dia = dia;
		this.local = local;
		this.aluno = aluno;
		this.tutor = tutor;
		this.avaliacao = false;
	}
	
	public Ajuda(int id, String matrAluno, String disciplina, Aluno aluno, Tutor tutor) {
		super();
		this.disciplina = disciplina;
		this.aluno = aluno;
		this.tutor = tutor;
		this.avaliacao = false;
	}
	
	public Ajuda(){
		id = 0;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Tutor getTutor() {
		return tutor;
	}
	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	public boolean isAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(boolean avaliacao) {
		this.avaliacao = avaliacao;
	}

	
	

}
