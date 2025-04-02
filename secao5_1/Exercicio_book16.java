package secao5_1;

import java.util.Scanner;

public class Exercicio_book16 {
    /** Exercicios: Operadores Logicos AND e OR 
     * 
     * exercicio 22: Crie um programa que leia três inteiros
     * e verifique se pelo menos um deles é maior que 10. 
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

        if(num1 > 10 || num2 > 10 || num3 > 10) {
            System.out.println("Pelo menos um dos números é maior que 10.");
        }else {
            System.out.println("Nenhum número é maior que 10.");
        }

        if(num1 > 10 && num2 > 10 && num3 > 10) {
            System.out.println("Todos os números são maiores que 10.");
        }else {
            System.out.println("Nenhum número é maior que 10.");
        }

        scanner.close();
        
    }
}
