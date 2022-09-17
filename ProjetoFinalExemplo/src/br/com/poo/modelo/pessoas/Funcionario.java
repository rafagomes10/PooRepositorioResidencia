package br.com.poo.modelo.pessoas;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public abstract class Funcionario implements Comparable<Funcionario> {

	protected String tipoFuncionario;
	protected String nome;
	protected String cpf;
	protected String senha;
	protected Integer agencia;
	protected Integer numeroConta;
	protected Double salario;

	public static Map<String, Funcionario> mapaFuncionarios = new HashMap<>();
	public static TreeMap<String, Funcionario> OrdenaFuncionarios = new TreeMap<>();

	public Funcionario() {
	}

	public Funcionario(String tipoFuncionario, String nome, String cpf, String senha, Integer agencia, Integer numeroConta, Double salario) {
		this.nome = nome;
		this.tipoFuncionario = tipoFuncionario;
		this.cpf = cpf;
		this.senha = senha;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.salario = salario;
	}

	public String getTipoFuncionario() {
		return this.tipoFuncionario;
	}

	public void setTipoFuncionario(String tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getAgencia() {
		return this.agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getNumeroConta() {
		return this.numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public int compareTo(Funcionario outroFuncionario) {
		return this.nome.compareTo(outroFuncionario.getNome());
	}

	public String relatorioInformacoes() {
		return "Nome: " + this.nome + "\t CPF: " + this.cpf + "\tAgencia: " + this.agencia;
	}

}
