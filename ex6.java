package Lista.POO;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

/*
    Sabe-se que uma lata de tinta tem um custo C e é capaz de pintar uma área de M metros quadrados.
    Faça um programa que leia a largura L, a altura A de uma parede, o valor C de uma lata de tinta e o rendimento M desta lata.
    Após isso, imprima quantas latas de tintas são necessárias e o custo total (com duas casas decimais).
    Assuma que não é possível comprar lata de tinta fracionada.
 */

public class ex6 {
    public static void main(String[] args) {
        int area, lata;
        Locale.setDefault(new Locale("en", "US"));
        Scanner scanner = new Scanner(System.in);

        double largura = Double.parseDouble(scanner.nextLine());
        double altura = Double.parseDouble(scanner.nextLine());
        double custo = Double.parseDouble(scanner.nextLine());
        double rendimento = Double.parseDouble(scanner.nextLine());

        area = (int) (largura * altura);
        rendimento = area / rendimento;
        lata = (int) Math.ceil(rendimento);
        custo = lata * custo;
        System.out.println(lata);
        System.out.printf("%.2f",custo);
    }
}
