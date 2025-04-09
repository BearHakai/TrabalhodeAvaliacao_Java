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
 * 11.	Faça um algoritmo que permita ao usuário digitar um valor em metros (m)
 * e apresente em tela o valor convertido para centímetros (cm).
 */
public class Ex11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double metros;
        double cm;
        
        System.out.println("Quantos Metros quer converter em Centimetros? ");
        metros = scan.nextDouble();
        
        cm = metros * 1000;
        
        System.out.println("Conversao:" + "Metros: " + metros + "\n São: " +
                cm + " cm");
    }
}
