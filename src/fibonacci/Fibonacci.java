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
 * @author Yisus
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
        int suma = 0;        
        int limite;
       
        System.out.println(" Ingresa un limite: ");
        limite = sc.nextInt();
         System.out.println("");
         
         //System.out.println(Numero_Izq);
           
    for (int i = 0; i < limite; i++) {
        if (i+1 == limite)
       System.out.println(Numero_Izq); // imprime  0
       // System.out.println(suma);
        //--------
        suma = Numero_Izq + Numero_Der;  //suma = 0 + 1  = 1    
       
        Numero_Izq = Numero_Der;   // num izq = 1
        
        Numero_Der = suma;  // num der = 1....
       }  
                       
    }
    
}
