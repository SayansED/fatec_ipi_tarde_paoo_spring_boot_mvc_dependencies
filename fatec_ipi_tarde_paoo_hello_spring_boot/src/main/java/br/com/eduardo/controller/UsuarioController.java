package br.com.eduardo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.eduardo.model.Usuario;
import br.com.eduardo.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping (value = {"/login", "/"})
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.addObject(new Usuario());
		return mv;
	}
	
	@PostMapping ("/fazerLogin")
	public String fazerLogin (HttpServletRequest request ,Usuario usuario) {
		if (usuarioService.existe(usuario)) {
			request.getSession().setAttribute("usuarioLogado", usuario);
			return "redirect:/alunos";
		}
		else
			return "login";
	}
	
}
