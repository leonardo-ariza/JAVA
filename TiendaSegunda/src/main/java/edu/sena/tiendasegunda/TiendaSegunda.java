package edu.sena.tiendasegunda;

import java.util.Scanner;

public class TiendaSegunda {

    public static void main(String[] args) {
        String persona, persona2 = null;
        int opcion;
        Scanner leer = new Scanner(System.in);
        System.out.print("Escoja una opcion de menu: \n");
        System.out.print("1) Client frecuente \n");
        System.out.print("2) Cliente corporativo \n");
        System.out.print("3) Cliente madre lactante \n");
        System.out.print("4) Cliente adulto mayor \n");
        System.out.print("5) Cliente primera infancia \n");
        opcion = leer.nextInt();

        // Consume the newline character left by leer.nextInt()
        leer.nextLine();

        // Ask for the type of person (natural or not)
        System.out.println("¿El tipo de persona es natural o corportativo?: ");
        persona = leer.nextLine();
        System.out.println("¿Es la persona hombre, mujer, niño o anciano: ");
        persona2 = leer.nextLine();

        switch (opcion) {
            case 1:
                if (persona.equalsIgnoreCase("natural") || persona.equalsIgnoreCase("si")) {
                    System.out.print("Cliente frecuente aplica para descuento \n");
                } else {
                    System.out.print("Cliente frecuente NO aplica para descuento \n");
                }
                break;

            case 2:
                // Handle Cliente corporativo
                break;

            case 3:
                // Handle Cliente madre lactante
                break;

            case 4:
                // Handle Cliente adulto mayor
                if (persona2.equalsIgnoreCase("anciano") || persona.equalsIgnoreCase("si")) {
                    System.out.print("Cliente frecuente aplica para descuento \n");
                } else {
                    System.out.print("Cliente frecuente NO aplica para descuento \n");
                }
                break;

            case 5:
                // Handle Cliente primera infancia
                break;

            default:
                System.out.println("Opción inválida.");
        }
    }
}
