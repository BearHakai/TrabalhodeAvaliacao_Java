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
 * 12.	Faça um algoritmo que permita ao usuário digitar um valor em 
 * centímetros (cm) e apresente em tela o valor convertido para metros (m).
 */
public class Ex12 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double metros;
        double cm;
        
        System.out.println("Quantos Centimetros quer converter em Metros? ");
        cm = scan.nextDouble();
        
        metros = cm / 1000;
        
        System.out.println("Conversao:" + "Centimetros: " + cm + "\n São: " +
                metros + " m");
    }
}
