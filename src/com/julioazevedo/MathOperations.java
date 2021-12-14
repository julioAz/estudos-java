package com.julioazevedo;

//Escreva um programa que recebe dois números inteiros e informa o resultado das operações soma,
// subtração, multiplicação e divisão. Considere sempre a ordem em que foram informados.

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Primeiro Numero :");
        int n1 = sc.nextInt();

        System.out.println("Digite o Segundo Numero :");
        int n2 = sc.nextInt();

        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;
        int divisao = n1 / n2;

        System.out.printf("A soma de %d e %d é %d %n", n1, n2, soma);
        System.out.printf("A subtracao de %d e %d é %d %n" , n1, n2, subtracao);
        System.out.printf("A multiplicacao de %d e %d é %d %n", n1, n2, multiplicacao);
        System.out.printf("A divisao de %d e %d é %d %n", n1, n2, divisao);
    }
}
