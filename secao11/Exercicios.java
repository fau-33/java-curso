package secao11;

import java.util.Scanner;

/**
 * > Exercicio 1: Somátorio com o for
 * o somátorio de 1 a 100 e exiba o resultado.
 * 
 * > Exercicio 2: Impressão de números pares com o while
 * Desenvolva um programa que use o loop while para imprimir
 * todos os números pares de 1 a 20.
 * 
 * > Exercicio 3: Verificação de número primo com o for
 * Escreva um programa que receba um número do usuário
 * e use o loop for para verficar se ele é primo.
 * 
 * > Exercicio 4: Menu interativo com do-while
 * crie um programa que exiba um menu interativo do-while
 * permitindo ao usuário esoolher opções até que ele decida sair
 * 
 * > Exercicio 5: Fatorial de um número com o for
 * Desemvolva um programa que calcule o fatorial de um número
 * inteiro positivo usando o loop for.
 * 
 * > Exercicio 6: Contagem de dígitos de um número com while
 * Crie um programa que conte quantos digitos tem um número 
 * inteiro positivo e exiba o resultado.
 */

public class Exercicios {
  public static void main(String[] args) {

    // Exercicio 1: Somátorio com o for
    int soma = 0;
    for(int i = 1; i <= 100; i++) {
      soma += i;
    }
    System.out.println("O somatorio de 1 a 100 eh " + soma);

    // Exercicio 2: Impressão de números pares com o while
    int i = 1;
    while(i <= 20) {
      if(i % 2 == 0) {
        System.out.println(i);
      }
      i++;
    }

    // Exercicio 3: Verificação de número primo com o for
    // Scanner scanner = new Scanner(System.in);

    // System.out.println("Digite um numero: ");
    // int numero = scanner.nextInt();

    // boolean ehPrimo = true;

    // for(int j = 2; j < numero; j++) {
    //   if(numero % j == 0) {
    //     ehPrimo = false;
    //     break;
    //   }
    // }

    // if(ehPrimo) {
    //   System.out.println("O numero eh primo");
    // } else {
    //   System.out.println("O numero nao eh primo");
    // }

    // scanner.close();

    // Exercicio 4: Menu interativo com do-while
    // Scanner scanner2 = new Scanner(System.in);
    // int opcao;

    // do {
    //   // Menu interativo
    //   System.out.println("=== MENU INTERATIVO === ");
    //   System.out.println("1. Opção 1: Dizer Olá");
    //   System.out.println("2. Opção 2: Mostrar números de 1 a 10");
    //   System.out.println("3. Sair");
    //   System.out.println("Escolha uma opção: ");
    //   opcao = scanner2.nextInt();

    //   switch(opcao) {
    //     case 1:
    //       System.out.println("Olá! Você escolheu a Opção 1.");
    //       break;
    //     case 2:
    //       System.out.println("Números de 1 a 10: ");
    //       for(int k = 1; k <= 10; k++) {
    //         System.out.println(k + " ");
    //       }
    //       break;
    //     case 3:
    //       System.out.println("Saindo do programa...");
    //       break;
    //     default:
    //       System.out.println("Opção inválida! Tente novamente.");
    //   }
    //   System.out.println();

    // }while(opcao != 3);

    // scanner2.close();

    // Exercicio 5: Fatorial de um número com o for
    int num = 5;

    if(num < 0) {
      System.out.println("O fatorial de um número negativo não existe.");
    } else {
      int fatorial = 1;
      for(int j = 1; j <= num; j++) {
        fatorial *= j;
      }
      System.out.println("O fatorial de " + num + " eh " + fatorial);
    }

    // Exercicio 6: Contagem de dígitos de um número com while
    int num2 = 12345;
    int contagem = 0;

    while(num2 > 0) {
      num2 /= 10;
      contagem++;
    }

    System.out.println("O numero " + num2 + " tem " + contagem + " digitos.");
     
    
  }
}
