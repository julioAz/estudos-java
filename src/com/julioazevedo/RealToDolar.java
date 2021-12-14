package com.julioazevedo;

// Escreva um programa que recebe a cotação do dólar do dia e, seguida recebe um valor em reais. A saída é a quantia
// em dólares. Use formatação de saída para exibir os valores de acordo com cada representação de moeda.

import java.util.Scanner;

public class RealToDolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cotacao_dolar, valor_real,valor_final;

        System.out.print("Digite a cotação do dolar: ");
        cotacao_dolar = sc.nextDouble();

        System.out.print("Digite o valor em reais: ");
        valor_real = sc.nextDouble();

        valor_final = cotacao_dolar * valor_real;

        System.out.println("O Valor em dolares é " + valor_final + "R$" );
    }
}
