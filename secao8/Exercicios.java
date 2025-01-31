package secao8;

/*

    > Exercício 1: Função para Converter Temperatura

    Crie uma função que converta uma temperatura de Celsius para Fahrenheit.
    A função deve receber a temperatura em Celsius como argumento
    e retornar o valor correspondente em Fahrenheit.
    Exiba o resultado encapsulado em uma variável.

    > Exercício 2: Função para Calcular o Fatorial de um Número

    Crie uma função que calcule o fatorial de um número inteiro.
    Teste a função com um número de sua escolha.

    > Exercício 3: Função com if-else para Verificar Paridade

    Crie uma função que receba um número inteiro
    e retorne uma string indicando se o número é "Par" ou "Ímpar".
    Use condicionais if-else para determinar a paridade.

    > Exercício 4: Função com switch para Classificar Notas

    Crie uma função que receba uma nota de 0 a 10

    10 e 9: A, 8: B, 7: C, 6: D, restante F

    e retorne uma classificação de letra (A, B, C, D, F) usando um switch.
    Inclua uma verificação para garantir que a nota está dentro do intervalo válido.

    > Exercício 5: Função com System.exit para Verificar Idade

    Crie uma função que receba a idade de uma pessoa.
    Se a idade for menor que 18, use System.exit(0)
    para encerrar o programa com uma mensagem de "Acesso negado".
    Caso contrário, exiba "Acesso permitido".

    > Exercício 6 (Desafio): Função que Recebe um Array e Retorna o Maior Número

    Crie uma função que receba um array de inteiros
    e retorne o maior número presente no array.
    Utilize um loop para percorrer os elementos do array e identificar o maior valor.

*/
public class Exercicios {

  public static void main(String[] args) {

    // Exercicio 1: Função para converter temperatura
    double celsius = 50.0;
    double fahrenheit = converterCelsiusParaFahrenheit(celsius);
    System.out.println("A temperatura de  " + celsius + " C é equivalente a " + fahrenheit + " F");

    // Exercicio 2: Função para calcular fatorial
    int n = 20;
    int fatorial = calcularFatorial(n);
    System.out.println("O fatorial de " + n + " eh " + fatorial);

    // Exercicio 3: Função com if-else para verificar paridade
    int numero = 56;
    String paridade = verificarParidade(numero);
    System.out.println("O numero " + numero + " eh " + paridade);

    // Exercicio 4: Função com switch para classificar notas
    int nota = 5;
    String classificacao = classificarNota(nota);
    System.out.println("A nota " + nota + " eh " + classificacao);

    // Exercicio 5: Função com System.exit para verificar idade
    int idade = 20;
    System.out.println(idade);
    verificarIdade(idade);

    // Exercicio 6: Função que recebe um array e retorna o maior número
    int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int maiorNumero = encontrarMaiorNumero(numeros);
    System.out.println("O maior número do array eh: " + maiorNumero);

  }

  // Função
  public static double converterCelsiusParaFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
  }

  public static int calcularFatorial(int n) {
    int fatorial = 1;
    for (int i = 1; i <= n; i++) {
      fatorial *= i;
    }
    return fatorial;
  }

  public static String verificarParidade(int numero) {
    if (numero % 2 == 0) {
      return "Par";
    } else {
      return "Impar";
    }
  }

  public static String classificarNota(int nota) {
    if (nota < 0 || nota > 10) {
      return "Nota inválida";
    }

    switch (nota) {
      case 10:
      case 9:
        return "A";
      case 8:
        return "B";
      case 7:
        return "C";
      case 6:
        return "D";
      default:
        return "F";
    }
  }

  public static void verificarIdade(int idade) {
    if (idade < 18) {
      System.out.println("Acesso negado");
      System.exit(0);
    } else {
      System.out.println("Acesso permitido");
    }
  }

  public static int encontrarMaiorNumero(int[] numeros) {
    int maior = numeros[0];
    for (int i = 1; i < numeros.length; i++) {
      if (numeros[i] > maior) {
        maior = numeros[i];
      }
    }
    return maior;
  }
}
