package Lista.POO;

import java.util.Locale;
import java.util.Scanner;
/*
    Um motorista de Uber estipula o preço de uma determinada viagem dada a quantidade de quilômetros percorrida.
    Para viagens de até X km, é cobrado um valor R$ V1 por km. Acima de X km, é cobrado o valor R$ V2.
    Faça um programa que leia X, V1, V2 e a quantidade de quilômetros A da viagem e imprima o valor total com duas casas decimais.
 */
public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(new Locale("en", "US"));

        double limite = Double.parseDouble(scanner.nextLine());
        double maximo_Limite = Double.parseDouble(scanner.nextLine());
        double acima_Limite = Double.parseDouble(scanner.nextLine());
        double km = Double.parseDouble(scanner.nextLine());

        if(km <= limite){
            km *= maximo_Limite;
            System.out.printf("%.2f", km);
        }
        else{
            km *= acima_Limite;
            System.out.printf("%.2f", km);
        }
    }
}
