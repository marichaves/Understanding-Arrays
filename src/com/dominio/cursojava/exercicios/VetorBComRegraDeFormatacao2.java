package com.dominio.cursojava.exercicios;

import java.util.Random;
import java.util.Scanner;

public class VetorBComRegraDeFormatacao2 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		String[] vetorB = new String[vetorA.length];
		
		for(int i = 0 ; i < vetorA.length; i++) {
			System.out.println("Digite o valor da posição " + (i + 1) + ":");
			vetorA[i] = scan.nextInt();
			if (vetorA[i] < 7 ) {
				vetorB[i] = "a";
			} else if (vetorA[i] == 7 ){
				vetorB[i] = "b";
			}else if (vetorA[i] > 7 &&  vetorA[i] < 10 ){
				vetorB[i] = "c";
			}else if (vetorA[i] == 10 ){
				vetorB[i] = "d";
			} else {
				vetorB[i] = "e";
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
	}
}
