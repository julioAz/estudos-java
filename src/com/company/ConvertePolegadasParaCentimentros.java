package com.company;

// Escreva um programa que realiza conversão de medidas de polegadas em centímetros.

import java.util.Scanner;

public class ConvertePolegadasParaCentimentros {
    public static void main(String[] args) {
        final double cm = 2.54;
        System.out.println("Digite a medida em polegadas para converter para centimetros :");
        Scanner sc = new Scanner(System.in);
        double polegadas = sc.nextDouble();

        double valor_convertido = cm * polegadas;

        System.out.println( polegadas + " polegadas é igual a " + valor_convertido + " cm");
    }
}
