package secao14;

/*
 * 
 * Exercício 2: Encontrar o Elemento Mais Frequente em um Array

    Desenvolva um programa que receba um array de inteiros 
    e determine qual elemento aparece com maior frequência. 
    Caso haja empate, exiba todos os elementos empatados.
 *
 */

public class Exercicios1 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 2, 2, 3, 3, 3, 1, 1, 1, 3, 3, 3 };
        int maiorFrequencia = 0;
        int elementoMaisFrequente = 0;

        for (int i = 0; i < array.length; i++) {
            int frequencia = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    frequencia++;
                }
            }
            if (frequencia > maiorFrequencia) {
                maiorFrequencia = frequencia;
                elementoMaisFrequente = array[i];
            }
        }

        System.out.println("Elemento mais frequente: " + elementoMaisFrequente);
    }

}
