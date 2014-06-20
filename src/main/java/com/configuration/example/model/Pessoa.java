package com.configuration.example.model;

public class Pessoa {

	private String nome;
	private int idade;

	public Pessoa() {
	}

	public Pessoa(String nome, int idade) {
		this.setNome(nome);
		this.setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String toString() {
		return this.getNome() + " | " + this.getIdade();
	}

}
