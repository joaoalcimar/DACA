package com.ufcg.daca.service;

import org.springframework.stereotype.Service;

import com.ufcg.daca.model.Tutor;

import exceptions.ObjetoInexistenteException;
import exceptions.Rep;

@Service("DisponibilizarHorarioService") 
public class DisponibilizarHorarioServiceImpl implements DisponibilizarHorarioService{
	
	DefinirTutorService definirTutorService = new DefinirTutorServiceImpl();
	
	@Override
	public void cadastrarHorario(String email, String horario, String dia)   
			throws Rep, ObjetoInexistenteException{
		Tutor t = new Tutor();
		t = definirTutorService.recuperaTutorPorEmail(email);
		t.setDiaDisponivel(dia);
		t.setHorario(horario);
	}

	@Override
	public void cadastrarLocalDeAtendimento(String email, String local) 
			throws Rep, ObjetoInexistenteException{
		Tutor t = new Tutor();
		t = definirTutorService.recuperaTutorPorEmail(email);
		t.setLocalAtendimento(local);
	}

	@Override
	public boolean consultaHorario(String email, String horario, String dia) 			
			throws Rep, ObjetoInexistenteException{ // boolean?!?! ok
		Tutor t = new Tutor();
		t = definirTutorService.recuperaTutorPorEmail(email);
		if (t.getDiaDisponivel().equals(dia) && t.getHorario().equals(horario)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean consultaLocal(String email, String local)			
			throws Rep, ObjetoInexistenteException{ // boolean?!?! ok
		Tutor t = new Tutor();
		t = definirTutorService.recuperaTutorPorEmail(email);
		if (t.getLocalAtendimento().equals(local)) {
			return true;
		}
		return false;
	}

}
