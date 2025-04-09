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
 * 9.	Faça um algoritmo que o usuário digite o valor de litros e calcule a 
 * conversão em mililitros e apresente o resultado na tela.
 */
public class Ex9 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double litros;
        double mililitros;
        
        System.out.println("Quantos litros quer converter em mililitros? ");
        litros = scan.nextDouble();
        
        mililitros = litros * 1000;
        
        System.out.println("Conversao:" + "Litros: " + litros + "\n São: " +
                mililitros + " ml");
    }
}
