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
 * 29.	A Frequência Cardíaca normal de uma pessoa é de 60 a 100 batimentos por 
 * minuto. Construa um algoritmo que permita ao usuário digitar o valor de sua
 * frequência cardíaca e verifique este valor com base nas regras abaixo:
•	Se o valor que Frequência Cardíaca estiver abaixo de 60, escreva em
* tela “BRADIQUICARDIA”;
•	Se o valor que Frequência Cardíaca for maior ou igual a 60 e menor ou
* igual a 100, escreva em tela “NORMOCARDIA”;
•	Se o valor que Frequência Cardíaca for maior ou igual a 100, escreva
* em tela “TAQUICARDIA”.

 */
public class Ex29 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int batCardio;
        
        System.out.println("Qual a frequencia dos bastimentos cardiacos?");
        batCardio = scan.nextInt();
        
        if(batCardio < 60){
            
            System.out.println("BRADIQUICARDIA");
        }
        
        else if(batCardio >= 60 && batCardio < 100){
        
            System.out.println("NORMOCARDIA");
        }
        
        else if(batCardio >= 100){
        
            System.out.println("TAQUICARDIA");
        }
        
        else{
        
            System.out.println("Valor invalido!!");
        }
    }
}
