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
 * 15.	Faça um algoritmo que permita ao usuário digitar um valor em minutos e
 * apresente em tela o valor convertido para horas.
 */
public class Ex15 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double h;
        double min;
        
        System.out.println("QuantOS Minutos quer converter em Horas? ");
        min = scan.nextDouble();
        
        h = min / 60;
        
        System.out.println("Conversao:" + "Minutos: " + min + "\n São: " +
                h + " h");
    }
}
