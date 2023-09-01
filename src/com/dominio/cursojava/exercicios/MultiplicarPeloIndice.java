package com.dominio.cursojava.exercicios;

import java.util.Scanner;

public class MultiplicarPeloIndice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetA = new int[10];
		int[] vetB = new int[vetA.length];
		
		for (int i = 0; i < vetA.length; i++) {
			System.out.println("Digite o valor do número " +( i + 1) + " :");
			vetA[i] = scan.nextInt();
			vetB[i] = vetA[i] * i;
			
		}
		System.out.print("Valor do vetorA: " );
		for (int i = 0; i < vetA.length; i++) {
			System.out.print( vetA[i] + " ");
			
		}
		System.out.println(" ");
		System.out.print("Valor do vetorB: " );
		for (int i = 0; i < vetA.length; i++) {
			System.out.print( vetB[i]+ " ");
			
		}
		

	}

}
