/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.ArrayList; //no la use
import java.util.Scanner;
        

/**
 *
 * @author ivanc
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int Numero_Izq = 0; 
        int Numero_Der = 1;
        int suma = 1;        
        int limite;
       
        System.out.println(" Ingresa un limite: ");
        limite = sc.nextInt();
         System.out.println("");
         
         System.out.println(Numero_Izq);
           
    for (int i = 1; i < limite; i++) {
        System.out.println(suma);
        
        suma = Numero_Izq + Numero_Der;
       
        Numero_Izq = Numero_Der;
        
        Numero_Der = suma;
       }  
                       
    }
    
}
