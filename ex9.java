package Lista.POO;

import java.util.Scanner;
/*
    Faça um programa que leia um conjunto de valores que correspondem as idades de pessoas de uma comunidade.
    Quando o valor fornecido for um número negativo, significa que não existem mais idades para serem lidas.
    Após a leitura, seu programa deve informar:

    A média das idades das pessoas (com duas casas decimais)
    A quantidade de pessoas maiores de idade
    A porcentagem de pessoas idosas (considere quem uma pessoa idosa tem mais de 75 anos) (com duas casas decimais)
 */
public class ex9 {
    public static void main(String[] args) {
        double media, cont = 0, idosas = 0, soma = 0, porcentagem;
        int idade, maior = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            idade = Integer.parseInt(scanner.nextLine());
            if(idade >= 0) {
                cont = cont + 1;
                soma = soma + idade;
                if (idade >= 18) {
                    maior = maior + 1;
                }
                if (idade > 75){
                    idosas = idosas + 1;
                }
            }
        } while (idade >= 0);

        media = soma / cont;
        porcentagem = (idosas / cont) * 100;


        System.out.printf("%.2f \n", media);
        System.out.print(maior + "\n");
        System.out.printf("%.2f", porcentagem);
        System.out.print("%");


    }
}
