package Tarea1;

import java.util.Scanner;

public class AreadeUnCirculo {

    /**
     * @param args
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el radio del círculo: ");
        String entrada = scanner.nextLine();
        double radio = Double.parseDouble(entrada);
        
        double area = Math.PI * Math.pow(radio, 2);
        
        System.out.println("El área del círculo es: " + area);
        
        scanner.close();
    }
}