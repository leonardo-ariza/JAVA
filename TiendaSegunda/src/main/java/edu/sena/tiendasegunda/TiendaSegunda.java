 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.sena.tiendasegunda;
import java.util.Scanner;



public class TiendaSegunda {

    public static void main(String[] args) {
        String persona=null;
        int opcion;
        Scanner leer = new Scanner (System.in);
        System.out.print("Escoja una opcion de menu: \n");
        System.out.print("1) Client frecuente \n");
        System.out.print("2) Cliente corporativo \n");
        System.out.print("3) Cliente madre lactante \n");
        System.out.print("4) Cliente adulto mayor \n");
        System.out.print("5) Cliente primera infancia \n");
        opcion = leer.nextInt();
        switch (opcion){
            // && (productos>10)){
            case 1:
                System.out.println("¿El tipo de persona es natural?: ");
                persona=(leer.nextLine());
                
                //System.out.println("Ingrese la cantidad de  productos: ");
                //int productos = leer.nextInt();
                if(persona == "natural"){ 
                    
                     System.out.print("Cliente frecuente aplica para descuento \n");
                }
                    else{
                            
                    System.out.print("Cliente frecuente NO aplica para descuento \n");        
                            }
                
                break;
                
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            default:
            }
            
            
        }
    
}

