/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author VINICIUS_4820
 * 
 * 20.	Construa um algoritmo que permita ao usuário digitar 4 números, 
 * calcule o quadrado de cada número digitado, some os valores e 
 * apresente em tela o resultado.
 */
public class Ex20 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double num1;
        double num2;
        double num3;
        double num4;
        double result;
        
        System.out.println("Digite o primeiro numero:");
        num1 = scan.nextDouble();
        
        System.out.println("Digite o segundo numero:");
        num2 = scan.nextDouble();
        
        System.out.println("Digite o terceiro numero:");
        num3 = scan.nextDouble();
        
        System.out.println("Digite o quarto numero:");
        num4 = scan.nextDouble();
        
        result = (num1 * num1) + (num2 * num2) + (num3 * num3) + (num4 * num4);
        
        System.out.println("O resultado de todos os numeros apos serem elevados"
                + " ao quadrado e: " + result);
    }
}
