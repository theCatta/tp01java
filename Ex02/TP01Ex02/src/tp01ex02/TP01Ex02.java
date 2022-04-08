/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex02;

import java.util.Scanner;
/**
 *
 * @author 
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP01Ex02 {
    
    /**
     *  Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
        digitado. 
     */
    public static void main(String args[]){

    System.out.println("Insira o valor da aresta de um quadrado:");
    Scanner scan= new Scanner(System.in); 

    int aresta = scan.nextInt();
    int area = aresta * aresta;
    
    System.out.println("A area do quadrado é: " + area + " cm²");
}  
} 
