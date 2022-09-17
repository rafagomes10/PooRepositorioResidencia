package br.com.poo.modelo.enums;

public enum ContaEnum {

	CORRENTE("corrente", 1),
	POUPANCA("poupanca", 2);

	private final String tipoConta;
	private final Integer idTipoConta;

	ContaEnum(String tipoConta, Integer idTipoConta) {
		this.tipoConta = tipoConta;
		this.idTipoConta = idTipoConta;
	}

	public String getTipoConta() {
		return this.tipoConta;
	}

	public Integer getIdTipoConta() {
		return this.idTipoConta;
	}
}
