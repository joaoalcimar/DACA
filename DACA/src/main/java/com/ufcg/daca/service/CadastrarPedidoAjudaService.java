package com.ufcg.daca.service;

public interface CadastrarPedidoAjudaService {
	
	int pedirAjudaPresencial (String matrAluno, String disciplina, String horario, String dia, String localInteresse);
	
	int pedirAjudaOnline (String matrAluno, String disciplina);
	
	String pegarTutor(int idAjuda);
	
	String getInfoAjuda(int idAjuda, String atributo);

}
