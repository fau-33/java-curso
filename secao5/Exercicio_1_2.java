package secao5;

import java.util.Scanner;

/*
 * > EXERCÍCIO 1: Verificação de categoria de preço
 * 
 * Peça ao usuario para digitar o preço de um produto.
 * Se o preço for menor que 50 reais, exiba a mensagem "Barato".
 * Se o preço estiver entre 50 e 100 reais, exiba a mensagem "Médio".
 * Se o preço for maior que 100 reais, exiba a mensagem "Caro". exiba a categoria correspondente.
 * 
 * > EXERCÍCIO 2: Verificação de login
 * Peça ao usuario para digitar o login e a senha.
 * verifique se o login "admin" e a senha "1234".
 * se ambos forem corretos, exiba a mensagem "Acesso permitido".
 * senação, exiba a mensagem "Acesso negado".
 */
public class Exercicio_1_2 {
    public static void main(String[] args) {

        // EXERCÍCIO 1: Verificação de categoria de preco
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Digite o preco do produto: ");
        // double preco = scanner.nextDouble();

        // if(preco < 50) {
        //     System.out.println("Barato");
        // } else if(preco >= 50 && preco <= 100) {
        //     System.out.println("Médio");
        // } else if(preco > 100) {
        //     System.out.println("Caro");
        // }
        // scanner.close();

        // EXERCÍCIO 2: Verificação de login
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Digite o login: ");
        String login = scanner2.nextLine();

        System.out.println("Digite a senha: ");
        String senha = scanner2.nextLine();

        if(login.equals("admin") && senha.equals("1234")) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }

        scanner2.close();
        
    }
}
