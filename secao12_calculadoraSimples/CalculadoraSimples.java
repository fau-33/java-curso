package secao12_calculadoraSimples;

import java.util.Scanner;

/**
 * Calculadora Simples
 * Objetivo: Criar uma calculadora que realiza operações básicas (+, -, *, /)
 * 
 * Funcionalidades:
 * 1. Lê dois números do usuário
 * 2. Apresenta menu de operações numéricas
 * 3. Realiza cálculos com tratamento de erros
 * 4. Exibe resultados formatados
 */
public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean operacaoValida = true;
        double resultado = 0;
        String operadorSimbolo = ""; // Armazena o símbolo da operação

        // Entrada do primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        // Entrada do segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Menu de operações
        System.out.println("\nEscolha uma operação:");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");
        
        int opcao = scanner.nextInt();

        // Lógica de cálculo com tratamento de erros
        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                operadorSimbolo = "+";
                break;
            case 2:
                resultado = numero1 - numero2;
                operadorSimbolo = "-";
                break;
            case 3:
                resultado = numero1 * numero2;
                operadorSimbolo = "*";
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    operadorSimbolo = "/";
                } else {
                    operacaoValida = false;
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            default:
                operacaoValida = false;
                System.out.println("Erro: Operação inválida!");
                break;
        }

        // Exibição do resultado formatado
        if (operacaoValida) {
            System.out.printf("\nResultado: %.2f %s %.2f = %.2f", 
                numero1, operadorSimbolo, numero2, resultado);
        }

        scanner.close(); // Fecha o Scanner
    }
}