package secao8;

import java.util.Arrays;
import java.util.List;

public class FuncoesC {
    public static void main(String[] args) {
        
        // 12 - Funções recursivas
        int soma = somaRecursiva(5);
        System.out.println(soma);

        // 13 - Method overloading
        System.out.println(soma(10, 20));
        System.out.println(soma(10, 20, 30));
        System.out.println(soma(10.0, 20.0));

        // 14 - Funções anonimas
        Runnable tarefa = () -> System.out.println("Função anonima executada");
        tarefa.run();

        // (args1, args2) -> System.out.println("Função anonima executada");

        List<String> nomes = Arrays.asList("Flávio", "Maria", "João");
        nomes.forEach(n -> System.out.println(n));
    }

    public static int somaRecursiva(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + somaRecursiva(num - 1);
        }
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int soma(int a, int b, int c) {
        return a + b + c;
    }

    public static double soma(double a, double b) {
        return a + b;
    }
}
