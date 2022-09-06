package br.com.residencia.poo.lista01;

import java.util.Scanner;

public class QuartoExercicio {
	public static void main(String[] args) {
		double C, F;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite uma temperatura em Celsius:");
		C = ler.nextDouble();
		F = C * 1.8 + 32;

		System.out.println("A temperatura em Fahrenheit é: " + F);

		ler.close();
	}
}