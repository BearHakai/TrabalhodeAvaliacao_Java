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
 * 13.	Faça um algoritmo que permita ao usuário digitar um valor em
 * quilômetros (km) e apresente em tela o valor convertido para metros (m).
 */
public class Ex13 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double km;
        double metros;
        
        System.out.println("Quantos Quilometros quer converter em Metros? ");
        km = scan.nextDouble();
        
        metros = km * 1000;
        
        System.out.println("Conversao:" + "Quilometros: " + km + "\n São: " +
                metros + " m");
    }
}
