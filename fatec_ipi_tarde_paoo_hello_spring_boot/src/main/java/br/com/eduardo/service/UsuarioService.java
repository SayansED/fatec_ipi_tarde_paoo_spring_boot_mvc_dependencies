package br.com.eduardo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eduardo.model.Usuario;
import br.com.eduardo.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRespo;
	
	public boolean existe (Usuario usuario) {
		return usuarioRespo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
	}
}
