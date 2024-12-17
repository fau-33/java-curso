package secao2;

public class Exercicios_book {
    /*
      EXERCÍCIO 1: Crie um programa que declare e inicialize
      variáveis de todos os tipos primitivos em java (int, long, float, double, char, boolean). Exiba o valor de cada variável.

      EXERCÍCIO 2: Crie um programa que converta um valor double em int e outro valor int em double.Exiba o resultado.(Casting)

      EXERCÍCIO 3: Crie um programa que declare duas variáveis int e realize as operações de soma, subtração, multiplicação, divisão e módulo entre elas.Exiba o resultado de cada operação.

      EXERCÍCIO 4: Crie um programa que utilize a palavra-chave final para declarar uma constante que representa a velocidade da luz. Exiba o valor dessa constante.
     */
    public static void main(String[] args) {
        //Exercicio 1
        int idade = 20;
        double altura = 1.80;
        char sexo = 'M';
        boolean estudante = true;

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estudante: " + estudante);

        //Exercicio 2
        double valorDouble = 9.99;
        int valorInt = (int) valorDouble;//Conversão explícita de double para int

        int numeroInt = 10;
        double numeroConvertido = (double) numeroInt;//Conversão implicita de int para double

        System.out.println("Valor convertido para int: " + valorInt);
        System.out.println("Valor convertido para double: " + numeroConvertido);

        //Exercicio 3
        int a = 10;
        int b = 3;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int modulo = a % b;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);

        //Exercicio 4
        final double VELOCIDADE_DA_LUZ = 299792458;//metros por segundo
        System.out.println("Velocidade da luz: " + VELOCIDADE_DA_LUZ + " m/s");

        //VELOCIDADE_DA_LUZ = 300000000;//Erro, pois a constante VELOCIDADE_DA_LUZ foi declarada como final
    }
}
