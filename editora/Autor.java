package com.editora;

public class Autor {
	private String nome;
	private String email;
	private String nacionalidade;

	// Construtores

	public Autor() {

	}

	public Autor(String nome, String email, String nacionalidade) {
		super();
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
	}

	// Get e Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	void info() {
		System.out.println("Nome: " + nome + "\nEmail: " + email + "\nNacionalidade: " + nacionalidade);
	}

}
