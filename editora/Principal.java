package com.editora;

import java.util.Locale;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// Autor
		Autor autor = new Autor("Homer Simpsons", "contato@homer.com", "Americano");

		// Livro digital
		LivroDigital digital = new LivroDigital(200, 1300, "Os simpsons", autor, "Comédia", 2);
		digital.info();

	}

}
