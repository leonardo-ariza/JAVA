/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio1;
import javax.swing.JOptionPane;  

public class JavaEjercicio1 {

    static String nombre, genero, nacionalidad;
    static int edad;

    public static void main(String[] args) {
        // TODO code application logic here
        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        genero = JOptionPane.showInputDialog(null, "Ingrese su género: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad: "));
        nacionalidad = JOptionPane.showInputDialog(null, "Ingrese su nacionalidad: ");
        
        JOptionPane.showMessageDialog(null, "Su nombre es: "+ nombre);
        
        if (genero.equalsIgnoreCase("Hombre") || genero.equalsIgnoreCase("Masculino")) {
            JOptionPane.showMessageDialog(null, "La persona es un hombre");
        } else {
            JOptionPane.showMessageDialog(null, "La persona es una mujer");
        }
        
        if (edad > 17) {
            JOptionPane.showMessageDialog(null, "La persona es mayor de edad, tiene "+ edad );
        } else {
            JOptionPane.showMessageDialog(null, "La persona es menor de edad, tiene: "+ edad );
        }
        
        if (nacionalidad.equalsIgnoreCase("Colombiana")) {
            JOptionPane.showMessageDialog(null, "La persona es de nacionalidad Colombiana");
        } else {
            JOptionPane.showMessageDialog(null, "La persona es un extranjero/extranjera");
        }
        
        if (genero.equalsIgnoreCase("Hombre")|| genero.equalsIgnoreCase("Masculino") && edad > 17 && nacionalidad.equalsIgnoreCase("Colombiana")) {
            
            JOptionPane.showMessageDialog(null, nombre + " es apto para prestar el servicio militar");
        }
            else {
            JOptionPane.showMessageDialog(null, nombre + " NO es apto para ingresar al servicio militar");
        }
            
        }
    }  

