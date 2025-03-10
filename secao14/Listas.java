package secao14;

public class Listas {
    public static void main(String[] args) {
        
        // 1 -Sintaxe com arrays
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(numeros[0]);

        // Tamanho fixo, só que vazio
        String[] frutas = new String[3];

        frutas[0] = "Banana";
        frutas[1] = "Maçã";
        frutas[2] = "Pêra";

        System.out.println(frutas[1]);

        // frutas[3] = "Uva";

        // Loops em arrays

        // somar todos os elementos de um array
        // acessar os elementos e condensar a soma deles em uma variável
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("A soma dos elementos é: " + soma);

        // for each
        for (String fruta : frutas) {
            System.out.println("A fruta da vez é: " + fruta);
        }

        // Encontrar o maior elemento de um array
        int[] valores = {1, 200, 300, 400, 200, 6, 700, 8};

        int maior = valores[0];

        int j = 0;

        while (j < valores.length) {
            if (valores[j] > maior) {
                maior = valores[j];
            }
            j++;
            
        }
        System.out.println("O maior elemento é: " + maior);
    }

}
