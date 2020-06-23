package br.com.eduardo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.eduardo.utils.Calculadora;

@Configuration
public class AppConfig{
	
	@Bean
	public Calculadora getCalculadora () {
		return new Calculadora();
	}

}
