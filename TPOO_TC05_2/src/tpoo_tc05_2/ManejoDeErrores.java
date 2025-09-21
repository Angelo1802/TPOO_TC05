/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpoo_tc05_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoDeErrores {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese numerador: ");
            int num = sc.nextInt();
            System.out.print("Ingrese denominador: ");
            int den = sc.nextInt();

            int resultado = num / den;
            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar números enteros.");
            
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
            
        } finally {
            sc.close();
            System.out.println("\nPrograma finalizado.");
        }
    }
    
}
