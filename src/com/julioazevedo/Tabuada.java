package com.julioazevedo;

//Escreva um programa que informa a tabuada de um número informado (entre 1-10).

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para a tabuada :");
        int n1 = sc.nextInt();

        if(n1 >= 1 && n1 <= 10){
            for(int i = 1; i <= 10; i++ ){
                System.out.println(n1 + " x " + i + " = " + (n1 * i) );
            }
        } else {
            System.out.println("Numero invalido .");
        }
    }
}
