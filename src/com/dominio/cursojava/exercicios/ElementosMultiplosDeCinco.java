package com.dominio.cursojava.exercicios;

import java.util.Scanner;

public class ElementosMultiplosDeCinco {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[10];
		int sum = 0;
		int element = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = scan.nextInt();
			
			if(vetor[i] % 5 == 0 ) {
				sum += 1;
				element += vetor[i];
			}
			
		}
		System.out.println("Quantidade de elementos multiplos de 5:"  +sum + "\n"
				+ "O valor da soma desses elemntos é de: " + element);

	

	}

}
