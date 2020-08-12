/**
        Jesus Ivan Beltran Moreno
 */
package fibonacci;

import java.util.ArrayList; //no la use
import java.util.Scanner;
        

public class Fibonacci {

    public static void main(String[] args) {
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
