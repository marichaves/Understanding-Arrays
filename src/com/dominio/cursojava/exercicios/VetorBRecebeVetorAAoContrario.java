package com.dominio.cursojava.exercicios;

import java.util.Random;

public class VetorBRecebeVetorAAoContrario {

	public static void main(String[] args) {
		Random scan = new Random();
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
		
		for(int i = 0 ; i < vetorA.length; i++) {
			vetorA[i] = scan.nextInt(100 - 1);
			
		}
		
		for(int i = 0 ; i < vetorA.length; i++) {
			vetorB[i] = vetorA[vetorA.length - 1 - i];
			
		}
		System.out.print("Valores do vetor A = ");
		for(int i = 0; i < vetorA.length; i ++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.print("Valores do vetor B = ");
		for(int i = 0; i < vetorB.length; i ++) {
			System.out.print(vetorB[i] + " ");
		}
	}

	

}
