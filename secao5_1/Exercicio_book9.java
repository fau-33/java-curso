package secao5_1;

import java.util.Scanner;

public class Exercicio_book9 {
    /**
     * exercicio 15: Escreva um programa que leia dois números
     *  inteiros do usuário e exiba o resultado da potenciação 
     *  do primeiro número elevado ao segundo número.(use Math.pow)    
     * 
     * 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();

        double potencia = Math.pow(base, expoente);

        System.out.println(base + " elevado a " + expoente + " = " + potencia);

        scanner.close();
    }
}
