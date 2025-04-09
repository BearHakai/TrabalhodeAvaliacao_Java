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
 * 3.	Construa um algoritmo em que o usuário digite a data de nascimento e 
 * calcule a idade de uma pessoa. ATENÇÃO: para esse exercício o mês não deverá 
 * ser considerado.
 */
public class Ex3 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
       int dia;
       int mes;
       int ano;
       int anoAtual;
       int result;
       
        System.out.println("Informe o dia em que nasceu:");
        dia = scan.nextInt();
        
        System.out.println("Informe o mes em que nasceu:");
        mes = scan.nextInt();
        
        System.out.println("Informe o ano em que nasceu:");
        ano = scan.nextInt();
        
        System.out.println("Informe o ano atual:");
        anoAtual = scan.nextInt();
        
        result = anoAtual - ano;
        
        System.out.println("Voce nasceu em: " + dia + "/" + mes + "/" + ano +
                "\nE voce tem: " + result + " Anos");
    }
}
