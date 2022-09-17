package br.com.poo.modelo.menus;

import java.io.IOException;

import br.com.poo.modelo.IO.LeituraEscrita;
import br.com.poo.modelo.contas.Conta;
import br.com.poo.modelo.enums.PessoaEnum;
import br.com.poo.modelo.pessoas.Funcionario;
import br.com.poo.modelo.principal.Principal;

public class MenuPrincipal {

	double inputValor;
	static String inputCpf;
	int operacao;

	public static void menuPrincipal(Funcionario funcionario, Conta conta) throws IOException {
		Principal principal = new Principal();

		try {
			System.out.println("[1]\tSaque");
			System.out.println("[2]\tDeposito");
			System.out.println("[3]\tTransferência");
			System.out.println("[4]\tSaldo");
			System.out.println("[5]\tRelatório");
			System.out.println("[6]\tSair");
			principal.imprimeLinhaHorizontal();
			System.out.print("Digite a opção desejada: ");
			int opcaoOperacao = Principal.sc.nextInt();
			Double inputValor;

			switch (opcaoOperacao) {
			case 1:
				principal.imprimeLinhaHorizontal();
				System.out.print("Digite o valor que deseja sacar: ");
				inputValor = Double.parseDouble(Principal.sc.next());
				conta.sacar(inputValor);
				LeituraEscrita.comprovanteSaque(conta, inputValor);
				break;
			case 2:
//				depositar
				break;
			case 3:
//				transferir
				break;
			case 4:
				System.out.printf("Seu saldo é: R$%.2f", conta.getSaldo());
				LeituraEscrita.comprovanteSaldo(conta);
				break;
			case 5:
				if (funcionario.getTipoFuncionario().equalsIgnoreCase(PessoaEnum.GERENTE.getTipoPessoa())) {
					MenuRelatorio.menuRelatorio(PessoaEnum.GERENTE.getIdTipoPessoa(), funcionario, conta);
				} else if (funcionario.getTipoFuncionario().equalsIgnoreCase(PessoaEnum.DIRETOR.getTipoPessoa())) {
					MenuRelatorio.menuRelatorio(PessoaEnum.DIRETOR.getIdTipoPessoa(), funcionario, conta);
				}
				break;
			case 6:
				principal.menuInterativo();
				break;
			default:
				System.out.println("Opção inválida!");
			}

			menuPrincipal(funcionario, conta);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			menuPrincipal(funcionario, conta);
		}
	}
}
