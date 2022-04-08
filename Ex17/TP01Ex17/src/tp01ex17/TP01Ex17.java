/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex17;

import java.util.Scanner;
/**
 *
 * @author 
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP01Ex17 {

    /**
     * 17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
        cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Digite o valor de x:");
        double x = scan.nextDouble();
        System.out.println("Digite o valor de y:");
        double y = scan.nextDouble();
        
        //calculo
        double result = Math. exp (y * Math.log(x));
        
        System.out.println("O valor de " + Math.round(x) + " elevado a " + Math.round(y) + " é de " + Math.round(result)); 
    }
    
}
