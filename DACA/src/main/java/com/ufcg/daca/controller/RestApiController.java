package com.ufcg.daca.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.ufcg.daca.model.Ajuda;
import com.ufcg.daca.model.Aluno;
import com.ufcg.daca.model.Tutor;
import com.ufcg.daca.service.AvaliarTutorServiceImpl;
import com.ufcg.daca.service.CadastrarAlunoServiceImpl;
import com.ufcg.daca.service.CadastrarPedidoAjudaServiceImpl;
import com.ufcg.daca.service.DefinirTutorServiceImpl;
import com.ufcg.daca.service.DisponibilizarHorarioServiceImpl;
import com.ufcg.daca.service.DoarServiceImpl;
import com.ufcg.daca.util.CustomErrorType;

import exceptions.ObjetoInexistenteException;
import exceptions.ObjetoInvalidoException;
import exceptions.ObjetoJaExistenteException;
import exceptions.Rep;


@RestController
@RequestMapping("/api")
@CrossOrigin

public class RestApiController {
	
	AvaliarTutorServiceImpl atService = new AvaliarTutorServiceImpl();
	CadastrarAlunoServiceImpl caService = new CadastrarAlunoServiceImpl();
	CadastrarPedidoAjudaServiceImpl cpService = new CadastrarPedidoAjudaServiceImpl();
	DefinirTutorServiceImpl dtService = new DefinirTutorServiceImpl();
	DisponibilizarHorarioServiceImpl dhService = new DisponibilizarHorarioServiceImpl();
	DoarServiceImpl doarService = new DoarServiceImpl();
	
	// Pedido
	
    @RequestMapping(value = "/pedido/", method = RequestMethod.POST)
    public ResponseEntity<?> CriarPedidoPresencial(@RequestBody Ajuda a, UriComponentsBuilder ucBuilder) throws ObjetoInexistenteException {
    	try {
			cpService.pedirAjudaPresencial(a.getAluno().getMatricula(), a.getDisciplina(),
					a.getHorario(), a.getDia(), a.getLocal());
		} catch (Rep e) {
			return new ResponseEntity<List>(HttpStatus.BAD_REQUEST);
		}
        return new ResponseEntity<Ajuda>(a, HttpStatus.CREATED);
    }
    	
    	
    @RequestMapping(value = "/pedido/", method = RequestMethod.POST)
    public ResponseEntity<?> CriarPedidoOnline(@RequestBody Ajuda a, UriComponentsBuilder ucBuilder) throws ObjetoInexistenteException {
    	try {
    		cpService.pedirAjudaOnline(a.getAluno().getMatricula(), a.getDisciplina());
    	} catch (Rep e) {
    		return new ResponseEntity<List>(HttpStatus.BAD_REQUEST);
    	}
        return new ResponseEntity<Ajuda>(a, HttpStatus.CREATED);
    }
		
