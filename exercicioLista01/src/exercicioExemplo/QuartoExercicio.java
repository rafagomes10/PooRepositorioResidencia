package exercicioExemplo;

import java.util.Scanner;

public class QuartoExercicio {
	public static void main(String[] args) {
		Double nota;
		Double totalNotas = 0.0;
		Double media;
		String nome, disciplina;
		try (Scanner ler = new Scanner(System.in)) {
			System.out.printf("Digite seu nome: ");
			nome = ler.nextLine();

			System.out.printf("Digite sua disciplina: ");
			disciplina = ler.nextLine();

			for (int cont = 1; cont <= 3; cont++) {
				System.out.printf("Insira a nota " + cont + ": ");
				nota = ler.nextDouble();
				totalNotas += nota;
			}
		}

		media = totalNotas / 3;
		System.out.printf("Olá " + nome + "\n");
		System.out.printf("Sua média na disciplina " + disciplina + " foi: " + media);
	}

}