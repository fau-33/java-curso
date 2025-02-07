package secao5_1;

import java.util.Scanner;

public class Exercicio_book14 {
    /** Exercicios operadores de comparação e lógicos
     * 
     * exercicio 20: Escreva um programa que leia um número
     *  inteiro e verifique e ele está entre 10 e 20(inclusive).
     *  Exiba uma mensagem informando se o número está dentro ou fora do intervalo.
     *     
     * 
     * 
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        if(numero >= 10 && numero <= 20) {
            System.out.println("O numero " + numero + " dentro do intervalo");
        } else {
            System.out.println("O numero " + numero + " fora do intervalo");
        }

        scanner.close();
        
    }
}
