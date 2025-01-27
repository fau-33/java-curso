package secao5;

import java.util.Scanner;

public class Exercicio_book7 {
    /**
     * exercicio 13: Desenvolva um programa que leia a largura e a 
     * altura de um retangulo e calcule a area. Exiba
     * o resultado no console.
     * 
     * 
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();

        System.out.println("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = largura * altura;

        System.out.println("Area do retângulo: " + area);

        scanner.close();
        
    }
}
