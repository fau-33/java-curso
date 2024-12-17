package secao4;

import java.util.Locale;
import java.util.Scanner;

public class MediaAluno {
    // Obter nome do aluno e 3 notas
    // Exibir mensagem com nome e média final
    // Bônus: Se a nota for maior ou igual a 7, imprimir aprovado, se não: reprovado
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Usar ponto como separador decimal
        scanner.useLocale(Locale.US);

        // Obter nome do aluno
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        // Obter 3 notas
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcular media do aluno
        double media = (nota1 + nota2 + nota3) / 3;

        // Formata a media com 2 casas decimais
        media = Math.round(media * 100) / 100.0;
        
        // Exibir mensagem de aprovado ou reprovado
        if (media >= 7) {
            System.out.println("Aluno " + nome + " aprovado com media " + media);
        }else{
            System.out.println("Aluno " + nome + " reprovado com media " + media);
        }

        scanner.close();
    }
}