    @SuppressWarnings("unchecked")
	@RequestMapping(value = "/pedido/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> consultarPedido(@PathVariable("id") int id) throws ObjetoInexistenteException {

        Ajuda a = cpService.getPedidoPorId(id);
        if (a == null) {
            return new ResponseEntity(new CustomErrorType("Pedido with id " + id
                    + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Ajuda>(a, HttpStatus.OK);
    }
    
    // Aluno
    
    @RequestMapping(value = "/aluno/", method = RequestMethod.POST)
    public ResponseEntity<?> cadastrarAluno(@RequestBody Aluno a, UriComponentsBuilder ucBuilder) throws ObjetoInexistenteException, ObjetoJaExistenteException {
    	caService.cadastrarAluno(a.getNome(), a.getMatricula(), a.getCodigoCurso(),
				a.getTelefone(), a.getEmail());
        return new ResponseEntity<Aluno>(a, HttpStatus.CREATED);
    }
    
    @SuppressWarnings("unchecked")
	@RequestMapping(value = "/aluno/{matricula}", method = RequestMethod.GET)
    public ResponseEntity<?> consultarAluno(@PathVariable("matricula") String matricula) throws ObjetoInexistenteException, Rep {

        Aluno a = caService.getAlunoPorMatricula(matricula);
        if (a == null) {
            return new ResponseEntity(new CustomErrorType("Aluno with matricula " + matricula
                    + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Aluno>(a, HttpStatus.OK);
    }
    
    // Cadastrar Tutor

    @RequestMapping(value = "/tutor/", method = RequestMethod.POST)
    public ResponseEntity<?> cadastrarTutor(@RequestBody Tutor t, UriComponentsBuilder ucBuilder) throws ObjetoInexistenteException, ObjetoJaExistenteException, ObjetoInvalidoException, Rep {
    	dtService.tornarTutor(t.getMatricula(), t.getDisciplina(), t.getProeficiencia(), 
				t.getHorario(), t.getDiaDisponivel(), t.getLocalAtendimento());
        return new ResponseEntity<Tutor>(t, HttpStatus.CREATED);
    }
    
    @SuppressWarnings("unchecked")
	@RequestMapping(value = "/tutor/{matricula}", method = RequestMethod.GET)
    public ResponseEntity<?> consultarTutor(@PathVariable("matricula") String matricula) throws ObjetoInexistenteException, Rep {

        Tutor t = dtService.getTutorPorMatricula(matricula);
        if (t == null) {
            return new ResponseEntity(new CustomErrorType("Tutor with matricula " + matricula
                    + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Tutor>(t, HttpStatus.OK);
    }
    
    // Avaliar Tutor
    
    @RequestMapping(value = "/tutor/", method = RequestMethod.POST)
    public ResponseEntity<?> AvaliarTutor(@RequestBody int id, double nota, UriComponentsBuilder ucBuilder) throws ObjetoInexistenteException, ObjetoJaExistenteException, ObjetoInvalidoException, Rep {
    	String result = atService.avaliarTutor(id, nota);
        return new ResponseEntity<String>(result, HttpStatus.CREATED);
    }
    
    @SuppressWarnings("unchecked")
	@RequestMapping(value = "/tutor/{matricula}", method = RequestMethod.GET)
    public ResponseEntity<?> consultarNota(@PathVariable("matricula") String matricula) throws ObjetoInexistenteException, Rep {

        Tutor t = dtService.getTutorPorMatricula(matricula);
        if (t == null) {
            return new ResponseEntity(new CustomErrorType("Tutor with matricula " + matricula
                    + " not found"), HttpStatus.NOT_FOUND);
        }
        double nota = t.getNota();
        return new ResponseEntity<Double>(nota, HttpStatus.OK);
    }
    
    @SuppressWarnings("unchecked")
	@RequestMapping(value = "/tutor/{matricula}", method = RequestMethod.GET)
    public ResponseEntity<?> consultarNivel(@PathVariable("matricula") String matricula) throws ObjetoInexistenteException, Rep {
    	
        Tutor t = dtService.getTutorPorMatricula(matricula);
        if (t == null) {
            return new ResponseEntity(new CustomErrorType("Tutor with matricula " + matricula
                    + " not found"), HttpStatus.NOT_FOUND);
        }
        String nivel = t.getNivel();
        
        return new ResponseEntity<String>(nivel, HttpStatus.OK);
    }
    
    // Fazer doacao
    
    @RequestMapping(value = "/tutor/", method = RequestMethod.POST)
    public ResponseEntity<?> Doar(@RequestBody String matriculaTutor, int totalCentavos, UriComponentsBuilder ucBuilder) throws ObjetoInexistenteException, ObjetoJaExistenteException, ObjetoInvalidoException, Rep {
        Tutor t = dtService.getTutorPorMatricula(matriculaTutor);
        if (t == null) {
            return new ResponseEntity(new CustomErrorType("Tutor with matricula " + matriculaTutor
                    + " not found"), HttpStatus.NOT_FOUND);
        }
    	doarService.doar(matriculaTutor, totalCentavos);
    	String result = "Doado com sucesso :)";
        return new ResponseEntity<String>(result, HttpStatus.CREATED);
    }
    
    @SuppressWarnings("unchecked")
	@RequestMapping(value = "/tutor/{matricula}", method = RequestMethod.GET)
    public ResponseEntity<?> consultarDinheiro(@PathVariable("matricula") String matricula) throws ObjetoInexistenteException, Rep {
    	
        Tutor t = dtService.getTutorPorMatricula(matricula);
        if (t == null) {
            return new ResponseEntity(new CustomErrorType("Tutor with matricula " + matricula
                    + " not found"), HttpStatus.NOT_FOUND);
        }
        double dinheiro =  t.getDinheiro();
        String result = "" + dinheiro;
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }
    
    @SuppressWarnings("unchecked")
	@RequestMapping(value = "/tutor/{matricula}", method = RequestMethod.GET)
    public ResponseEntity<?> consultarDinheiroTot() throws ObjetoInexistenteException, Rep {
    	
    	double dinheiro = doarService.totalDinheiroSistema();
        String result = "" + dinheiro;
        
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }
    
    // Horarios
 
    @RequestMapping(value = "/horario/{email,local}", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarLocal(@RequestBody String email, String local, UriComponentsBuilder ucBuilder) throws ObjetoInexistenteException, ObjetoJaExistenteException, ObjetoInvalidoException, Rep {
        Tutor t = dtService.recuperaTutorPorEmail(email);
        if (t == null) {
            return new ResponseEntity(new CustomErrorType("Tutor with matricula " + email
                    + " not found"), HttpStatus.NOT_FOUND);
        }

    	String result = t.getLocalAtendimento();
        return new ResponseEntity<String>(result, HttpStatus.CREATED);
    }   
    
    @RequestMapping(value = "/horario/{email,horario,dia}", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarHorario(@RequestBody String email, String horario, String dia, UriComponentsBuilder ucBuilder) throws ObjetoInexistenteException, ObjetoJaExistenteException, ObjetoInvalidoException, Rep {
        Tutor t = dtService.recuperaTutorPorEmail(email);
        if (t == null) {
            return new ResponseEntity(new CustomErrorType("Tutor with matricula " + email
                    + " not found"), HttpStatus.NOT_FOUND);
        }

    	String result1 = t.getHorario();
    	String result2 = t.getDiaDisponivel();
    	String result3 = "Tutor diponível as " + result1 + " em " + result2;
        return new ResponseEntity<String>(result3, HttpStatus.CREATED);
    }   
    
	
}
	
