package com.dominio.cursojava.exercicios;

import java.util.Random;
import java.util.Scanner;

public class TabuadaComVetor {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
	
		
		for(int i = 0 ; i < vetorA.length; i++) {
			System.out.println("Digite a tabuada que você quer saber" + (i + 1) + ":");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Tabuada de " + vetorA[i]);
			
			for(int j = 1; j <= 10; j++) {
				System.out.println(j + " * " + vetorA[i] + " = " + (vetorA[i]*j));
			}
			System.out.println();
		}

	}

}
