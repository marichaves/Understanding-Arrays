package com.dominio.cursojava.exercicios;

public class VetorA8ElementosBX2 {

	public static void main(String[] args) {
		int[] vetorA = new int [8];
		int[] vetorB = new int [8];
		vetorA[0] = 12;
		vetorA[1] = 10;
		vetorA[2] = 111;
		vetorA[3] = 20;
		vetorA[4] = 100;
		vetorA[5] = 1;
		vetorA[6] = 19;
		vetorA[7] = 14;
		
		
		for(int i = 0; i <= 7; i++) {
			vetorB[i] = vetorA[i] * 2;
			System.out.println("Valor do vetorA: " + vetorA[i] + " vetorB: " + vetorB[i]);
		}
		
	}

}
