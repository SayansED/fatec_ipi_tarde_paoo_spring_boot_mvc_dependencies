package br.com.eduardo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.eduardo.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{ // CRUD and +
	
	public Usuario findOneByLoginAndSenha (String login, String senha); // Buscandos
}
