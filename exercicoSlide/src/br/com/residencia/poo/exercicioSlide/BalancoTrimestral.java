package br.com.residencia.poo.exercicioSlide;

public class BalancoTrimestral {

	public static void main(String[] args) {

		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosAbril = 15000;
		int gastosMaio = 15000;
		int gastosJunho = 14000;
		int gastosJulho = 15000;
		int gastosAgosto = 16000;
		int gastosSetembro = 15000;
		int gastosOutubro = 13000;
		int gastosNovembro = 15000;
		int gastosDezembro = 13000;
		
		
		int gastosPrimeiroTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		int gastosSegundoTrimestre = gastosAbril + gastosMaio + gastosJunho;
		int gastosTerceiroTrimestre = gastosJulho + gastosAgosto + gastosSetembro;
		int gastosQuartoTrimestre = gastosOutubro + gastosNovembro + gastosDezembro;
		int primeiroSemestre = gastosPrimeiroTrimestre + gastosSegundoTrimestre;
		int segundoSemestre = gastosTerceiroTrimestre + gastosQuartoTrimestre;
		int anual = primeiroSemestre + segundoSemestre;
		
		System.out.println("Os gastos do Primeiro Trimestre são:" + gastosPrimeiroTrimestre);
		System.out.println("Os gastos do Segundo Trimestre são:" + gastosSegundoTrimestre);
		System.out.println("Os gastos do Terceiro Trimestre são:" + gastosTerceiroTrimestre);
		System.out.println("Os gastos do Quarto Trimestre são:" + gastosQuartoTrimestre);
		System.out.println("Os gastos do Primeiro Semestre são:" + primeiroSemestre);
		System.out.println("Os gastos do Segundo Semestre são:" + segundoSemestre);
		System.out.println("Os gastos Anuais são:" + anual);
				
		//System.out.println("Os gastos Trimestrais são:" + gastosPrimeiroTrimestre);
		//System.out.println("Os gastos de Janeiro são:" + gastosJaneiro);
		//System.out.println("Os gastos de Janeiro são:" + gastosFevereiro);
		//System.out.println("Os gastos de Janeiro são:" + gastosMarco);
		
	}
		
}
