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
 * 10.	Faça um algoritmo que o usuário digite o valor de mililitros (ml) e
 * calcule a conversão para litros (l) e apresente o resultado na tela.
 */
public class Ex10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double litros;
        double mililitros;
        
        System.out.println("Quantos Mililitros quer converter em Litros? ");
        mililitros = scan.nextDouble();
        
        litros = mililitros / 1000;
        
        System.out.println("Conversao:" + "Mililitros: " + mililitros + "\n São: " +
                litros + " L");
    }
}
