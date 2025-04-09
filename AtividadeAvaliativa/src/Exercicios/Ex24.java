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
 * 24.	Faça um algoritmo que permita que o usuário digite o valor de 
 * seu salário e calcule um bônus de 10% referente a assiduidade e pontualidade
 */
public class Ex24 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double salario;
        double bonus = 0.10;
        double salarioFinal;
        
        System.out.println("Digite seu salario: ");
        salario = scan.nextDouble();
        
        salarioFinal = (salario * bonus) + salario;
        
        System.out.println("O salario inicial era: R$" + salario +
                "\nCom o bonus: R$ " + salarioFinal);
    }
}
