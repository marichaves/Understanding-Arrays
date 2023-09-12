package com.dominio.cursojava.exercicios;

import java.util.Random;

public class VetorEncontraImpar {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		Random numeros = new Random();
		boolean continua = true;
		do {
			for(int i = 0; i < vetor.length ; i++) {
				vetor[i] = numeros.nextInt(500 - 0);
				if(vetor[i] % 2 == 0) {
					System.out.println(vetor[i]);
					
				}else {
					continua = false;
				}
			}
		}while(continua);
		

	}

}
