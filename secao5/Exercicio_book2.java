package secao5;

import java.util.Scanner;

public class Exercicio_book2 {
    /**
     * exercicio 8: Crie um programa que peça ao usuário para 
     * para digitar seu nome e sobrenome. O programa deve exibir 
     * uma mensagem de boas-vindas concatenando o nome e o sobrenome.
     * 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Boas-vindas " + nome + " " + sobrenome + "!");

        scanner.close();
    }
}
