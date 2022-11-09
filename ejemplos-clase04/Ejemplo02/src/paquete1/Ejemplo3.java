/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo3 {

    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        double promedio;
        double nota1;
        double nota2;
        double suma;
        
        
        System.out.println("Ingrese nota de asignatura 1");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese nota de asignatura 2");
        nota2 = entrada.nextDouble();
        suma = nota1 + nota2;
        promedio = suma / 2;
        
        
        System.out.printf("Asignatura 1: %s\nNota 1:%.2f\nAsignatura 2:%s\n "
                + "Nota 2: %.2f\nNombre de estudiante: %s\n",
                nombreAsignatura1,
                notaAsignatura1,
                nombreAsignatura2,
                notaAsignatura2,
                nombreEstudiante);
   
    }
    
}
