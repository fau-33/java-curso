package secao14;

import java.util.Scanner;

/**
 * 
    > Exercício 1: Inverter Elementos de um Array

    Crie um programa que receba um array de inteiros do usuário 
    e inverta a ordem dos elementos. 
    Exiba o array original e o array invertido.

    [1, 2, 3]
    [3, 2, 1]
    
    > Exercício 3: Transpor uma Matriz 2D

    Crie um programa que receba uma matriz 2D 
    e crie a matriz transposta (troca de linhas por colunas). 
    Exiba a matriz original e a matriz transposta.
    
    > Exercício 4: Substituir Valores em um Array com Condição

    Escreva um programa que receba um array de inteiros 
    e substitua todos os valores negativos por zero. 
    Exiba o array antes e depois da modificação.


    // [ -1, 2 , 3]
    // [0, 2, 3]
    
    > Exercício 5: Remover Elementos Duplicados de um Array

    Desenvolva um programa que remova os elementos duplicados de um array de inteiros, 
    mantendo apenas a primeira ocorrência de cada valor. 
    Exiba o array original e o array sem duplicatas.

    [1, 1, 2, 2, 3]
    [1, 2, 3]
    
*/


public class Exercicios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos do array separados por vírgulas: ");
        String entrada = scanner.nextLine(); // Lê a entrada como uma string

        // Divide a string em partes usando a vírgula como delimitador
        String[] elementos = entrada.split(",");

        // Cria um array de inteiros com base nos elementos
        int[] array = new int[elementos.length];
        for (int i = 0; i < elementos.length; i++) {
            array[i] = Integer.parseInt(elementos[i].trim()); // Converte para inteiro e remove espaços extras
        }

        // Exibe o array original
        System.out.println("Array original: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Exibe o array invertido
        System.out.println("\nArray invertido: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
