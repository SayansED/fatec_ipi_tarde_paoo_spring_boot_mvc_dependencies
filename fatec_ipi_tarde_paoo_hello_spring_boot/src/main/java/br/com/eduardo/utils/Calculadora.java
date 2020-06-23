package br.com.eduardo.utils;

public class Calculadora {
	
	public double calculaMedia (double... notas) {
		double soma = 0;
		for (double d: notas) {
			soma += d;
		}
		return soma / notas.length;
	}
	
	
}
