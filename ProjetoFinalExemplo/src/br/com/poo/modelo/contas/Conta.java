package br.com.poo.modelo.contas;

import java.util.HashMap;
import java.util.Map;

public abstract class Conta {
	protected String tipoConta;
	protected Integer numeroAgencia;
	protected Integer numeroConta;
	protected Double saldo;
	protected String cpf;

	public static Map<String, Conta> mapaContas = new HashMap<>();
	
	public Conta() {
	}

	public Conta(String tipoConta, Integer numeroAgencia, 
			Integer numeroConta, Double saldo, String cpf) {
		this.tipoConta = tipoConta;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.cpf = cpf;
	}

	public String getTipoConta() {
		return this.tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public Integer getNumeroAgencia() {
		return this.numeroAgencia;
	}

	public void setNumeroAgencia(Integer numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public Integer getNumeroConta() {
		return this.numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public abstract void sacar(double valor);

	public abstract void depositar(double valor);

	public abstract void transferir(Conta destino, double valor);
	
}
