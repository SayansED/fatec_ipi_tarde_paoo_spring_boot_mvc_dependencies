package br.com.eduardo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.eduardo.model.Veiculo;
import br.com.eduardo.repository.VeiculoRepository;

@Controller
public class VeiculoController {
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	@GetMapping ("/veiculos")
	public ModelAndView listarVeiculo () {
		ModelAndView mv = new ModelAndView("veiculos");
		mv.addObject(new Veiculo());
		List<Veiculo> veiculos = veiculoRepository.findAll();
		mv.addObject("veiculos", veiculos);
		return mv;
	}
	
	@PostMapping("/veiculos")
	public String salvar (Veiculo veiculo) {
		veiculoRepository.save(veiculo);
		return "redirect:/veiculos";
	}
}