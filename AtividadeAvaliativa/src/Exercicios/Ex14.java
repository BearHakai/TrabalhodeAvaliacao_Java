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
 * 14.	Faça um algoritmo que permita ao usuário digitar um valor em horas e
 * apresente em tela o valor convertido para minutos.
 */
public class Ex14 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double h;
        double min;
        
        System.out.println("Quantas Horas quer converter em Minutos? ");
        h = scan.nextDouble();
        
        min = h * 60;
        
        System.out.println("Conversao:" + "HOras: " + h + "\n São: " +
                min + " min");
    }
}
