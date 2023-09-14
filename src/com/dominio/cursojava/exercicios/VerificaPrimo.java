package com.dominio.cursojava.exercicios;

import java.util.Scanner;

public class VerificaPrimo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor na posição " + (i + 1) + ":");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (isPrime(vetorA[i])) {
                System.out.println(vetorA[i] + " é primo.");
            } else {
                System.out.println(vetorA[i] + " não é primo.");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        if (num <= 3) {
            return true; // 2 e 3 são primos
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false; // Números divisíveis por 2 ou 3 não são primos
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false; // Números divisíveis por i ou i + 2 não são primos
            }
        }
        return true; // Se passar por todos os testes, é primo
    }
}
