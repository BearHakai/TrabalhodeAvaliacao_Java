/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author vinicius_4820
 * 
 * A frequência Respiratória normal de uma pessoa é de 12 a 20 respirações por
 * minuto. Contrua um algoritmo que permita ao usuário dgitar o valor de sua
 * frequência respiratória e verifique este valor com base nas regras abaixo:
 * Se o valor da frequência respiratória estiver abaixo de 12, escreva na tela
 * "BRADPINEIA"
 * Se o valor da frequência respiratória estiver igual ou maior que 12 e menor
 * que 20, escreva na tela "EUPNEIA"
 * Se o valor da frequência respiratória estiver igual ou maior que 20,
 * escreva na tela"TAQUIPNEIA"
 * 
 */
public class Ex30 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int freqRespiracao;
        
        System.out.println("Qual a frequencia da sua Respiracao?");
        freqRespiracao = scan.nextInt();
        
        if(freqRespiracao < 12){
            
            System.out.println("BRADPINEIA");
        }
        
        else if(freqRespiracao >= 12 && freqRespiracao < 20){
        
            System.out.println("EUPNEIA");
        }
        
        else if(freqRespiracao >= 20){
        
            System.out.println("TAQUIPNEIA");
        }
        
        else{
        
            System.out.println("Valor invalido!!");
        }
    }
}
