package com.julioazevedo;

//Escreva um programa que lê o nome de 5 pessoas e armazena numa lista de convidados. Ao final, informe qual
// o nome mais longo presente na lista.

import java.util.Scanner;

public class Guests {
    public static void main(String[] args) {
        String[] guests;
        guests = new String[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < guests.length; i++) {
            System.out.println("Digite o nome dos convidados ");
            guests[i] = sc.nextLine();
        }

    }
}
