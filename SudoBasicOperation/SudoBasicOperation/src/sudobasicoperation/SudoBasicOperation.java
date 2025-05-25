/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sudobasicoperation;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class SudoBasicOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        // Solicitar los números al usuario
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
       
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
       
        // Realizar las operaciones
        double suma             = numero1 + numero2;
        double resta            = numero1 - numero2;
        double multiplicacion   = numero1 * numero2;
        double division         = numero1 / numero2;
       
        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
       
        // Validar división por cero
        if (numero2 != 0) {
            System.out.println("División: " + division);
        } else {
            System.out.println("División: No se puede dividir por cero");
        }
       
        scanner.close();
    }
    
}
