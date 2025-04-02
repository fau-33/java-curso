package secao5_1;

import java.util.Scanner;

public class Exercicio_book15 {
    /** Exercicios: Comparação de strings 
     * 
     * exercicio 21: Desenvolva um programa que leia duas strings
     *  do usuário e verifique se elas são iguais ou diferentes.
     *  Exiba uma mensagem informando o resultado da comparação.s
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira string: ");
        String str1 = scanner.nextLine();

        System.out.println("Digite a segunda string: ");
        String str2 = scanner.nextLine();

        if(str1.equals(str2)) {
            System.out.println("As strings sao iguais.");
        } else {
            System.out.println("As strings sao diferentes.");
        }


        scanner.close();
        
    }
}
