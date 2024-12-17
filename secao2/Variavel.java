package secao2;

public class Variavel{

    public static void main(String[] args) {
        // 5 - Char
        char letra = 'a';
        System.out.println(letra);
        String palavra = "A";
        System.out.println(palavra);
        char simbolo = '@';
        System.out.println(simbolo);

        // 6 - Int
        int numero = 10;
        System.out.println(numero);
        System.out.println(numero + 5);
        System.out.println(numero / 5);

        int soma = numero + 12;
        System.out.println(soma);

        // 7 - Long
        long populacaoMundial = 10000000000L;
        System.out.println(populacaoMundial);

        long grandeNumero = 1_000_000_000_000L;
        System.out.println(grandeNumero + 1);

        // 8 - Double
        double preco = 2.5;
        System.out.println(preco);
        System.out.println(preco - 12);
        System.out.println(preco / 2);

        double pi = 3.14_145_926_5;
        System.out.println(pi);

        // 9 - Operadores aritmeticos parte 1
        int a = 5;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // 10 - Operadores aritmeticos parte 2
        int x = 5;
        x++;
        System.out.println(x);
        int y = 4;
        y--;
        System.out.println(y);

        int a1 = 10;
        a1 += 5;
        System.out.println(a1);
        int b1 = 20;
        b1 -= 5;
        System.out.println(b1);

        // 11 - Type Casting
        // implicito(warning)
        int numero2 = 42;
        long numeroLong = numero2;
        System.out.println(numeroLong);
        double numeroDouble = numero2;
        System.out.println(numeroDouble);

        // explicito(narrowing)
        double valorDouble = 42.42;
        int valorInt = (int) valorDouble;
        System.out.println(valorInt);

        // casting de char para int
        char letraChar = 'a';
        int letraInt = (int) letraChar;
        System.out.println(letraInt);

    }
}