package Lista.POO;

import java.util.Scanner;

/*
    Alan quer comprar limões para fazer uma limonada.
    Próximo da sua casa há um mercadinho que vende limões da seguinte forma: O primeiro limão é vendido por C centavos, o segundo por C − 1 centavos, o terceiro por C − 2 e assim por diante até o menor valor de 1 centavo.
    Por exemplo, se C = 3 e Alan quiser comprar 5 limões, o preço total será 3 + 2 + 1 + 1 + 1 = 8.
    Faça um programa que leia dois inteiros N e C que indicam respectivamente o número de limões e o valor em centavos do primeiro limão. Em seguida imprima o valor total em centavos.
 */

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numero = input.split("\\s");

        int limoes = Integer.parseInt(numero[0]);
        int centavos = Integer.parseInt(numero[1]);

        if(centavos >= limoes){

        }

    }
}
