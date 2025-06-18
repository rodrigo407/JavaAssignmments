/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionbasicas;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class OperacionBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        // Solicitar los números al usuario
        System.out.print("Ingrese el primer número: ");  // Corregido: print en lugar de pint
        double numero1 = scanner.nextDouble();
        
        
        System.out.println("Ingrese el segundo valor");  // Corregido: print en lugar de pint
        double numero2 = scanner.nextDouble();
        
        // Realizar las operaciones
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;  // Corregido: double en lugar de duble
        
        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        
        // Validar y calcular división
        if (numero2 != 0) {  // Corregido: numero2 en lugar de numeo2
            double division = numero1 / numero2;  // Cálculo dentro del if para evitar división por cero
            System.out.println("División: " + division);  // Corregido: System en lugar de Sysem
        } else {
            System.out.println("División: No se puede dividir por cero");
        }
         scanner.close(); 
    }
    
}
