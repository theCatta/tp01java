/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex10;

import java.util.Scanner;
/**
 *
 * @author 
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP01Ex10 {
    
    /**
     *  Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
        exibir sua temperatura equivalente em Fahrenheit.   
     */
    public static void main(String args[]){

    System.out.println("Insira a temperatura em celsius que deseja converter para fahrenheit:");
    Scanner scan= new Scanner(System.in);

    double celsius = scan.nextInt();
    
    double fahrenheit = celsius * 1.8 + 32;
 
    System.out.println("A temperatura em fahrenheit é: " + fahrenheit + " ºF");
}  
}