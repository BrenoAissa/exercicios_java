package Lista.POO;

import java.util.Scanner;
/*
    Uma livraria está fazendo uma promoção para pagamento a vista. O comprador pode escolher entre dois planos de pagamento:

    Critério A: R$ 0,25 por livro + R$ 7,50 fixo
    Critério B: R$ 0,50 por livro + R$ 2,50 fixo
    Faça um programa em que o usuário informe a quantidade positiva e não nula de livros seja impress qual o melhor plano de pagamento.

    Exemplo 1: Entrada = 100 | Saída = Criterio A
    Exemplo 2: Entrada = 5 | Saída = Criterio B
    Exemplo 3: Entrada = 20 | Saída = Indiferente
    Exemplo 4: Entrada = -5 | Saída = Erro
    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
*/
public class ex1 {
    public static void main(String[] args) {
        double A, B, entrada, entradaMaior, entradaMenor;
        A = 7.50;
        B = 2.50;
        Scanner scanner =  new Scanner(System.in);
        entrada = Double.parseDouble(scanner.nextLine());

        if(entrada > 0){
            entradaMenor = (entrada * 0.25) + A;
            entradaMaior = (entrada * 0.50) + B;
            if (entradaMenor < entradaMaior){
                System.out.println("Criterio A");
            }
            else if (entradaMaior == entradaMenor) {
                System.out.println("Indiferente");
            }
            else {
                System.out.println("Criterio B");
            }

        }
        else{
            System.out.println("Erro");
        }
        }
    }
