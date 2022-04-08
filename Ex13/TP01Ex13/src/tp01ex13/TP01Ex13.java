/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex13;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author 
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP01Ex13 {

    /**
     * 13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
        valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
        (em s) que serão digitados.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o valor da velocidade inicial:");
        double vi = scan.nextDouble();
        
        System.out.println("Digite o valor da aceleração:");
        double a = scan.nextDouble();

        System.out.println("Digite o valor do tempo:");
        double t = scan.nextDouble();
        
        //calculo velocidade
        double kmH = 3.6;
        double vf = (vi + a*t)*kmH;
        
        //define formato decimal
        DecimalFormat dec = new DecimalFormat();
        dec.setMaximumFractionDigits(2);
        
        System.out.println("O valor da velocidade final é de: " + dec.format(vf) + " km/h");
    }
    
}
