package com.dominio.cursojava.exercicios;

import java.util.Scanner;

public class VetorAFormadoPelaPotenciaDeBaseDe2ElevadoAoExpoenteIgualAPosicaoDoRespectivoElemento {

	public static void main(String[] args) {
		 

	        int[] vetorA = new int[11];

	        for (int i = 0; i < vetorA.length; i++) {
	       
	            vetorA[i] = (int) Math.pow(2, i);
	        }
	        System.out.print("Valores do vetor A = ");
			for (int i = 0; i < vetorA.length; i++) {
				System.out.print(vetorA[i] + " ");
			}
	}

}
