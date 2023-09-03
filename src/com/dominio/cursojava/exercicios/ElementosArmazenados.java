package com.dominio.cursojava.exercicios;

import java.util.Scanner;

public class ElementosArmazenados {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[10];
		int sum = 0, impar = 0, par = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = scan.nextInt();
			
			if(vetor[i] % 2 == 0) {
				par +=1;
			}else {
				impar += 1;
			}
			
		}
		System.out.println("Quantidade de números ímpares:  " +impar);
		System.out.println("Quantidade de números pares:  " +par);
	}

}
