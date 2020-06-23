package br.com.eduardo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aluno implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	//private Double mediaNotas; // media_notas
	private Double nota1;
	private Double nota2;
	private Double mediaFinal;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public Double getMediaFinal() {
		return mediaFinal;
	}
	public void setMediaFinal(Double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}
	
	
}
