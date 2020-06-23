package br.com.eduardo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eduardo.model.Aluno;
import br.com.eduardo.repository.AlunosRepository;
import br.com.eduardo.utils.Calculadora;

@Service
public class AlunosService {
	
	@Autowired
	private AlunosRepository alunosRespo;
	
	@Autowired
	private Calculadora calculadora;
	
	public void salvar (Aluno aluno) {
		alunosRespo.save(aluno);
	}
	
	public List <Aluno> listarTodos () {
		List <Aluno> alunos = alunosRespo.findAll();
		for (Aluno aluno : alunos) {
			aluno.setMediaFinal(calculadora.calculaMedia(aluno.getNota1(), aluno.getNota2()));
		}
		return alunos;
	}
}