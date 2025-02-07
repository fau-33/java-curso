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
    }
}
