package com.dominio.cursojava.exercicios;

import java.util.Scanner;

public class MediaAritmeticaVetores {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[10];
		int sum = 0;
		int cont = 0;
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = scan.nextInt();
			
			if(vetor[i] % 2 != 0 ) {
				cont +=1;
				sum += vetor[i];
				
			}
			
		}
		  if (cont != 0) {
			  double media = (double) sum / cont;  // Usando a divisão inteira, que pode truncar o resultado
	            System.out.println("A média aritmética dos elementos ímpares armazenados no vetor é de: " + media);
	        } else {
	            System.out.println("Não há elementos ímpares no vetor para calcular a média.");
	        }

	}
	}


