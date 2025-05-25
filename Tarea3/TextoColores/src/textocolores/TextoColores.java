/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textocolores;

/**
 *
 * @author rodri
 */
public class TextoColores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String nombre = "Francisco Rodrigo Castañeda Tello";
        
        // Línea 1 - Rojo
        System.out.println("\u001B[31m" + nombre + "\u001B[0m");
        
        // Línea 2 - Verde negrita
        System.out.println("\u001B[32;1m" + nombre + "\u001B[0m");
        
        // Línea 3 - Amarillo subrayado
        System.out.println("\u001B[33;4m" + nombre + "\u001B[0m");
        
        // Línea 4 - Azul cursiva
        System.out.println("\u001B[34;3m" + nombre + "\u001B[0m");
        
        // Línea 5 - Magenta sobre cyan
        System.out.println("\u001B[35;46m" + nombre + "\u001B[0m");
        
        // Línea 6 - Cyan sobre rojo
        System.out.println("\u001B[36;41m" + nombre + "\u001B[0m");
        
        // Línea 7 - Blanco sobre magenta
        System.out.println("\u001B[37;45m" + nombre + "\u001B[0m");
        
        // Línea 8 - Rojo negrita sobre amarillo
        System.out.println("\u001B[1;31;43m" + nombre + "\u001B[0m");
        
        // Línea 9 - Verde cursiva sobre azul
        System.out.println("\u001B[3;32;44m" + nombre + "\u001B[0m");
        
        // Línea 10 - Amarillo subrayado sobre blanco
        System.out.println("\u001B[4;33;47m" + nombre + "\u001B[0m");
    }
    
}
