/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex05;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author 
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP01Ex05 {

    /**
     * 5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
        será digitado.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o valor do diâmetro da esfera:");
        double diametro = scan.nextDouble()/2;
        
        //calculo volume
        double volume = (4 * Math.PI * Math.pow(diametro, 3))/3;
        
        //define formato decimal
        DecimalFormat dec = new DecimalFormat();
        dec.setMaximumFractionDigits(2);
        
        System.out.println("O volume da esfera é de: " + dec.format(volume) + " cm³");
    }
    
}
