package secao7_classificacaoProduto;

import java.util.Scanner;

/**
 * Projeto Classificação de produto
 * 1 - Pedir o preco do produto
 * 2 - Verificar se o produto esta catalogado
 * 3 - se sim, podemos escolher alterar o preco ou não
 * 4 - se alterar preco, exibir classificação (abaixo)
 * 5 - senao alterar encerre o programa
 * 6 - se não pedir o preco do produto
 * 7 - exibir classificação (abaixo)
 * 8 - classificações: preco < 50 = barato, 50 <= preco <= 100 = medio, preco > 100 = caro
 * 9 - exibir no fim nome do produto e preco
 */

 public class ClassificacaoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeProduto;
        double preco;
        String catalogado;
        String classificacao;

        // Produtos pré-cadastrados
        String produto1 = "Celular";
        String produto2 = "Notebook";
        String produto3 = "Fone de ouvido";

        System.out.println("Digite o nome do produto: ");
        nomeProduto = scanner.nextLine();

        System.out.println("Digite o preco do produto: ");
        preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha

        System.out.println("O produto está catalogado? (sim/nao): ");
        catalogado = scanner.nextLine().toLowerCase();

        if (catalogado.equals("sim") || nomeProduto.equals(produto1) || nomeProduto.equals(produto2) || nomeProduto.equals(produto3)) {
            System.out.println("Deseja alterar o preco? (sim/nao): ");
            String alterarPreco = scanner.nextLine().toLowerCase();
            
            if (alterarPreco.equals("sim")) {
                System.out.println("Digite o novo preco: ");
                preco = scanner.nextDouble();
            } else {
                System.out.println("Programa encerrado.");
                scanner.close();
                return;
            }
        }

        if (preco < 50) {
            classificacao = "Barato";
        } else if (preco <= 100) {
            classificacao = "Medio";
        } else {
            classificacao = "Caro";
        }

        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Preco do produto: R$ " + String.format("%.2f", preco));
        System.out.println("Classificação do produto: " + classificacao);

        scanner.close();
    }
}
