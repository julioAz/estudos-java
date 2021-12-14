package com.julioazevedo;

import java.util.Scanner;

public class CalculoSoma {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        int n2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero:");
        int n3 = scanner.nextInt();

        //int n1 = Integer.valueOf(args[0]);
        //int n2 = Integer.valueOf(args[1]);
        //int n3 = Integer.valueOf(args[2]);
        int soma = 0;

        if (n1 % 2 == 0){
            soma += n1;
        } if (n2 % 2 == 0){
            soma += n2;
        } if (n3 % 2 == 0){
            soma+= n3;
        }
        System.out.printf("A soma dos pares é: %d", soma);
    }
}
