package Lista.POO;

import java.util.Locale;
import java.util.Scanner;
/*
    A avenida principal da cidade de Algoritmopolis possui limite de velocidade de L km/h.
    Se o motorista ultrapassar essa velocidade, é aplicado uma multa de R$ M, mais R$ A por cada km acima do limite.
    Faça um programa que leia o limite L, o valor da multa M, o valor adicional A e a velocidade V captada pelo radar e informe o valor total da multa.
    Considere L e V sempre como números inteiros. Apresente a resposta com duas casas decimais.
 */
public class ex5 {

    public static void main(String[] args) {
        int compara;
        Locale.setDefault(new Locale("en", "US"));

        Scanner scanner = new Scanner(System.in);

        int limite = Integer.parseInt(scanner.nextLine());
        double multa = Double.parseDouble(scanner.nextLine());
        double acima = Double.parseDouble(scanner.nextLine());
        int velocidade = Integer.parseInt(scanner.nextLine());

        if(velocidade > limite) {
            compara = velocidade - limite;
            compara = (int) (compara * acima);
            multa = multa + compara;
            System.out.printf("%.2f", multa);
        }
        else{
            System.out.println("0.00");
        }
    }
}
