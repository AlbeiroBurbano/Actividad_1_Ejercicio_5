/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        double suma = 0, x, y;
        
      Scanner leerporteclado = new Scanner(System.in);
      
      System.out.println("Ingrese el valor de x");
      x = leerporteclado.nextInt();
      
      System.out.println("Ingrese el valor de y");
      y = leerporteclado.nextInt();
      
      suma = suma + x;
      System.out.println("El valor de la suma es: "+suma);
        
      x= x + Math.pow(y,2);
        
      suma = suma + (x/y); 
      System.out.println("El valor de la suma es: "+suma);
    }
}
