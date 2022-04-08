/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex12;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author 
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP01Ex12{
    
    /**
     *  Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
        base que serão digitados.   
     */
    public static void main(String args[]){

    System.out.println("Insira a altura de um cone:");
    Scanner scan= new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat();
    deci.setMaximumFractionDigits(2);
    double altura = scan.nextInt();
    
    System.out.println("Insira o raio da base de um cone:");
    double raio = scan.nextInt();
    
    double volume = Math.PI * raio * raio * altura * 1/3;
 
    System.out.println("O volume do cone é: " + deci.format(volume) + " cm³");
} 
}