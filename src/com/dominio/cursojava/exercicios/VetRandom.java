package com.dominio.cursojava.exercicios;

public class VetRandom {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		int g = 0, k = 0;
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int)Math.round(Math.random() * 1);
			if(vetor[i] == 1) {
				k += 1;
			} else {
				g += 1;
			}
		}
		System.out.println("A quantidade de números 1 dentro do vetor é de: " + k);
		System.out.println("A quantidade de números 0 dentro do vetor é de: " + g);
	}

}
