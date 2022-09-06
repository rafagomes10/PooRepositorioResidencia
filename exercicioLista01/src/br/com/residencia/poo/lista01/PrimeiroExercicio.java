package br.com.residencia.poo.lista01;

import java.util.Scanner;

public class PrimeiroExercicio {

	

	  public static void main(String[] args) {
		  
		Scanner ler = new Scanner(System.in);

	    String nome;
	    String sobrenome;
	    
	    System.out.print("Digite o seu nome:");
		nome = ler.nextLine();
		System.out.print("Digite o seu sobrenome:");
		sobrenome = ler.nextLine();
		
		System.out.println("Olá "+nome+" e seu sobrenome é "+sobrenome+" Bem vindo ao universo da programacao! ");
		
		
		ler.close();
	  }
	
	  	
	}
		

