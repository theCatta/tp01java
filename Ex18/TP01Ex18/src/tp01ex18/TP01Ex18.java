/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01ex18;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * @author 
 * Gabriel Ferreira de Souza
 * Guilherme Ferreira Santos
 */
public class TP01Ex18 {

    /**
     * Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
       valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
       que deverá ser devolvido.
     */
    public static void main(String[] args) {
    System.out.println("Insira o valor de 5 produtos:");
    Scanner scan= new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat();
    deci.setMaximumFractionDigits(2);
    double prod1 = scan.nextDouble();
    double prod2 = scan.nextDouble();
    double prod3 = scan.nextDouble();
    double prod4 = scan.nextDouble();
    double prod5 = scan.nextDouble();
    
    double soma = prod1 + prod2 + prod3 + prod4 + prod5;
    System.out.println("O valor total foi: " + deci.format(soma));
    
    System.out.println("Insira o valor de pagamento:");
    double pay = scan.nextDouble();
    

    
    double troco = pay - soma;
    
    System.out.println("O valor do troco é: " + deci.format(troco));
    
    }  
}
