package secao9_conversorTemperatura;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Objetivo: Criar um conversor de celsius para fahrenheit e vice versa
 * 
 * Etapas do projeto:
 * 1 - Obter do usuario se ele quer converter celsius para fahrenheit
 * 2 - Criar duas funções uma para cada conversão
 * 3 - Obter a temperatura em cada uma das funções escolhidas
 * 4 - Exibir uma mensagem com a temperatura, ex: De x C para y F
 */

public class ConversorTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criando um menu escolha de conversão do usuário
        System.out.println("Escolha a conversão desejada: ");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        int escolha = scanner.nextInt();

        // Criando um objeto DecimalFormat para formatar com duas casas decimais
        DecimalFormat df = new DecimalFormat("0.00");

        // Condicional para escolha de conversão
        if(escolha == 1) {
            System.out.println("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = converterCelsiusParaFahrenheit(celsius);
            System.out.println("De " + df.format(celsius) + "°C para " + df.format(fahrenheit) + "°F");
        } else if(escolha == 2) {
            System.out.println("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = converterFahrenheitParaCelsius(fahrenheit);
            System.out.println("De " + df.format(fahrenheit) + "°F para " + df.format(celsius) + "°C");
        } else {
            System.out.println("Escolha inválida. Por favor, reinicie o programa e escolha 1 ou 2.");
        }

        scanner.close();
        
    }

    public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static double converterFahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}
