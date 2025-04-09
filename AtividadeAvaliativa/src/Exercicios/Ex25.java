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
 * 25.	Crie um algoritmo que simule o funcionamento de um radar eletrônico
 * de velocidade. O algoritmo deve permitir ao usuário digitar um valor de
 * velocidade, apresentar em tela a mensagem 
 * “REGISTRO DE INFRAÇÃO POR EXCESSO DE VELOCIDADE AO PERMITIDO NA VIA!”,
 * se a velocidade for maior que 90 quilômetros por hora (km/h) ou
 * “VELOCIDADE DO AUTOMÓVEL ESTÁ ABAIXO DO LIMITE DA VIA”, se a velocidade for
 * menor ou igual a 90 quilômetros por hora (km/h).
 */
public class Ex25 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double velocidade;
        
        System.out.println("Qual era a velocidade do veiculo? ");
        velocidade = scan.nextDouble();
        
        if(velocidade > 90){
        
            System.out.println("REGISTRO DE INFRAÇÃO POR EXCESSO DE VELOCIDADE"
                    + " PERMITIDO NA VIA");
            
        }
        
        else{
        
            System.out.println("VELOCIDADE DO AUTOMÓVEL ESTÁ ABAIXO DO "
                    + "LIMITE DA VIA");
            
        }
    }
}
