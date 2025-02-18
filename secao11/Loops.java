package secao11;

public class Loops {
    public static void main(String[] args) {
        
        // 1 - FOR
        // Loop que vai de 1 ate 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // Mostra cada caractere da String
        String palavra = "Java";

        for (int i = 0; i < palavra.length(); i++) {
            System.out.println("caractere: " + palavra.charAt(i));

        }

        // COntagem regressiva
        for (int i = 5; i >= 1; i--) {
            System.out.println("Count: " + i);
        }


        // 2 - WHILE
        int i = 0;

        while(i <= 5){
            System.out.println("Count While: " + i);

            i++;
        }

        int valor = 0;

        while (valor != 7) {
            valor = (int) (Math.random() * 10);

            System.out.println("Valor: " + valor);

            valor++;
            
        }

        // 3 - LOOP INFINITO
        // while (true) {
        //     System.out.println("Loop infinito!");
        // }

        // 4 - DO WHILE
        int j = 10;

        do {
            System.out.println("Count: " + j);
            j--;
        } while (j > 0);

        int numero = 0;

        do {
            numero = (int) (Math.random() * 10);
            System.out.println("Numero: " + numero);
        } while (numero != 1);

        // 5 - break
        // o break pode ser usado em qualquer estrutura 
        for (int k = 0; k <= 10; k++) {
            System.out.println("Count: " + k);

            if (k == 5) {
              System.out.println("Parando o loop!");
                break;
            }
        }

        // 6 - continue
        for(int x = 10; x >= 0; x--){
            if(x % 2 == 0){
              System.out.println("Par!");
                continue;
            }
            System.out.println("Count: " + x);
        }

        // 7 - Nested Loops
        for (int m = 1; m <= 3; m++) {
          System.out.println("Loop externo");
            for (int n = 1; n <= 3; n++) {
                System.out.println("m: " + m + " n: " + n + (m * n));
            }
        }

        // padrão estrela
        for(int o = 1; o <= 5; o++){
            for(int p = 1; p <= o; p++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
