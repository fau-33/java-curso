package secao6_calcIMC;

import java.util.Scanner;

/*
 * Projeto Calculadora IMC
 * 1 - Pedir o peso em kg
 * 2 - Pedir a altura em m
 * 3 - calcular o IMC = peso / (altura * altura)
 * 4 - Exibir classificacao do IMC
 * < 18.5 = Abaixo do peso
 * >= 18.5 e <= 24.9 = Peso normal
 * >= 25 e <= 29.9 = Sobrepeso
 * >= 30 = Obesidade
 */

public class CalculadoraIMC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura em m: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String imcFormatado = String.format("%.2f", imc);


        if(imc < 18.5) {
            System.out.println("Seu IMC é: " + imcFormatado + " Abaixo do peso");
        } else if(imc >= 18.5 && imc <= 24.9) {
            System.out.println("Seu IMC é: " + imcFormatado + " Peso normal");
        } else if(imc >= 25 && imc <= 29.9) {
            System.out.println("Seu IMC é: " + imcFormatado + " Sobrepeso");
        } else {
            System.out.println("Seu IMC é: " + imcFormatado + " Obesidade");
        }

        scanner.close();
        
    }
}
