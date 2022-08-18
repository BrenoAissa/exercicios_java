package Lista.POO;

import java.util.Scanner;
/*
    Sejam a, b e c os três lados de um triângulo. Elabore um algoritmo que verifica se o triângulo é:

    Escaleno (todos os lados diferentes)
    Isósceles (possui dois lados iguais)
    Equilátero (todos os lados iguais)
    Não forma triângulo (a soma de dois lados deve ser maior que o terceiro lado)
    Os três números devem ser inteiros positivos e lidos na mesma linha (Ex: 3 4 5) Exemplos de entrada e saída esperada:

    Exemplo 1: Entrada = 2 3 2 | Saída = Isosceles
    Exemplo 2: Entrada = 2 2 2 | Saída = Equilatero
    Exemplo 3: Entrada = 1 2 4 | Saída = Nao forma triangulo
    Exemplo 4: Entrada = -1 2 4 | Saída = Erro
    Qualquer valor fora do domínio de entrada tem como saída esperada a String "Erro".
 */
public class ex2 {
    public static void main(String[] args) {
        int A, B, C;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numero = input.split("\\s");
        A = Integer.parseInt(numero[0]);
        B = Integer.parseInt(numero[1]);
        C = Integer.parseInt(numero[2]);
        if(A > 0 && B > 0 && C > 0) {
            if (A + B > C && C + B > A && C + A > B) {
                if(A == B && B == C){
                    System.out.println("Equilatero");
                }
                else if (A == B || B == C || C == A) {
                    System.out.println("Isosceles");
                }
                else{
                    System.out.println("Escaleno");
                }
            }
            else{
                System.out.println("Nao forma triangulo");
            }
        }
        else{
            System.out.println("Erro");
        }
    }
}
