package exercicioExemplo;

import java.util.Scanner;
public class TerceiroExercico {
  public static void main(String[] args) {
    String nome;
      int idade;
    try (Scanner ler = new Scanner(System.in)) {
      

      System.out.printf("Qual é o seu nome?\n");
      nome = ler.nextLine();
 
      // It's asking for the user's age and storing it in the variable `idade`.
      System.out.printf("Qual é sua idade?\n");
      idade = ler.nextInt();
      
     
    }
    System.out.printf("Seu nome é " + nome + " e sua idade é " + idade);

  }
}
