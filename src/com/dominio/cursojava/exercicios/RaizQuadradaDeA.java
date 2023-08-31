package com.dominio.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RaizQuadradaDeA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetA = new int[15];
		double[] vetB = new double[vetA.length];
		
		for (int i = 0; i < vetA.length; i++) {
			System.out.println("Digite o valor do número " +( i + 1) + " :");
			vetA[i] = scan.nextInt();
			vetB[i] = Math.sqrt(vetA[i]);
			
		}
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		for (int i = 0; i < vetA.length; i++) {
			
			System.out.println("Valor do vetorA: " + vetA[i] + " Raiz quadrada: " + df.format(vetB[i]));
			
		}
	}

}
