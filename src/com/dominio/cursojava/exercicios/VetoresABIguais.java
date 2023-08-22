package com.dominio.cursojava.exercicios;

public class VetoresABIguais {

	public static void main(String[] args) {
		//Atribuindo os mesmos valores do vetor a ao vetor b.
		int[] a = new int [5];
		int[] b = new int [5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		for( int i = 0; i<  a.length ; i++) {
			b[i] = a[i];
			System.out.println("O valor da array "+ i+ " a é: " + a[i]);
			System.out.println("O valor da array "+ i + " b é: " + b[i]);
		}

	}

}
