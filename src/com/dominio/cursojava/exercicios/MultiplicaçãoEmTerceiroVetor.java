package com.dominio.cursojava.exercicios;

import java.util.Scanner;

public class MultiplicaçãoEmTerceiroVetor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		float[] vetorC = new float[vetorA.length];
		
		System.out.println("Digite os valores do vetorAs: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor do número " +( i + 1) + " :");
			vetorA[i] = scan.nextInt();
			
		}
		System.out.println("Digite os valores do vetorB: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Digite o valor do número " +( i + 1) + " :");
			vetorB[i] = scan.nextInt();
			
		}
		System.out.println("Os valores no vetorC são: ");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = (float)(vetorA[i] * vetorB[i]);
			System.out.print(vetorC[i] + " ");
		}

	}

}
