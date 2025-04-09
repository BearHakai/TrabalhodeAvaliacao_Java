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
 * 5.	Faça um algoritmo que solicite ao usuário o seu peso e altura.
 * O programa deve calcular e Indice de Massa Corporal (IMC). 
 * A formula é: imc = peso/(altura2).
 */
public class Ex5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double peso;
        double altura;
        double imc;
        
        System.out.println("Informe seu peso: ");
        peso = scan.nextDouble();
        
        System.out.println("Informe sua altura: ");
        altura = scan.nextDouble();
        
        imc = peso / (altura * altura);
        
        System.out.println("Pesando: " + peso + " Kg \nMedindo: " + altura +
                "\nSua massa corporal e de: " + imc);
    }
}
