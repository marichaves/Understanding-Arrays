package com.dominio.cursojava.explicacao;

public class Arrays {

	public static void main(String[] args) {
		// Estrutura de dados mais simples que existe.
		// Lista ordenada de dados.
		
		// Armazenar a temperatura média diária por 1 ano em uma lista ordenada de dados (Array)
		double[] temperaturas = new double [365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[6] = 35;
		temperaturas[8] = 29;
		System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
		System.out.println("O tamanho do array: " + temperaturas.length);
		System.out.println("O endereço de memoria é: " + temperaturas);
		
//		for (int i = 0; i < temperaturas.length; i++) {
//			System.out.println("O valor da temperatura do dia "+ (i+1) +" é: " + temperaturas[i]);
//		}
		
		//A melhor opção para visualizar todo o array é com o for melhorado
		for(double temp : temperaturas) {
			System.out.println(temp); //tem acesso somente ao valor mas não a vez em que está sendo passado o valor (como acontece na opção acima)
			
		}
	}

}
