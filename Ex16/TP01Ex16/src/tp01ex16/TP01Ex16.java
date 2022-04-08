/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex16;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author 
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP01Ex16 {

    /**
     * Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
       seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
       Lembre-se que uma função trigonométrica trabalha em radianos.
     */
    public static void main(String[] args) {
    System.out.println("Insira a ângulo em graus: ");
    Scanner scan= new Scanner(System.in);
    double angulo = scan.nextDouble();
    double radiano = Math.toRadians(angulo);
    double secante = 1/Math.cos(radiano);
    
    //define formato decimal
    DecimalFormat dec = new DecimalFormat();
    dec.setMaximumFractionDigits(3);
    
    System.out.println("O seno do ângulo é: " + dec.format(Math.sin(radiano))); 
    System.out.println("O cosseno do ângulo é: " + dec.format(Math.cos(radiano))); 
    System.out.println("O tangente do ângulo é: " + dec.format(Math.tan(radiano))); 
    System.out.println("O secante do ângulo é: " + dec.format(secante));
    }
}
