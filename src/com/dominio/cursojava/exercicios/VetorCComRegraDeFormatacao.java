package com.dominio.cursojava.exercicios;

import java.util.Random;
import java.util.Scanner;

public class VetorCComRegraDeFormatacao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		Random numeros = new Random();
		for(int i = 0 ; i < vetorA.length; i++) {
			System.out.println("Digite o valor da posição " + (i + 1) + ":");
			vetorA[i] = scan.nextInt();
			vetorB[i] = numeros.nextInt(100 - 1);
			if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
			} else if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
			} else {
				vetorC[i] = -1;
			}
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
		System.out.println();
		System.out.print("Valores do vetor C = ");
		for(int i = 0; i < vetorC.length; i ++) {
			System.out.print(vetorC[i] + " ");
		}
	}

}
