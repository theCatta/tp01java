/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex04;

import java.util.Scanner;
/**
 *
 * @author 
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP01Ex04 {
    
    /**
     *  A partir dos valores da base e altura de um triângulo, calcular e exibir sua área. 
     */
    public static void main(String args[]){
    
    System.out.println("Insira o valor da base de um triangulo:");
    Scanner scan= new Scanner(System.in); 
    float base = scan.nextFloat();
    
    System.out.println("Insira o valor da altura de um triangulo:");
    float altura = scan.nextFloat();
    
    float area = base * altura / 2;
    
    System.out.println("A area do triangulo é: " + area + " cm²");
}  
}  