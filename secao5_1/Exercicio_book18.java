package secao5_1;

import java.util.Scanner;

public class Exercicio_book18 {
    /** Exercicios: Ano bissexto
     * 
     * exercicio 24:Crie um programa que leia um ano e verifique 
     * se ele é bissexto ou não.Um ano é bissexto se for divisível por 4, 
     * mas não por 100, ou se for divisível por 400.
     * 
     *  
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        int ano = scanner.nextInt();

        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é bissexto.");
        } else {
            System.out.println(ano + " nao é bissexto.");
        }

        scanner.close();
        
    }
}
