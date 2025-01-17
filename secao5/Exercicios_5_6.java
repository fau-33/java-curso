package secao5;

import java.util.Scanner;

/*
 * > EXERCÍCIO 5: Verificação de intervalo com AND
 * Peça ao usuario para digitar um número.
 * verifique se o número estiver entre 10 e 20, inclusive.
 * se estiver , exiba "dentro do intervalo". caso contrario, exiba "fora do intervalo".
 * 
 * 
 * 
 * > EXERCÍCIO 6: Classificação de letra
 * Peça ao usuario para digitar uma letra.
 * Verifique se é uma vogal ou uma consoante.
 * Exiba "vogal" ou "consoante" de acordo com a entrada.
 * considere letras maiúsculas e minúsculas.
 *  
 * 
 */

public class Exercicios_5_6 {
    public static void main(String[] args) {

        // EXERCÍCIO 5: Verificação de intervalo com AND
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Digite um numero: ");
        // int numero = scanner.nextInt();

        // if(numero >= 10 && numero <= 20) {
        //     System.out.println("Dentro do intervalo");
        // } else {
        //     System.out.println("Fora do intervalo");
        // }

        // scanner.close();

        // EXERCÍCIO 6: Classificação de letra
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String entrada = scanner2.nextLine().toLowerCase();


    if (entrada.length() == 1 && Character.isLetter(entrada.charAt(0))) {
    char letra = entrada.charAt(0);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
        System.out.println("Vogal");
    } else {
        System.out.println("Consoante");
    }
} else {
    System.out.println("Entrada inválida. Por favor, digite apenas uma letra.");
}    

        scanner2.close();
        
    }
}
