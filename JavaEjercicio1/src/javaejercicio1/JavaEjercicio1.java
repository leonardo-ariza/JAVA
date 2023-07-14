/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio1;
import javax.swing.JOptionPane;  

/**
 *
 * @author Aprendiz
 */
public class JavaEjercicio1 {

String nombre, genero, nacionalidad;
int edad;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      nombre = Char.parschar(JOptionPane.showInputDialog(null, "Ingrese su nombre: "));
      genero =   Char.parschar(JOptionPane.showInputDialog(null, "Ingrese su género: "));
       edad = Integer.parseint(JoptionsPane.showInputDialog(null, "Ingrese su edad: "));
      nacionalidad = Char.parschar(JOptionPane.showInputDialog(null, "Ingrese su nacionalidad: "));
      
      if (edad>=17) {
        JoptionsPane.showMessageDialog(null, "La persona es mayor de edad");
        else {
        JoptionsPane.showMessageDialog(null, "La persona es menor de edad");
                }
      
     if (genero==Hombre||genero==HOMBRE||genero==hombre||genero==Masculino||genero==MASCULINO||genero==masculino) {
        JoptionsPane.showMessageDialog(null, "La persona es un hombre");
        else {
        JoptionsPane.showMessageDialog(null, "La persona es una mujer");
                }
     
      
      
      
     System.out.println("Número ingresado: " + numero); 
    }
    
}
    
}
