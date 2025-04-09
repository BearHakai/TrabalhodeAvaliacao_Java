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
 * 16.	Faça um algoritmo que permita ao usuário digitar um valor em minutos e
 * apresente em tela o valor convertido para segundos.
 */
public class Ex16 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double seg;
        double min;
        
        System.out.println("Quantos Minutos quer converter em Segundos? ");
        min = scan.nextDouble();
        
        seg = min * 60;
        
        System.out.println("Conversao:" + "Minutos: " + min + "\n São: " +
                seg + " Seg");
    }
}
