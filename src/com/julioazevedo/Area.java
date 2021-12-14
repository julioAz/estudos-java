package com.julioazevedo;

 class Area {
    public static void main(String[] args) {

        double largura = 3.75;
        double comprimento = 4.45;
        double area = largura * comprimento;
        double perimetro = (2 * largura) + (2 * comprimento);

        System.out.printf("O Perimetro do comodo de %2.2fm de largura e %2.2fm de comprimento é de %4.2fm%n", largura,
                comprimento, perimetro);

        System.out.printf("O Perimetro do comodo de %2.2fm de largura e %2.2fm de comprimento é de %4.2fcm%n", largura,
                comprimento, perimetro * 100);

        System.out.printf("A area do comodo de %2.2fm de largura e %2.2fm de comprimento é de %4.2fm%n", largura,
                comprimento, area);

        System.out.printf("A area do comodo de %2.2fm de largura e %2.2fm de comprimento é de %4.2fcm%n", largura,
                comprimento, area * 100);
    }
}
