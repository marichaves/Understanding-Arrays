package com.dominio.cursojava.exercicios;

import java.util.Scanner;

public class SomaDeElemtosNoVetor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[10];
		int sum = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = scan.nextInt();
			
			sum += vetor[i];
			
		}
		System.out.println("A soma dos elementos no vetor é: " +sum);

	}

}
