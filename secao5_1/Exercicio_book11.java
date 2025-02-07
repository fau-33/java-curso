package secao5_1;

import java.util.Scanner;

public class Exercicio_book11 {
    /** Exercicios operadores de comparação e lógicos
     * 
     * exercicio 17: Escreva um programa que leia um numero
     *  inteiro e exiba se ele é par ou impar.
     *     
     * 
     * 
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num = scanner.nextInt();
        
        if(num % 2 == 0) {
            System.out.println("O numero " + num + " eh par.");
        } else {
            System.out.println("O numero " + num + " eh impar.");
        }

        scanner.close();
        
    }
}
