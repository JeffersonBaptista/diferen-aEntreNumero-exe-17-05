package com.br.diferenca;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double primeiro = 0;
		double segundo = 0;		
		double diferenca =0;
		
		System.out.println("Vamos calculatr a diferença entre os numeros digitados");
		System.out.println("");
		System.out.println("            Sempre do maior para o menor");
		System.out.println("");
		
		System.out.println("Didite o primeiro numero:");
		primeiro = scan.nextDouble();
		
		System.out.println("Didite o segundo numero:");
		segundo = scan.nextDouble();
		
		if(primeiro > segundo) {
			diferenca = primeiro - segundo;
			System.out.println("A diferença entre eles é de: " + diferenca);
		}else {
			diferenca = segundo - primeiro;
			System.out.println("A diferença entre eles é de: " + diferenca);
		}
		
	}

}
