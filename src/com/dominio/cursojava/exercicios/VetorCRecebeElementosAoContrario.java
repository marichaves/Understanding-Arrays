package com.dominio.cursojava.exercicios;

import java.util.Random;

public class VetorCRecebeElementosAoContrario {

	public static void main(String[] args) {
		Random scan = new Random();

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[20];

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt(100);
			vetorB[i] = scan.nextInt(100);
		}

		for (int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i];

		}
		for (int i = 0; i < vetorB.length; i++) {
			vetorC[i + 10] = vetorB[i];

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
