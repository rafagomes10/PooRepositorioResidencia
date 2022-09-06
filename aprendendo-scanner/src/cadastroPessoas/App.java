package cadastroPessoas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		System.out.println("********************************");
		System.out.println("****** Aprendendo Scanner ******");
		System.out.println("********************************");
		System.out.println();
		
		/*
		
		// Criando uma instancia do objeto scanner.
		// Aqui eu crio o objeto scanner
		
		var sc = new Scanner(System.in);
				
		System.err.print("digite o seu nome:");
		
		//Aqui eu estou capturando o que o usuario digitou como String.
		
		String nome = sc.nextLine();
		
		System.out.println("Prazer Sr(a) "+nome);
		
		
		/*
		 * Tipos de caputra de scanner
		 * 
		 * String  nome = sc.nextLine();
		 * int     num1 = sc.nextInt();
		 * long    num2 = sc.nextLong();
		 * double  num3 = sc.nextDouble();
		 * float   num4 = sc.nextFloat();
		 * boolean logico = sc.nextBoolean();
		 * byte    byte1 = sc.nextByte();
		 * 
		 * var teste = sc.next();
		 * 
		 * 
		 */
		
		File arquivo = new File("C:\\Users\\Administrator\\Documents\\workspace-spring-tool-suite-4-4.15.3.RELEASE\\aprendendo-scanner\\src\\cadastroPessoas\\teste.txt");
		Scanner sc = new Scanner(arquivo);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();
		
	}	
	

}
