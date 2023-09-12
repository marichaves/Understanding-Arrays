package com.dominio.cursojava.exercicios;

import java.util.Scanner;

public class CotacaoDolarReal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double cotacaoDolarReal;
		System.out.println("Qual a cotação do dolar em relação ao real?");
		cotacaoDolarReal = scan.nextDouble();
		
		System.out.println("O resultado da operação é:");
	
		double[] vetorA = new double[20];
		for(int i = 0; i < vetorA.length ; i++) {
			vetorA[i] = cotacaoDolarReal * (i +1);
			System.out.print("$" + (i +1) + " : R$" + vetorA[i]);
			System.out.println();
		}

	}

}
