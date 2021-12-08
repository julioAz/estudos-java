package com.company;

import java.util.Scanner;

public class Hora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a hora com 2 digitos.");
        int hora = scanner.nextInt();

        if (hora >= 6 && hora < 12 ){
            System.out.println("Bom dia");
        } else if (hora >= 12 && hora < 18 ){
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
    }
}
