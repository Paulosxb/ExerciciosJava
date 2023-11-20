/*1 - Escreva um programa que solicite ao usuario dois numeros e exiba a soma, subtração, multiplicação e divisão entre eles*/

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nexDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nexDouble();

        double soma - numero1 + numero2;
        double subtracao = numero1 + numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        scanner.close();
        /*Apenas um teste */
}