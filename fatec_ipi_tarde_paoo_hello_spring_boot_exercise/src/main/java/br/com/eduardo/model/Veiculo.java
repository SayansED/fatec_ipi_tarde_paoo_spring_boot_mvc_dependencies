package br.com.eduardo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veiculo implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	private String marca;
	private String modelo;
	private int ano_fabricacao;
	private String cor;
	private double qtd_Litros_Tanque;
	private double qtd_Km_Rodado;
	private double autonomia_Veiculo;
	
	public double getAutonomiaVeiculo() {
		return autonomia_Veiculo;
	}
	public void setAutonomiaVeiculo(double autonomiaVeiculo) {
		this.autonomia_Veiculo = autonomiaVeiculo;
	}
	public double getQtdLitrosTanque() {
		return qtd_Litros_Tanque;
	}
	public void setQtdLitrosTanque(double qtdLitrosTanque) {
		this.qtd_Litros_Tanque = qtdLitrosTanque;
	}
	public double getQtdKmRodado() {
		return qtd_Km_Rodado;
	}
	public void setQtdKmRodado(double qtdKmRodado) {
		this.qtd_Km_Rodado = qtdKmRodado;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno_fabricacao() {
		return ano_fabricacao;
	}
	public void setAno_fabricacao(int ano_fabricacao) {
		this.ano_fabricacao = ano_fabricacao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
}