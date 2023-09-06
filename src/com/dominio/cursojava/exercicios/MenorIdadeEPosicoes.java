package com.dominio.cursojava.exercicios;

import java.util.Scanner;

public class MenorIdadeEPosicoes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[10];
        int maiorIdade = Integer.MIN_VALUE; // Initialize with the smallest possible integer
        int menorIdade = Integer.MAX_VALUE; // Initialize with the largest possible integer

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com a idade da pessoa " + (i + 1) + ":");
            vetorA[i] = scan.nextInt();

            // Check for the largest and smallest ages as you input them
            if (vetorA[i] > maiorIdade) {
                maiorIdade = vetorA[i];
            }
            if (vetorA[i] < menorIdade) {
                menorIdade = vetorA[i];
            }
        }

        System.out.println("A maior idade é " + maiorIdade);
        System.out.println("A menor idade é " + menorIdade);
    }
}
