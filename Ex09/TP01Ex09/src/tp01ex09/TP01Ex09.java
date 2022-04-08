/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex09;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author 
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP01Ex09 {

    /**
     * 9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
        valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o valor da resistência: ");
        double r = scan.nextDouble();
        System.out.println("Digite o valor da corrente: ");
        double i = scan.nextDouble();        
        
        //calculo da tensao
        double v = r * i;
        
        //define formato decimal
        DecimalFormat dec = new DecimalFormat();
        dec.setMaximumFractionDigits(2);
        
        System.out.println("O valor da tensão é de: " + dec.format(v) + "V");
    }
    
}
