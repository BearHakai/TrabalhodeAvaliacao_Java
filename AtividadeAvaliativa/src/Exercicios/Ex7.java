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
 * 7.	Uma loja de  automóveis paga a seus vendedores um fixo de R$ 2000,00 
 * por mês, mais um bônus de R$ 100,00 por automóvel vendido a vista. Faça um 
 * algoritmo que leia a quantidade de bugs resolvidos por um funcionário e 
 * apresente o salário do funcionário.
 */
public class Ex7 {
     public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double salarioAtual = 2000;
        int soldCarros;
        double beneficio = 100;
        double salarioFinal;
        
        System.out.println("Quantos carros foram vendidos?");
        soldCarros = scan.nextInt();
        
        salarioFinal = salarioAtual + (soldCarros * beneficio) ;
        
        System.out.println("Salario atual: R% " + salarioAtual + 
                "\nCarros Vendidos: " + soldCarros + 
                "\nSalario + Beneficios: R$ " + salarioFinal);
    }
}
