package br.com.residencia.poo.lista01;

import java.util.Scanner;

public class SegundoExercicio {
  public static void main(String[] args) {
    int idade;
    int tempoVida = 0;
    Scanner ler = new Scanner(System.in);
 
      for(int cont = 1; cont <= 6; cont++) {
       System.out.printf("Qual a idade do seu colega " + cont + "?");
       idade = ler.nextInt();
       tempoVida += idade;
      }

   
      System.out.printf("Qual é a sua idade?");
       idade = ler.nextInt();

      tempoVida += idade;

      System.out.printf("O tempo de vida seu e de seus colegas é " + tempoVida);

      ler.close();
    
    
  }
}