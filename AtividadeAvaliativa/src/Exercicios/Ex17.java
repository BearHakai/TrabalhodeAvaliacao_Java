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
 * 17.	Faça um algoritmo que permita ao usuário digitar um valor em segundos e
 * apresente em tela o valor convertido para minutos.
 */
public class Ex17 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double seg;
        double min;
        
        System.out.println("Quantos Segundos quer converter em Minutos? ");
        seg = scan.nextDouble();
        
        min = seg / 60;
        
        System.out.println("Conversao:" + "Segundos: " + seg + "\n São: " +
                min + " Min");
    }
}
