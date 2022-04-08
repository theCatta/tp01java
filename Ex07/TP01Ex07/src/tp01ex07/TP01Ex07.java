/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex07;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author 
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP01Ex07 {

    /**
     * 7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
        digitados.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o primeiro valor para cálculo da média geométrica:");
        double num1 = scan.nextFloat();
        
        System.out.println("Digite o segundo valor:");
        double num2 = scan.nextFloat();
        
        //calculo da media com 2 valores
        double media = Math.sqrt(num1*num2);
        
        //define formato decimal
        DecimalFormat dec = new DecimalFormat();
        dec.setMaximumFractionDigits(2);
        
        System.out.println("O valor da média geométrica é de: " + dec.format(media));
    }
    
}
