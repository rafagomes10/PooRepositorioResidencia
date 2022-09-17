package br.com.poo.modelo.pessoas;

public class Diretor extends Funcionario {

	public Diretor() {
		super();
	}

	public Diretor(String tipoUsuario, String nome, String cpf, String senha, Integer agencia,
			Integer numeroConta, Double salario) {
		super(tipoUsuario, nome, cpf, senha, agencia, numeroConta, salario);
	}

}
