package secao5;

import java.util.Scanner;

public class Exericicio_book5 {
    /**
     * exercicio 11: Crie um programa que leia dois numeros 
     * inteiros do usuário e exiba a soma, subtração, 
     * divisão e multiplicação e modulo desses numeros no console.
     * 
     * 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero inteiro: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int divisao = num1 / num2;
        int multiplicacao = num1 * num2;
        int modulo = num1 % num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Divisao: " + divisao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Modulo: " + modulo);

        scanner.close();
    }
}
