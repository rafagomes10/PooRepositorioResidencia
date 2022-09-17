package br.com.poo.modelo.enums;

public enum PessoaEnum {

	GERENTE("gerente", 1), 
	DIRETOR("diretor", 2);

	private final Integer idTipoPessoa;
	private final String tipoPessoa;

	PessoaEnum(String tipoPessoa, Integer idTipoPessoa) {
		this.tipoPessoa = tipoPessoa;
		this.idTipoPessoa = idTipoPessoa;
	}

	public String getTipoPessoa() {
		return this.tipoPessoa;
	}

	public Integer getIdTipoPessoa() {
		return this.idTipoPessoa;
	}
	
}
