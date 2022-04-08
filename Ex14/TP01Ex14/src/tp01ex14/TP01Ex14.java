/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex14;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author 
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP01Ex14{
    
    /**
     *  Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
        “r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
        digitados.   
     */
    public static void main(String args[]){

    System.out.println("Insira a aresta de um cubo perfeito:");
    Scanner scan= new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat();
    deci.setMaximumFractionDigits(2);
    double a = scan.nextInt();

    System.out.println("Insira o raio de uma esfera:");
    double r = scan.nextInt();

    //define formato decimal
    DecimalFormat frmt = new DecimalFormat();
    frmt.setMaximumFractionDigits(2);
    
    while(2*r > a){
        System.out.println("ERRO: A esfera não cabe no cubo ");
        System.out.println("Insira o raio de uma esfera:");
        r = scan.nextInt();
    }

    
    //volume do cubo perfeito
    double vcubo = a * a * a;
        

    //volume da esfera
    double vesfera = (4 * Math.PI * Math.pow(r, 3))/3;
    

    //calculo chave
    double vlivre = vcubo - vesfera;
    System.out.println("O volume livre é: " + deci.format(vlivre) + " cm³");

    

} 
}