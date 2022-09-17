package br.com.residencia.poo.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
//		double n1 = 1.0;
//		double n2 = 2.0;
//		double n3 = 3.0;
//		double n4 = 4.0;
//		
//		int tamanho = 4;
//		double[] arrayDouble;
//		arrayDouble = new double[tamanho];
//		
//		for(int i = 0; i < tamanho; i++) {
//			arrayDouble[i] = i * tamanho;
//		}
//		
//		for(int i = 0; i < arrayDouble.length; i++) {
//			System.out.println("*");
//		}
		
	List lista = new ArrayList();
	lista.add("Vinicius");
	lista.add("Grazi");
	lista.add("Breno");
	lista.add("Quezia");
//	System.out.println(lista);
//	System.out.println(lista.size());
//	System.out.println(lista.remove(0));
//	System.out.println(lista.get(1));
//	System.out.println(lista);
//	System.out.println(lista.isEmpty());

	Collections.sort(lista);
	System.out.println(lista);
	
//		Scanner nome = new Scanner(System.in);
//		System.out.println("Digite o tipo de pessoa: ");
//		String teste = nome.next();
//		nome.close();
//		PessoasEnum assistente = PessoasEnum.ASSISTENTE;
//		PessoasEnum diretor = PessoasEnum.DIRETOR;
//		
//		//comparacao entre numeros -> ==
//		//comparacao entre strings -> .equals()
//		if(teste.equals(diretor.name())) {
//			System.out.println("Tipo de pessoa é " + diretor.name());
//		} else if(teste.equalsIgnoreCase(assistente.name())) {
//			System.out.println("Tipo de pessoa é " + assistente.name());
//		} else {
//			System.out.println("Algo deu errado!");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
////		Datas e horas - Date
//		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
//		Date data = new Date();
//		System.out.println("Data antes de formatar " + data);
//		System.out.println("Data depois de formatar " + dataFormatada.format(data));
//		
////		Datas e horas - GregorianCalendar
//		GregorianCalendar calendar = new GregorianCalendar();
//		System.out.println(calendar.getTime());
//		System.out.println(calendar.getFirstDayOfWeek());
//		System.out.println(calendar.get(calendar.DATE));//5
//		System.out.println(calendar.get(calendar.DAY_OF_YEAR));//6
//		System.out.println(calendar.get(calendar.DAY_OF_MONTH));//5
//		System.out.println(calendar.get(calendar.DAY_OF_WEEK));//7
//		System.out.println(calendar.get(calendar.DAY_OF_WEEK_IN_MONTH));//8
//		System.out.println(calendar.get(calendar.AM_PM));//9
//		System.out.println(calendar.get(calendar.DAY_OF_MONTH));
//		System.out.println(calendar.isLeapYear(2012));
//		
//		Datas e horas - LocalDate
//		LocalDate hoje = LocalDate.now();
//		System.out.println(hoje);
//		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		System.out.println(hoje.format(formatar));
//		
//		LocalDateTime hojeHora = LocalDateTime.now();
//		DateTimeFormatter formatarLDT = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//		System.out.println(hojeHora.format(formatarLDT));
//		
//		Date data = new Date();
//		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
//		System.out.println(dataFormatada.format(data));
//	}
	
//	public static void ler() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite o nome do arquivo: ");
//		String nome = sc.next();
//		try {
//			LeituraEscrita.leitor(nome);
//		} catch (FileNotFoundException e) {
//			System.out.println("O sistema não pode encontrar o arquivo especificado, no caminho ./temp1/" + nome + ".txt");
//			ler();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		sc.close();

////		instanciando um objeto funcionario		
//		Funcionario objetoFuncionario = new Funcionario();
//		Funcionario objetoFunc = new Funcionario("Déby", "123", 1000.0, 111, "deby", "000");
//		
////		instanciando um objeto operadorCaixa		
//		OperadorCaixa objetoCaixa = new OperadorCaixa();
//		OperadorCaixa objetoOperCaixa = new OperadorCaixa(200.0, 10000.0, "Ana", "456", 5300.0, 222, "ana", "123-4");
//		System.out.println("Bonificação do Caixa " + objetoOperCaixa.bonificacao());
//		
////		instanciando um objeto diretor
//		Diretor objetoDir = new Diretor();
//		Diretor objetoDiretor = new Diretor("123-4", 500000.0, "Ana", "123", 3000.0, 111, "deby", "000");
//		System.out.println("Bonificação do Diretor " + objetoDiretor.bonificacao());
//		
////		instanciando um objeto diretor a partir do pai, funcionario
//		Funcionario objetoDiretorDois = new Diretor();

	}

}
