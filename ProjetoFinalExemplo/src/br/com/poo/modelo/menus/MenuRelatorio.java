package br.com.poo.modelo.menus;

import java.io.IOException;

import br.com.poo.modelo.IO.LeituraEscrita;
import br.com.poo.modelo.contas.Conta;
import br.com.poo.modelo.contas.ContaCorrente;
import br.com.poo.modelo.contas.ContaPoupanca;
import br.com.poo.modelo.enums.ContaEnum;
import br.com.poo.modelo.enums.PessoaEnum;
import br.com.poo.modelo.pessoas.Funcionario;
import br.com.poo.modelo.principal.Principal;
import br.com.poo.modelo.tributos.Tributo;

public class MenuRelatorio {

	int teste;
	int operacao;
	Principal principal = new Principal();
	MenuPrincipal menuPrincipal = new MenuPrincipal();

	public static void menuRelatorio(Integer idFuncionario, Funcionario funcionario, Conta conta) throws IOException {
//		if (conta.getTipoConta().equalsIgnoreCase(ContaEnum.CORRENTE.getTipoConta())) {
//			System.out.println("[1]\tTributação conta corrente");
//		} else {
//			System.out.println("[1]\tSimulação de rendimento");
//		}
		
		if (idFuncionario >= 1) {
			System.out.println("[2]\tNúmero de contas da sua agencia");
			if (idFuncionario >= 2) {
				System.out.println("[3]\tInformações de Nome, CPF e Agência de todos os clientes");
			}
		}
		
		System.out.println("[4]\tVoltar");
		imprimeLinhaHorizontal();

		System.out.print("Digite a opção desejada: ");
		int operacao = Principal.sc.nextInt();

		switch (operacao) {
		case 1:
			if (conta.getTipoConta().equalsIgnoreCase(ContaEnum.CORRENTE.getTipoConta())) {
				System.out.printf("O total gasto com operações foi de R$%.2f",
						((ContaCorrente) conta).getTotalTributado());
				System.out.printf("\nO valor cobrado para cada saque é de R$ %.2f", Tributo.SAQUE);
				System.out.println("\nTotal de saques realizados: " + ((ContaCorrente) conta).getTotalSaques());
				LeituraEscrita.relatorioTributacaoContaCorrente(conta);
			} else {
				int inputDias;
				double inputValor;
				System.out.println("Digite o valor que deseja usar para a simulação: ");
				inputValor = Double.parseDouble(Principal.sc.next());
				System.out.println("Digite o número de dias para a simulação: ");
				inputDias = Principal.sc.nextInt();
				((ContaPoupanca) conta).previsaoDeRendimento(inputValor, inputDias);
//				LeituraEscrita.relatorioRendimentoPoupanca(conta, inputValor, inputDias);
			}
			selecaoRelatorio(conta, funcionario);
			break;
		case 2:
			int total = 0;
			for (String cpf : Conta.mapaContas.keySet()) {
				if (Conta.mapaContas.get(cpf).getNumeroAgencia().equals(conta.getNumeroAgencia())) {
					System.out.println(Conta.mapaContas.get(cpf));
					total++;
				}
			}
			System.out.println("Total de contas: " + total);
//			LeituraEscrita.relatorioContasPorAgencia(conta);
			selecaoRelatorio(conta, funcionario);
			break;
		case 3:
			for (String nome : Funcionario.OrdenaFuncionarios.keySet()) {
				System.out.println(((Funcionario) Funcionario.OrdenaFuncionarios.get(nome)).relatorioInformacoes());
			}
//			LeituraEscrita.relatorioTotalClientes(conta, Funcionario.OrdenaFuncionarios);
			selecaoRelatorio(conta, funcionario);
			break;
		case 4:
			MenuPrincipal.menuPrincipal(funcionario, conta);
			break;
		default:
			System.out.println("Opção inválida!");
			selecaoRelatorio(conta, funcionario);
		}
	}

	public static void selecaoRelatorio(Conta conta, Funcionario funcionario) throws IOException {
		if (funcionario.getTipoFuncionario().equalsIgnoreCase(PessoaEnum.GERENTE.getTipoPessoa())) {
			MenuRelatorio.menuRelatorio(PessoaEnum.GERENTE.getIdTipoPessoa(), funcionario, conta);
		} else if (funcionario.getTipoFuncionario().equalsIgnoreCase(PessoaEnum.DIRETOR.getTipoPessoa())) {
			MenuRelatorio.menuRelatorio(PessoaEnum.DIRETOR.getIdTipoPessoa(), funcionario, conta);
		}
	}

	public static void imprimeLinhaHorizontal() {
		System.out.println("--------------------------------------------------");
	}
	
}
