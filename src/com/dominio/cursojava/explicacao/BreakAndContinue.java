package com.dominio.cursojava.explicacao;

import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Entre com um número");
//		int num = scan.nextInt();
//		System.out.println("Entre com um limite");
//		int max = scan.nextInt();
//		
//		for(int i = num; i<= max ; i++) {
//			//System.out.println(i);
//			if(i % 7 == 0) {
//				
//				System.out.println("O valor é: " + i);
//				break; //até o multiplo de 7
//			}
//		}
		
		//Break com rótulos - GoTo
		// É mais usado em linguagens de baixo nível como por ex o assembly
		
//		for (int i = 0; i<= 4; i++) {
//			rotulo1: {
//				rotulo2: {
//					rotulo3: {
//						if (i == 1) {
//							break rotulo1;
//						}
//						if(i == 2) {
//							break rotulo2;
//						}
//						if (i ==3) {
//							break rotulo3;
//						}
//						System.out.println("Rotulo3");
//					}
//					System.out.println("Rotulo2");
//				}
//				System.out.println("Rotulo1S");
//			}
//		}
		
		//Comando continue é um complemente do break, continua o loop na ppróxima interação
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um número");
		int num = scan.nextInt();
		System.out.println("Entre com um limite");
		int max = scan.nextInt();
		
		for(int i = num; i<= max ; i++) {
			//System.out.println(i);
			if(i % 7 == 0) {
				
				continue; // não quer imprimir quando for um multiplo de 7 (não executa o código abaixo do continue)
			}
			System.out.println("O valor é: " + i);
		}
		
		
		
	}

}
