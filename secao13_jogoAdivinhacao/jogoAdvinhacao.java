package secao13_jogoAdivinhacao;

import java.util.Scanner;

/**
 * Objetivo: O usuário precisa adivinhar um número entre 1 e 100.
 * 
 * 1 - Criar um número aleatório entre 1 e 100.
 * 2 - Pedir o palpite do usuário.
 * 3 - salvar as tentativas do usuário que foram erradas (contagem).
 * 4 - Se o palpite do usuário for maior que o número aleatório, mostrar a mensagem "O número é menor".
 * 5 - Se o palpite do usuário for menor que o número aleatório, mostrar a mensagem "O número é maior".
 * 6 - Se o palpite do usuário for igual ao número aleatório, mostrar a mensagem "Você acertou!".
 * 7 - Mostrar a quantidade de tentativas que o usuário utilizou para acertar o número.
 */

 public class jogoAdvinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Gera número aleatório entre 1 e 100
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        int tentativas = 0;
        boolean acertou = false;

        while (!acertou) {
            System.out.print("Digite um número entre 1 e 100: ");
            int palpite = scanner.nextInt();

            // Validação do intervalo do palpite
            if (palpite < 1 || palpite > 100) {
                System.out.println("❌ Número inválido! Digite um valor entre 1 e 100.");
                continue; // Ignora tentativas fora do intervalo
            }

            tentativas++; // Conta apenas tentativas válidas

            // Lógica de verificação
            if (palpite < numeroAleatorio) {
                System.out.println("🔼 O número " + palpite + " é menor. Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("🔽 O número " + palpite + " é maior. Tente novamente.");
            } else {
                acertou = true; // Encerra o loop quando acertar
            }
        }

        // Exibe resultado final
        System.out.println("\n🎉 PARABÉNS! Você acertou!");
        System.out.println("🔮 O número secreto era: " + numeroAleatorio);
        System.out.println("📊 Total de tentativas válidas: " + tentativas);
        
        scanner.close();
    }
}
