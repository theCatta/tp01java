/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex03;

import java.util.Scanner;
/**
 *
 * @author 
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP01Ex03 {

    /**
     * 3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
        digitado.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o valor da diagonal do quadrado:");
        float diagonal = scan.nextFloat();
        
        //calculo area
        float area = (diagonal * diagonal) / 2;
        
        System.out.println("O valor da área é de: " + area + " cm²");
    }
    
}
