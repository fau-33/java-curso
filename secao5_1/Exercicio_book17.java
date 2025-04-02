package secao5_1;

import java.util.Scanner;

public class Exercicio_book17 {
    /** Exercicios: Verificação de Maioria
     * 
     * exercicio 23: EScreva um programa que leia a idade de três
     * pessoas para verificar se pelo menos duas delas sõ maiores de idade.
     * (18 ou mais).
     *  
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();

        System.out.println("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();

        System.out.println("Digite a idade da terceira pessoa: ");
        int idade3 = scanner.nextInt();

        int maioridade = 0;
        
        if(idade1 >= 18)maioridade++;
        if(idade2 >= 18)maioridade++;
        if(idade3 >= 18)maioridade++;

        if(maioridade >= 2) {
            System.out.println("Pelo menos duas pessoas são maiores de idade.");
        } else {
            System.out.println("Menos de duas pessoas são maiorores de idade.");
        }

        scanner.close();
        
    }
}
