/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex01;

import java.util.Scanner;
/**
 * @author 
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP01Ex01 {

    /**
     * 1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
        área.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o valor da base do retângulo: ");
        int base = Integer.parseInt(scan.nextLine());
        
        System.out.println("Digite o valor altura: ");
        int altura = scan.nextInt();
        
        //calcular área
        int area = base * altura;
        
        //mostrar área
        System.out.println("A área do retângulo é de " + area + " cm²");
    }
    
}
