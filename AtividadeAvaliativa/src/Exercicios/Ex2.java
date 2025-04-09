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
 * 2.	Construa um algoritmo para calcular o total gasto por mês com 
 * transporte coletivo (metrô). Imagine que são utilizadas 4 conduções por 
 * dia e que o valor de cada condução é de R$ 5,20. Considere o mês com 
 * 30 dias. Apresente no final o valor gasto com conduções no mês.
 */
public class Ex2 {
    public static void main(String[]args){
    
        Scanner scan = new Scanner(System.in);
        
        double conducaoValor;
        int conducaoDia;
        int diasMes;
        double result;
        
        System.out.println("Quanto você paga por conducao?");
        conducaoValor = scan.nextDouble();
        
        System.out.println("Quantas conducoes voce pega por dia?");
        conducaoDia = scan.nextInt();
        
        System.out.println("Quantos dias tera no mes?");
        diasMes = scan.nextInt();
        
        result = (conducaoValor * conducaoDia) * diasMes;
        
        System.out.println("Voce gasta: R$ " + conducaoValor + 
                "\nConducoes no dia: " + conducaoDia +
                "\nPor " + diasMes + " dias no mes" +
                "\nGastando um total de: R$ " + result);
    }
}
