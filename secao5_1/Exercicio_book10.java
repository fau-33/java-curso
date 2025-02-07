package secao5_1;

import java.util.Scanner;

public class Exercicio_book10 {
    /** Exercicios operadores de comparação e lógicos
     * 
     * exercicio 16: Crie um programa que leia dois números 
     *  inteiros e exiba se o primeiro é maior, menor ou igual ao segundo.
     *     
     * 
     * 
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero inteiro: ");
        int num2 = scanner.nextInt();

        if(num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo.");
        } else if(num1 < num2) {
            System.out.println("O primeiro número é menor que o segundo.");
        } else {
            System.out.println("Os dois números são iguais.");
        }

        scanner.close();
        
    }
}
