package br.com.poo.modelo.contas;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String tipoConta, Integer numeroAgencia, Integer numeroConta, Double saldo, String cpf) {
		super(tipoConta, numeroAgencia, numeroConta, saldo, cpf);
	}

	@Override
	public void sacar(double valor) {
		if (valor <= 0) {
			System.out.println("O valor digitado para saque é inválido!");
		} else if (this.saldo > 0 && this.saldo >= valor) {
			this.saldo -= valor;
			// Usamos printf para limitar as casas decimais
			System.out.println("\nOperação realizada com sucesso!\n");
			System.out.printf("Valor sacado: R$%.2f", valor, "\n");
			System.out.printf("Saldo atual: R$%.2f", this.saldo, "\n");
			// LeituraEscrita.comprovanteSaque(funcionario, valor);
		} else {
			System.out.println("Valor digitado excede o saldo disponível!");
		}
	}

	@Override
	public void depositar(double valor) {
	}

	@Override
	public void transferir(Conta destino, double valor) {
	}

	// cálculo da previsao de rendimento mediante um valor qualquer
	public void previsaoDeRendimento(double valor, int dias) {
		double valorRendimento = (valor * 0.2) * dias;
		System.out.printf("\nO rendimento estimado daqui a " + dias + " dias será de: R$%.2f", valorRendimento);
		System.out.printf("\nO valor total será de: R$%.2f", valorRendimento + valor);
	}
	
}
