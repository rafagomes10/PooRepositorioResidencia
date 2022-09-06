package exercicioExemplo;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome, disciplina;
		
		int idade;
		double media,nota, totalNotas = 0.0;
		
		System.out.print("Digite o seu nome:");
		nome = ler.nextLine();
		System.out.print("Digite a sua idade:");
		idade = ler.nextInt();
		System.out.print("Qual é a disciplina:");
		disciplina = ler.next();
		
		for(int cont = 1; cont <= 3; cont++) {
			System.out.println("Insira a nota " + cont + ": ");
			nota = ler.nextDouble();
			totalNotas += nota;
		}
			media = totalNotas/3;
			System.out.println("Olá, "+nome+" você tem "+idade+" anos!");
			System.out.println("Na disciplina "+disciplina+" a média é: "+media);
		
			ler.close();
		
		}
		
}


