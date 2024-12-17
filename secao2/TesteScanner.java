package secao2;

import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) {
        
        // 1 - Testando Scanner
        Scanner scanner = new Scanner(System.in);
        // Mensagem para o usuário
        System.out.println("Digite seu nome? ");

        // Leitura do nome
        String nome = scanner.nextLine();

        // Imprime a saudação
        System.out.println("Olá " + nome + "!");

        // nextInt()
        System.out.println("Digite a sua idade? ");
        int idade = scanner.nextInt();

        System.out.println("Idade digitada: " + idade);

        // Problema com nextLine()
        System.out.println("Digite um numero: ");
        String numero = scanner.nextLine();

        scanner.nextLine();

        System.out.println("Digite um texto: ");

        String txt = scanner.nextLine();
        System.out.println(txt);

        System.out.println("Os dados são " + numero + " e " + txt);


        scanner.close();



        
    }
}
