package secao2;

public class Exercicios {
    /*   
    EXERCÍCIO 1:

    Crie uma variável int para armazenar o valor 10. 
    Crie uma segunda variável int que armazene o dobro do valor da primeira variável
    usando operadores aritméticos. 
    Exiba o resultado.

    EXERCÍCIO 2:

    Declare uma variável char que armazene a letra 'B'. 
    Faça o casting explícito dessa variável para int e exiba o valor numérico correspondente.

    EXERCÍCIO 3:

    Declare duas variáveis double para armazenar os valores 15.75 e 20.40. 
    Some os valores dessas variáveis e armazene o resultado em uma nova variável double. 
    Exiba o resultado.

    EXERCÍCIO 4:

    Declare uma variável long para armazenar o número 2 bilhões (2_000_000_000). 
    Em seguida, declare uma variável int e faça o casting explícito do valor long para int. 
    Exiba o resultado.

    EXERCÍCIO 5:

    Escreva um programa que crie uma variável String com o valor "Olá, Mundo!". 
    Em seguida, crie outra variável String que concatene a primeira variável com o texto 
    " Bem-vindo ao Java!". 
    Exiba o resultado.

 */
    public static void main(String[] args) {
        // EXERCICIO 1
        int valor = 10;
        double dobro = valor * 2;
        System.out.println(dobro);

        // EXERCICIO 2
        char letra = 'B';
        int numero = (int) letra;
        System.out.println(numero);

        // EXERCICIO 3
        double numero1 = 15.75;
        double numero2 = 20.40;
        double soma = numero1 + numero2;
        System.out.println(soma);

        // EXERCICIO 4
        long numero3 = 2_000_000_000L;
        int numero4 = (int) numero3;
        System.out.println(numero4);

        // EXERCICIO 5
        String frase1 = "Olá, Mundo!";
        String frase2 = " Bem-vindo ao Java!";
        String concatenacaoFrase = frase1 + frase2;
        System.out.println(concatenacaoFrase);
    }
}
