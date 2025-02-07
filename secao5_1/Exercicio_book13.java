package secao5_1;

import java.util.Scanner;

public class Exercicio_book13 {
    /** Exercicios operadores de comparação e lógicos
     * 
     * exercicio 19: Crie um programa que leia idade de
     *  pessoa e verifique se ela é elegível para votar.
     *  (idade igual ou superior a 18 anos).
     *     
     * 
     * 
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if(idade >= 18) {
            System.out.println("Você é legivel pra votar!");
        } else {
            System.out.println("Você não é legivel pra votar!");
        }

        scanner.close();
        
    }
}
