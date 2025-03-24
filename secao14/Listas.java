package secao14;


import java.util.ArrayList;
import java.util.Arrays;

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

        // 3 - for each
        for(int numero: numeros){
            System.out.println("O numero da vez é: " + numero);
        }

        // Concatenar elementos em um array
        String[] palavras = {"Java", "é", "Bom"};

        String frase = "";

        for (String palavra : palavras) {
            frase += palavra + " ";
        }
        System.out.println(frase);

        // Verificar se valor está presente em um array
        char[] letras = {'a', 'b', 'c', 'd', 'e'};

        char letraProcurada  = 'c';

        for(char letra: letras){
            if(letra == letraProcurada){
                System.out.println("A letra " + letraProcurada + " foi encontrada");
                break;
            }
        }
        // 5 - Loop com condicionais if
        // filtar e somar numeros pares
        int somaPares = 0;

        for(int numero: numeros){
            if(numero % 2 == 0){
                somaPares += numero;
            }
        }
        System.out.println("A soma dos numeros pares é: " + somaPares);

        // Exibir valores maiores que um determinado valor
        int[] nums = {1, 200, 300, 400, 200, 6, 700, 8};

        int limite = 10;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > limite){
                System.out.println("O numero " + nums[i] + " eh maior que " + limite);
            }
        }

        String[] linguagens = {"Java", "Python", "C++", "C#"};

        String linguagemAlvo = "Java";

        for(String linguagem: linguagens){
            if(linguagem.equals(linguagemAlvo)){
                System.out.println("A linguagem " + linguagem + " foi encontrada parando o loop");
                break;
            }else {
                System.out.println("A linguagem " + linguagem + " nao foi encontrada");
            }
        }

        // 6 - Atualizar valores em um array
        for(int i = 0; i < numeros.length; i++){
            numeros[i] *= 2;
        }
        System.out.println(numeros[1]);

        for(int numero: numeros){
            System.out.println("O numero dobrado é: " + numero);
        }

        numeros[5] = 1;
        System.out.println(numeros[5]);

        for(int i = 0; i < frutas.length; i++){
            if(frutas[i].equals("Banana")){
                frutas[i] = "Abacaxi";
            }
        }

        System.out.println(frutas[0]);

        // 7 - Metodos to String
        //Classes java, que vai ter método em arrays são métodos utilitários
        String dadosNumericos = Arrays.toString(numeros);

        System.out.println(dadosNumericos);

        String dadosFrutas = Arrays.toString(frutas);

        System.out.println(dadosFrutas);

        int[] teste = new int[3];

        System.out.println(Arrays.toString(teste));

        // 8 - Adicinando novos itens em um array
        // ex1: Criano um novo array maior e copiando os elementos antigos
        int[] novoArray = new int[numeros.length + 1];

        for(int i = 0; i < numeros.length; i++){
            novoArray[i] = numeros[i];
        }
        System.out.println(Arrays.toString(novoArray));

        novoArray[novoArray.length - 1] = 100;

        System.out.println(Arrays.toString(novoArray));

        // ex2: Utlizando arraycop para copiar os elementos
        String[] novoFrutas = new String[frutas.length + 1];
        System.arraycopy(frutas, 0, novoFrutas, 0, frutas.length);

        novoFrutas[novoFrutas.length - 1] = "Laranja";

        System.out.println(Arrays.toString(novoFrutas));

        // ex3: Usando arraylist
        ArrayList<String> listaFrutas = new ArrayList<>(Arrays.asList("Maçã", "Banana", "Abacaxi"));

        System.out.println(listaFrutas); 
        listaFrutas.add("Manga");

        System.out.println(listaFrutas);
    }

}
