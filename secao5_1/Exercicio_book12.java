package secao5_1;

import java.util.Scanner;

public class Exercicio_book12 {
    /** Exercicios operadores de comparação e lógicos
     * 
     * exercicio 18: Desenvolva um programa que leia três numeros 
     *  inteiros do usuário e exiba o maior deles.
     *  
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

        System.out.println("Digite o terceiro numero inteiro: ");
        int num3 = scanner.nextInt();
        
        int maior = num1;

        if(num2 > maior) {
            maior = num2;
        }

        if(num3 > maior) {
            maior = num3;
        }

        System.out.println("O maior número digitado foi: " + maior);

        scanner.close();
        
    }
}
