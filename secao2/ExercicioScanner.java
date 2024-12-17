package secao2;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioScanner {
    /*
     * EXERCÍCIO 5: Escreva um programa que leia um número inteiro 
     * e um decimal do teclado e, em seguida,
     *  exiba a soma desses numeros no console. 
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Digite um numero inteiro: ");
        int numeroInteiro = scanner.nextInt();

        System.out.println("Digite um numero decimal: ");
        double numeroDecimal = scanner.nextDouble();

        double soma = numeroInteiro + numeroDecimal;

        System.out.println("A soma dos numeros é: " + soma);

        scanner.close();
        
    }
}
