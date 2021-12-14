package com.julioazevedo;

public class KiloParaLibras {
    public static void main(String[] args) {
        final double FATOR_KG_PARA_LB = 2.20462;
        int kilos = 100;
        double pesoConvertido = kilos * FATOR_KG_PARA_LB;

        System.out.printf("%3d kg são %2.2f lb",kilos, pesoConvertido);
    }
}
