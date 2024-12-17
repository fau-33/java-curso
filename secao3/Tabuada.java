package secao3;

import java.util.Scanner;

public class Tabuada {
    // Projeto Tabuada
    // Receber um numero pelo scanner, exibe a tabuada desse numero
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da tabuada: ");
        int numero = scanner.nextInt();

        System.out.println(numero + " + 1 = " + (numero + 1));
        System.out.println(numero + " + 2 = " + (numero + 2));
        System.out.println(numero + " + 3 = " + (numero + 3));
        System.out.println(numero + " + 4 = " + (numero + 4));
        System.out.println(numero + " + 5 = " + (numero + 5));
        System.out.println(numero + " + 6 = " + (numero + 6));
        System.out.println(numero + " + 7 = " + (numero + 7));
        System.out.println(numero + " + 8 = " + (numero + 8));
        System.out.println(numero + " + 9 = " + (numero + 9));
        System.out.println(numero + " + 10 = " + (numero + 10));

        System.out.println("");

        System.out.println(numero + " x 1 = " + (numero * 1));
        System.out.println(numero + " x 2 = " + (numero * 2));
        System.out.println(numero + " x 3 = " + (numero * 3));
        System.out.println(numero + " x 4 = " + (numero + 4));
        System.out.println(numero + " x 5 = " + (numero + 5));
        System.out.println(numero + " x 6 = " + (numero + 6));
        System.out.println(numero + " x 7 = " + (numero + 7));
        System.out.println(numero + " x 8 = " + (numero + 8));
        System.out.println(numero + " x 9 = " + (numero + 9));
        System.out.println(numero + " x 10 = " + (numero + 10));



        scanner.close();
    }
}
