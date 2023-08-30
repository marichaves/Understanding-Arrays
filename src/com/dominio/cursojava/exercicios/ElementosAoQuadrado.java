package com.dominio.cursojava.exercicios;

import java.util.Scanner;

public class ElementosAoQuadrado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetA = new int[15];
		int[] vetB = new int[vetA.length];
		
		for (int i = 0; i < vetA.length; i++) {
			System.out.println("Digite o valor do número " +( i + 1) + " :");
			vetA[i] = scan.nextInt();
			vetB[i] = vetA[i] * vetA[i];
			
		}
		for (int i = 0; i < vetA.length; i++) {
			System.out.println("Valor do vetorA: " + vetA[i] + " vetorB: " + vetB[i]);
			
		}
		

	}

}
