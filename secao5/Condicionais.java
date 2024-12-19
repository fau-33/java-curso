package secao5;

public class Condicionais {
    public static void main(String[] args) {
        // 1 - O que é boolean?
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue);
        System.out.println(isFalse);

        // 2 - Operadores de comparação

        int a = 10;

        System.out.println(a == 10);
        System.out.println(a == 9);

        System.out.println(a != 10);
        System.out.println(a != 9);

        System.out.println(a > 10);
        System.out.println(a < 10);

        System.out.println(a >= 10);
        System.out.println(a <= 10);

        // 3 - Atribuição e comparação
        int b = 10;
        int c = 10;

        System.out.println(a = 12);
        System.out.println(a == b);
        System.out.println(a == c);

        // 4 - Comparação de strings

        String str1 = "java";
        String str2 = new String("java");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2);

        System.out.println(str1 == "java");

        System.out.println(str1.equals(str2));

        System.out.println(str1.equals("java"));

        String str3 = "JAVA";

        System.out.println(str3.equals(str1));
        
        // Ignora a diferenca entre maiusculas e minusculas
        System.out.println(str3.equalsIgnoreCase(str1));
    }
}
