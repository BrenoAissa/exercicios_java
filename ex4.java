package Lista.POO;

import java.util.Scanner;
/*
    Osmar adora chocolates e vai para a loja com N dinheiro no bolso. O preço de cada chocolate é C. A loja oferece um desconto: para cada M embalagens que ele dá para a loja, ele ganha um chocolate grátis. Quantos chocolates Osmar consegue comer? Por exemplo:

    Para N=10, C=2, M=5, ele pode comprar 5 chocolates por $10 e trocar as 5 embalagens por mais 1 chocolate,
    fazendo com que o número total de chocolates que ele pode comer seja 6.
    Faça um programa que leia inteiros N, C e M e imprima a quantidade de chocolates que Osmar pode comer.
    C e M são inteiros positivos.
 */
public class ex4 {
    public static void main(String[] args) {
        int quantidade, gratis = 0;

        Scanner scanner = new Scanner(System.in);
        int dinheiro = Integer.parseInt(scanner.nextLine());
        int preco = Integer.parseInt(scanner.nextLine());
        int embalagem = Integer.parseInt(scanner.nextLine());




        if(dinheiro >= 0) {
            quantidade = dinheiro / preco;
            if (embalagem > 0) {
                gratis = quantidade;
                gratis += 1;
                System.out.println(gratis);
            }
            else {
                System.out.println(quantidade);
            }
        }
        else {
            gratis += 1;
            System.out.println(gratis);
        }
    }
}
