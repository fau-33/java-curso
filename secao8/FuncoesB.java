package secao8;

public class FuncoesB {

  // Escopo global
  static int globalVar = 20;

  public static void main(String[] args) {

    // 5 - Funções com condicionais
    String r1 = verificarAcesso(18, true, true);
    System.out.println(r1);

    String r2 = verificarAcesso(25, false, false);
    System.out.println(r2);

    // 6 - Funções com switch
    System.out.println(diaDaSemana(1));
    System.out.println(diaDaSemana(10));

    // 7 - System exit
    verificarAutenticacao("admin", "SenhaSegura");
    System.out.println("oi");

    // 8 - Documentação de função
    System.out.println(calcularMedia(5, 6, 7));

    // 9 - Escopos

    // escopo local
    int localVar = 10;

    if (true) {
      System.out.println(localVar);
    }
    System.out.println(globalVar);
    int testeFnEscopo = escopoLocal(localVar);
    System.out.println(testeFnEscopo);

  }

  public static String verificarAcesso(int idade,
      boolean temCarteira, boolean temHistoricoNegativo) {

    if (idade >= 18 && temCarteira && !temHistoricoNegativo) {
      return "Acesso permitido";
    } else if (idade >= 18 && temCarteira && temHistoricoNegativo) {
      return "Acesso permitido com restrições";
    } else {
      return "Acesso negado";
    }

  }

  public static String diaDaSemana(int dia) {
    return switch (dia) {
      case 1 -> "Segunda-feira";
      case 2 -> "Terça-feira";
      case 3 -> "Quarta-feira";
      case 4 -> "Quinta-feira";
      case 5 -> "Sexta-feira";
      case 6 -> "Sábado";
      case 7 -> "Domingo";
      default -> "Dia inválido";
    };
  }

  public static void verificarAutenticacao(String usuario, String senha) {
    if (!usuario.equals("admin") && !usuario.equals("SenhaSegura")) {
      System.out.println(" Autenticação falhou!");
      System.exit(1);
    }
    System.out.println("  Autenticação bem sucedida");
  }

  /**
   * Calcula a média de três números
   *
   * @param num1 number primeiro número/nota a ser enviado
   * @param num2 number segundo número/nota a ser enviado
   * @param num3 number terceiro número/nota a ser enviado
   * @return number A média das três notas
   */
  public static double calcularMedia(int num1, int num2, int num3) {
    return (num1 + num2 + num3) / 3;
  }

  public static int escopoLocal(int localVar) {
    System.out.println(globalVar);
    System.out.println(localVar);

    int testeFuncao = 1;
    return testeFuncao;
  }
}