package secao5;

import java.util.Scanner;

public class Exercicio_book8 {
    /**
     * exercicio 14: Crie um programa que converta uma temperatura
     *  em graus Celsius para Fahrenheit.Exiba o resultado     
     * no console.
     * 
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        scanner.close();
        
    }
}
