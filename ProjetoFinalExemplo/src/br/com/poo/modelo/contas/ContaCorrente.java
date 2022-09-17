package br.com.poo.modelo.contas;

import br.com.poo.modelo.tributos.Tributo;

public class ContaCorrente extends Conta implements Tributo {

	private Integer totalSaques = 0;
	private Double totalTributado = 0.0;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String tipoConta, Integer numeroAgencia, Integer numeroConta, Double saldo, String cpf) {
		super(tipoConta, numeroAgencia, numeroConta, saldo, cpf);
	}

	public Integer getTotalSaques() {
		return this.totalSaques;
	}

	public Double getTotalTributado() {
		return this.totalTributado;
	}
	
	@Override
	public void sacar(double valor) {
		if (valor < 0) {
			System.out.println("O valor digitado para saque é inválido!");
		} else {
			double valorTributado = tributarSaque(valor);
			if (this.saldo - valorTributado >= 0) {
				this.saldo -= valorTributado;
				this.totalTributado += Tributo.SAQUE;
				// Usamos printf para limitar as casas decimais
				System.out.println("\nOperação realizada com sucesso!\n");
				System.out.printf("Valor sacado: R$%.2f", valor, "\n");
				System.out.printf("Taxa para saque: R$%.2f", Tributo.SAQUE, "\n");
				System.out.printf("Saldo atual: R$%.2f", this.saldo, "\n");
				++totalSaques;
			} else {
				System.out.println("Valor digitado excede o saldo disponível!");
			}
		}
	}

	@Override
	public double tributarSaque(double valor) {
		return valor + Tributo.SAQUE;
	}
	
	@Override
	public void depositar(double valor) {
	}
	
	@Override
	public double tributarDeposito(double valor) {
		return 0;
	}
	
	@Override
	public void transferir(Conta destino, double valor) {
	}

	@Override
	public double tributarTransferencia(double valor) {
		return 0;
	}

	@Override
	public String toString() {
		return "Conta Corrente\tNúmero da Agência = " + this.numeroAgencia + "\tNúmero da Conta = "
				+ this.numeroConta + "\tSaldo = " + this.saldo + "\tCPF = " + this.cpf + "\n";
	}

}
