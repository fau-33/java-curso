package secao5;

import java.util.Scanner;

/*
 * > EXERCÍCIO 3: Identificação de paridade com strings
 * Peça ao usuario para digitar um número.
 * Verifique se for par ou impar e exiba a mensagem correspondente.
 * use uma string para armazenar a resposta e exiba o resultado.
 * 
 * 
 * 
 * > EXERCÍCIO 4: Identificação de dia util
 * Peça ao usuario para digita um numero de 1 a 7.
 * representando os dias da semana.(1 domingo, 7 sabado)
 * use o switch para identificar um dia util(segunda a sexta)
 * ou final de semana (sabado ou domingo)
 * Exiba uma mensagem correspondente. 
 * 
 */
public class Exercicios_3_4 {
    public static void main(String[] args) {
        // EXERCÍCIO 3: Identificação de paridade com strings
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        String resultado = "";

        if(numero % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Impar";
        }

        System.out.println("O numero " + numero + " eh " + resultado);

        scanner.close();

        // EXERCÍCIO 4: Identificação de dia util
        // Scanner scanner2 = new Scanner(System.in);

        // System.out.println("Digite um numero de 1 a 7: ");
        // int dia = scanner2.nextInt();

        // switch(dia ){
            
        //     case 1:
        //     System.out.println("Domingo - Final de semana");
        //     break;
        // case 2:
        //     System.out.println("Segunda-feira - Dia util");
        //     break;
        // case 3:
        //     System.out.println("Terça-feira - Dia util");
        //     break;
        // case 4:
        //     System.out.println("Quarta-feira - Dia util");
        //     break;
        // case 5:
        //     System.out.println("Quinta-feira - Dia util");
        //     break;
        // case 6:
        //     System.out.println("Sexta-feira - Dia util");
        //     break;
        // case 7:
        //     System.out.println("Sábado - Final de semana");
        //     break;
        // default:
        //     System.out.println("Numero invalido. Digite um numero de 1 a 7.");
        //     break;

        // }

        // scanner2.close();
    }
}
