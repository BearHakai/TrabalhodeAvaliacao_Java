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
 * 27.	Considerando que o aluno precisa ter frequência igual ou maior que 75% 
 *para sua aprovação, faça um algoritmo que permita ao professor digitar o
 * número de aulas previstas de sua disciplina durante um semestre, calcule o
 * mínimo de presenças em aula que o aluno precisa acumular para a sua
 * aprovação e apresente esse valor em tela.
 */
public class Ex27 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int totalAulas;
        double minAulas;
        String verificacao;
        int faltasAluno;
        
        System.out.println("Quantas Aulas tera em sua materia?");
        totalAulas = scan.nextInt();
        
        minAulas = totalAulas * 0.75;
        
        System.out.println("O minimo de aulas necessarias sao: " + minAulas + " Aulas");
        
        System.out.println("Deseja informar quantas aulas o aluno esteve presente?(S/N)");
        verificacao = scan.next();
        
        if(verificacao.equals("s") || verificacao.equals("S")){
        
            System.out.println("Quantas faltas o Aluno teve?");
            faltasAluno = scan.nextInt();
            
            if(faltasAluno >= minAulas){
            
                System.out.println("O Aluno presenciou aulas suficientes.");
            }
            
            else{
            
                System.out.println("O aluno foi reprovado");
            }
        }
    }
}
