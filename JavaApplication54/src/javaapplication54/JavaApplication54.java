/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54;

import java.util.Scanner;

/**
 *
 * @author edgarpradaeg
 */
public class JavaApplication54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            int numero,numero2;    

        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        numero = reader.nextInt();
        System.out.println("Ingrese el primer numero");
        numero2 = reader.nextInt();
        int sum = numero+numero2;
        System.out.println("la suma es:"+sum);  
        
        // TODO code application logic here
    }
    
}
