package com.julioazevedo;

//Escreva um programa que converte temperaturas de Celsius para Farenheit.
// Formula (°C × 9/5) + 32 = 32 °F

import java.util.Scanner;

public class ConverterCelsiusToFarenheit {
    public static void main(String[] args) {
        System.out.println("Digite a temperatura em Graus celsius");
        Scanner sc = new Scanner(System.in);
        int celsius = sc.nextInt();
        int farenheit = (celsius * 9/5) + 32;
        System.out.printf("%d Graus Celsius sao iguais a %d Graus Farenheit", celsius, farenheit );
    }
}
