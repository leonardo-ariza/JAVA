/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tablasdemultiplicar;
import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class TablasDeMultiplicar {
 

    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
        System.out.print("Ingrese el numero a multiplicar: ");
        
        int num = scanner.nextInt();
        
        for(int i=1;i<=10;i++){
           int resultado=num*i;
            
            
        System.out.println(num+" multiplicado por "+i+" es igual a: "+resultado);  
        }
        
    }
}
