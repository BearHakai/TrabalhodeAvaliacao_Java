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
 * 8.	Faça um algoritmo que o usuário digite dois valores e apresente na tela 
 * o resultado das seguintes operações: soma, subtração, divisão e produto.
 * (Multplicação)
 */
public class Ex8 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double number1;
        double number2;
        double resAd;
        double resSub;
        double resDiv;
        double resMult;
        
        System.out.println("Informe o primeiro numero: ");
        number1 = scan.nextDouble();
        
        System.out.println("Informe o segundo numero: ");
        number2 = scan.nextDouble();
        
        resAd = number1 + number2;
        resSub = number1 - number2;
        resDiv = number1 / number2;
        resMult = number1 * number2;
        
        System.out.println("N° 1: " + number1 + "\nN°2: " + number2 + 
                "\nEm caso de Adicao: " + resAd +
                "\nEm caso de Subtracao: " + resSub +
                "\nEm caso de Divisao: " + resDiv +
                "\nEm caso de Multiplicacao: " + resMult);
        
    }
}
