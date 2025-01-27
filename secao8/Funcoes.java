package secao8;

public class Funcoes {
    public static void main(String[] args) {
        
        // 1 - Criando a primeira função
        saudacao();

        // 2 - Parâmetros da função
        soma(10, 20);
        soma(10, 100);

        saudar("Flávio");

        // 3 - Retorno da função
        int numero = 50;
        int nummeroDobrado = dobrar(numero);
        System.out.println("O numero dobrado é: " + nummeroDobrado);
        System.out.println(dobrar( 120));

        // 4 - Retorno de variaveis
        String r1 = verificarPar(numero);
        String r2 = verificarPar(5);
        System.out.println(r1);
        System.out.println(r2);

        int nummeroDobrado2 = dobrar(soma2(30, 20));
        System.out.println(nummeroDobrado2);
        
    }

    public static void saudacao() {
        System.out.println("Ola, seja bem vindo!");
    }

    public static void soma(int a, int b){
        int resultado = a + b;
        System.out.println("O resultado da soma é: " + resultado);

    }
    
    public static void saudar(String nome) {
        System.out.println("Ola, seja bem vindo ! " + nome + "!");
    }

    // Parâmetros com funções diferentes, podem ter o mesmo nome
    public static int dobrar(int num) {
        return num * 2;
    }

    public static String verificarPar(int num) {
        if(num % 2 == 0) {
            return "O numero é " + num + " par";
        } else {
            return "O numero é " + num + " impar";
        }
    }

    public static int soma2(int a, int b){
        return a + b;

    }


}
