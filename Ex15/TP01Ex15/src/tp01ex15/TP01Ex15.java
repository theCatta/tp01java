/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex15;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author 
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP01Ex15 {

    /**
     * 15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
        dólares. Calcular e exibir o valor correspondente em Reais (R$).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o valor da cotação do dólar:");
        double cot = scan.nextDouble();
        System.out.println("Digite a quantidade para converter para real:");
        double dol = scan.nextDouble();
        
        //calculo conversao
        double real = cot * dol;
        
        //define formato decimal
        DecimalFormat dec = new DecimalFormat();
        dec.setMaximumFractionDigits(2);
        
        System.out.println("O valor em real de $" + dol + " é de R$" + dec.format(real));
    }
    
}
