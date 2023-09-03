package com.dominio.cursojava.exercicios;

import java.util.Scanner;

public class QuantidadeDeElementosParesNoVetor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[10];
		int pares = 0;
		int impar = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = scan.nextInt();
			
			if(vetor[i] % 2 == 0) {
				pares += 1;
			}else {
				impar += 1;
			}
		}
		System.out.println("A quantidade de números pares é de: "+ pares);
		System.out.println("A quantidade de números ímpares é de: "+ impar);
	}

}
