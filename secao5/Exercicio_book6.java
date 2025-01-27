package secao5;

import java.util.Scanner;

public class Exercicio_book6 {
    /**
     * exercicio 12: EScreva um programa que leia três numeros 
     *  inteiros do usuário e calcule a media aritmetica desses numeros.
     * Exiba o resultado no console.
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

        double media = (num1 + num2 + num3) / 3.0;

        System.out.println("Media aritmética: " + media);

        scanner.close();
        
    }
}
