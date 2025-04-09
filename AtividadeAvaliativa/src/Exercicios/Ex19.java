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
 * 19.	Construa um algoritmo que permita ao usuário digitar um valor em 
 * dólares, converta esse valor em reais e apresente em tela o resultado. 
 * Cotação do dólar: R$ 5.37
 */
public class Ex19 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double dolar;
        double cotacao = 5.37;
        double real;
        
        System.out.println("Quantos Dolares quer converter? ");
        dolar = scan.nextDouble();
        
        real = dolar * cotacao;
        
        System.out.println("Conversao: \nDolar inserido: $ " + dolar +
                "\nReal: R$ " + real);
        
    }
}
