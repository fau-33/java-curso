package secao10_contadorDePalavras;

import java.util.Scanner;

/**
 * Objetivo: Criar um projeto que conta as palavras em uma frase
 * 
 * Etapas do projeto:
 * 1 - Obter uma frase do usuario
 * 2 - Conta as palavras de uma frase e exibir o resultado
 * 3 - Solicitar se o usuário quer digitar outra frase
 * 4 - Se sim, repetir logica de 1 a 2
 * 5 - Se nao, encerrar o programa 
 */


public class ContadorDePalavras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            // Solicitar uma frase
            System.out.println("Digite uma frase: ");
            String frase = scanner.nextLine();

            // Contar as palavras
            int quantidadePalavras = contarPalavras(frase);
            System.out.println("Quantidade de palavras: " + quantidadePalavras);

            // Solicitar se o usuário quer digitar outra frase
            System.out.println("Deseja digitar outra frase? (sim/nao) ");
            resposta = scanner.nextLine();

        } while (resposta.equalsIgnoreCase("sim"));

        // Mensagem de encerramento
        System.out.println("Programa encerrado. Obrigado!");

        scanner.close();
        
    }

    public static int contarPalavras(String frase) {
        if (frase == null || frase.trim().isEmpty()) {
            return 0;
        }
        String[] palavras = frase.split("\\s+");
        return palavras.length;
    }
}
