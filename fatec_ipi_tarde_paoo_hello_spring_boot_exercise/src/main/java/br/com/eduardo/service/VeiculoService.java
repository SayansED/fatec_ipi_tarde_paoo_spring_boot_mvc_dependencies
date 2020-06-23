package br.com.eduardo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eduardo.model.Veiculo;
import br.com.eduardo.repository.VeiculoRepository;
import br.com.eduardo.utils.Calculadora;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository veiculoRespo;
	
	@Autowired
	private Calculadora calculadora;
	
	public List <Veiculo> listarTodos () {
		List <Veiculo> veiculos = veiculoRespo.findAll();
		for (Veiculo veiculo : veiculos) {
			veiculo.setAutonomiaVeiculo(calculadora.autonomiaVeiculo(veiculo.getQtdKmRodado(), veiculo.getQtdLitrosTanque()));
		}
		return veiculos;
	}
}
