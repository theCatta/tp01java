/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex11;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author 
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP01Ex11 {

    /**
     * 11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o valor do diâmetro do circulo:");
        double diametro = scan.nextDouble()/2;
        
        //calculo area
        double area = (Math.PI * Math.pow(diametro, 2));
        
        //define formato decimal
        DecimalFormat dec = new DecimalFormat();
        dec.setMaximumFractionDigits(2);
        
        System.out.println("O area do circulo é de: " + dec.format(area) + " cm²");
    }
    
}
