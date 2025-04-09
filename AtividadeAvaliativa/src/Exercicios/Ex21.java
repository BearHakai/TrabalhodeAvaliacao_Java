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
 * 21.	Construa um algoritmo para o pagamento de comissão de vendedores 
 * de peças levando-se em consideração que sua comissão será de 5% do total 
 * da venda. Considere os seguintes dados: valor unitário da peça e quantidade 
 * de peças vendidas. 
 */
public class Ex21 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int pecas;
        double valorPeca;
        double comissao = 0.05;
        double total;
        
        System.out.println("Quantas pecas foram vendidas?");
        pecas = scan.nextInt();
        
        System.out.println("Qual o valor da peca vendida?");
        valorPeca = scan.nextDouble();
        
        total = (valorPeca * comissao) * pecas;
        
        System.out.println("Foram vendidas: " + pecas + "\nCada peca custava: R$"
        + valorPeca + "\nComissao: R$ " + total);
    }
}
