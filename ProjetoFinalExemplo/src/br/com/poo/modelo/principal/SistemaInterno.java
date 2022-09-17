package br.com.poo.modelo.principal;

import java.io.IOException;

import br.com.poo.modelo.IO.LeituraEscrita;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {

			LeituraEscrita.leitor("dados");

			Principal principal = new Principal();
			principal.menuInterativo();
	}

}
