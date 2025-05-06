package secao14;

/*
 * 
 * Exercício 3: Transpor uma matriz 2D

    Crie um programa que receba uma matriz 2D
    e crie uma matriz transposta (troca de linhas por colunas)
    Exiba a matriz original e matriz transposta.
 *
 */

 public class Exercicios2 {
  public static void main(String[] args) {
      // Definindo a matriz original
      int[][] matrizOriginal = {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}
      };

      // Obtendo as dimensões da matriz original
      int linhas = matrizOriginal.length;
      int colunas = matrizOriginal[0].length;

      // Criando a matriz transposta
      int[][] matrizTransposta = new int[colunas][linhas];

      // Preenchendo a matriz transposta
      for (int i = 0; i < linhas; i++) {
          for (int j = 0; j < colunas; j++) {
              matrizTransposta[j][i] = matrizOriginal[i][j];
          }
      }

      // Exibindo a matriz original
      System.out.println("Matriz Original:");
      exibirMatriz(matrizOriginal);

      // Exibindo a matriz transposta
      System.out.println("\nMatriz Transposta:");
      exibirMatriz(matrizTransposta);
  }

  // Método para exibir uma matriz
  public static void exibirMatriz(int[][] matriz) {
      for (int[] linha : matriz) {
          for (int elemento : linha) {
              System.out.print(elemento + " ");
          }
          System.out.println();
      }
  }
  
}
