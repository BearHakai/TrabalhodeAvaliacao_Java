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
 * 26.	Crie um algoritmo que permita que o usuário digite o valor de peso de
 * um lutador do UFC e o valor de peso máximo permitido para sua categoria.
 * Se o valor do peso for menor ou igual ao valor de peso máximo permitido,
 * apresentar na tela a mensagem “O lutador está com peso dentro do permitido
 * para sua categoria”. Se o valor do peso for maior que o valor de peso máximo
 * permitido, apresentar na tela a mensagem “O lutador está com peso acima
 * do permitido para sua categoria”. 
 */
public class Ex26 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double lutadorPeso;
        double categoriaPeso;
        
        System.out.println("Digite seu peso: ");
        lutadorPeso = scan.nextDouble();
        
        System.out.println("Digite o peso da categoria: ");
        categoriaPeso = scan.nextDouble();
        
        if(lutadorPeso <= categoriaPeso){
        
            System.out.println("O lutador está com peso dentro do permitido "
                    + "para sua categoria");
        }
        
        else{
        
            System.out.println("O lutador está com peso acima do "
                    + "permitido para sua categoria");
        }
    }
}
