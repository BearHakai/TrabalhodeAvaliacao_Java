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
 * 4.	Faça um algoritmo que solicite ao usuário o seu peso. O programa deve
 *  calcular e apresentar a quantidade de água, em litros, que deve ser 
 * ingerida ao longo de um dia. A formula é: qtdAgua = peso * 0.040.
 */
public class Ex4 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double peso;
        double qtdAgua;
        
        System.out.println("Qual seu peso?");
        peso = scan.nextDouble();
        
        qtdAgua = peso * 0.40;
        
        System.out.println("Pesando: " + peso + " KG \nPrecisara de: " +
                qtdAgua + " Litros de Agua");
    }
    
}
