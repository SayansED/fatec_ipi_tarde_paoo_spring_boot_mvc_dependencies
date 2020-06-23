package br.com.eduardo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.eduardo.model.Aluno;
import br.com.eduardo.service.AlunosService;

@Controller
public class AlunosController {
	
	/*@Autowired // injeção de dependencia
	private AlunosRepository alunosrespo;*/
	
	@Autowired
	private AlunosService alunosService;
	
	@GetMapping ("/alunos")
	public ModelAndView listarAlunos () {
		//List <Aluno> alunos = alunosrespo.findAll();
		List <Aluno> alunos = alunosService.listarTodos();
		ModelAndView mv = new ModelAndView("alunos");
		mv.addObject(new Aluno());
		mv.addObject("alunos", alunos);
		return mv;
	}
	
	@PostMapping ("/alunos")
	public String salvar (Aluno aluno) {
		//alunosrespo.save(aluno);
		alunosService.salvar(aluno);
		return "redirect:/alunos";
	}
}
