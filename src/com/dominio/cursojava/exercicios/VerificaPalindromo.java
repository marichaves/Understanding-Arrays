package com.dominio.cursojava.exercicios;

import java.util.Random;
import java.util.Scanner;

public class VerificaPalindromo {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		Scanner scan = new Scanner(System.in);
		boolean verificaPalindromo = false;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Entre com o número na posição " + (i + 1) + " :");
			vetor[i] = scan.nextInt();

		}
		System.out.print("Vetor = ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]);

		}

		for (int i = 0; i < vetor.length / 2; i++) {

			if (vetor[i] == vetor[vetor.length - 1 - i]) {
				verificaPalindromo = true;

			} else {
				verificaPalindromo = false;
				break;

			}
		}

		if (verificaPalindromo = true) {
			System.out.print(" - É palindromo");
		} else {
			System.out.print(" - Não é palindromo");
		}

	}

}
