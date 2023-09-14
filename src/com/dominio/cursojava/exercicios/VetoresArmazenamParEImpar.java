package com.dominio.cursojava.exercicios;

import java.util.Random;
import java.util.Scanner;

public class VetoresArmazenamParEImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor da posição " + (i + 1) + ":");
			vetorA[i] = scan.nextInt();
		if(vetorA[i] % 2 == 0) {
			vetorB[i] = vetorA[i];
		} else {
			vetorC[i] = vetorA[i];
		}
		}

		
		System.out.print("Valores do vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("Valores do vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		System.out.print("Valores do vetor C = ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}

	

	}

}
