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
 * 6.	Uma empresa de desenvolvimento de softwares paga a seus desenvolvedores
 * um fixo de R$ 4500,00 por mês, mais um bônus de R$ 200,00 por bug resolvido.
 * Faça um algoritmo que leia a quantidade de bugs resolvidos por um
 * funcionário e apresente o salário do funcionário.
 */
public class Ex6 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double salarioAtual = 4500;
        int resBugs;
        double valorBug = 200;
        double salarioFinal;
        
        System.out.println("Quantos Bugs foram resolvidos?");
        resBugs = scan.nextInt();
        
        salarioFinal = salarioAtual + (resBugs * valorBug) ;
        
        System.out.println("Salario atual: R% " + salarioAtual + 
                "\nBugs Resolvidos: " + resBugs + "\nSalario + Beneficios: R$ " 
                + salarioFinal);
    }
}
