package br.com.residencia.poo.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeituraEscrita {

	static final String PATH_BASICO = "./temp1/";
	static final String EXTENSAO = ".txt";

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));
		String linha = "";
		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				System.out.println(linha);
			} else {
				break;
			}
		}
		buffRead.close();
	}

	
	
	
	public static void escritor() throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o nome do arquivo: ");
		String nome = sc.next();

		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(PATH_BASICO + nome));
		String linha = "";

		System.out.println("Escreva algo: ");
		linha = sc.next();
		buffWrite.append(linha + "\n");
		buffWrite.close();
		sc.close();
	}

}
