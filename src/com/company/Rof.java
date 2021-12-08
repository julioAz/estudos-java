package com.company;

import java.util.Scanner;

public class Rof {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o tamanho do array");
        int a = leitor.nextInt();

        String[] palavras = new String [a];

        for(int i = 0; i < palavras.length; i++){
            System.out.println("Informe um valor");
            String num = leitor.next();
            palavras[i] = num;
        }

        System.out.println("Valores : ");
        for(int j = palavras.length - 1;j >= 0; j--){
            System.out.println(palavras[j] + " ");
        }
    }
}
