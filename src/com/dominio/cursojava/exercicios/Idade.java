package com.dominio.cursojava.exercicios;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		
		for (int i =0; i<vetorA.length; i++) {
			System.out.println("Entre com a idade da pessoa " + (i+1));
			vetorA[i] = scan.nextInt();
			
			
		}
		int count = 0;
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] > 35) {
				count +=1;
			}
		}
		System.out.println("A quantidade de pessoas com mais de 35 anos é de: " + count);

	}

}
