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
 * 1.	Construa um algoritmo para somar dois números digitados pelo usuário
 * e multiplicar o resultado pelo primeiro. 
 */
public class Ex1 {
    
    public static void main(String[]args){
        
        Scanner scan = new Scanner(System.in);
        
        double number1;
        double number2;
        double result;
        
        System.out.println("Informe o Primeiro Numero: ");
        number1 = scan.nextDouble();
        
        System.out.println("Informe o Segundo Numero: ");
        number2 = scan.nextDouble();
        
        result = (number1 + number2) * number1;
        
        System.out.println("Num1: " + number1 + "\nNum2: " + number2 + 
                "\nA soma deles multiplicado pelo primeiro numero é: " + result);
    }
}
