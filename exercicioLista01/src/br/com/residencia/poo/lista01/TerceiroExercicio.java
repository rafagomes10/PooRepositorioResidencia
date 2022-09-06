package br.com.residencia.poo.lista01;

import java.util.Scanner;

public class TerceiroExercicio {
	public static void main(String[] args) {
		Double num1, num2;
		Double soma, multiplicacao, divisao, subtracao;
		var ler = new Scanner(System.in);

		System.out.println("Digite o primeiro número:");

		num1 = ler.nextDouble();

		System.out.println("Digite o segundo número:");
		num2 = ler.nextDouble();

		soma = num1 + num2;
		subtracao = num1 - num2;
		multiplicacao = num1 * num2;
		divisao = num1 / num2;

		ler.close();

		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");

		System.out.println("A soma é: " + soma);
		System.out.println("A subtração é: " + subtracao);
		System.out.println("A multiplacação é: " + multiplicacao);

		if (num1 <= 0 || num2 <= 0) {
			System.out.println("Não foi possível fazer essa divisão");
		} else {
			System.out.println("A divisão é: " + divisao);
		}

	}
}