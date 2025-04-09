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
 * 18.	Um cliente de um banco possui em sua conta corrente um saldo de 
 * R$ 20000,00. Crie um algoritmo que permita ao cliente digitar o valor de 
 * saque que deseja realizar e calcule e apresente em tela o 
 * novo saldo do cliente.
 */
public class Ex18 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double saldo = 20000;
        double saque;
        double saldoSaque;
        
        System.out.println("Quanto deseja sacar? ");
        saque = scan.nextDouble();
        
        saldoSaque = saldo - saque;
        
        System.out.println("Saldo: R$ " + saldo + "\nFez um saque de: R$" +
                saque + "\nSaldo Atual: R$" + saldoSaque);
    }
}
