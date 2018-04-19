/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class SeleccionAnidada {

    public static void main(String[] args) {
        // documentacion

        Scanner entrada = new Scanner(System.in);
        String nombre = "Carlos Castillo";
        System.out.println(nombre.toUpperCase());
        int calificacion;
        
        System.out.println("Ingrese nombre del estudiante: ");
        nombre = entrada.nextLine();
        
        
        System.out.println("Ingrese calificacion: ");
        calificacion = entrada.nextInt();
        

        if (calificacion >= 90) {
            System.out.printf("Estudiante: %s\n\tAprobado\nCon calificacion\n\t%d\n",nombre, calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80) {
                System.out.printf("Estudiante: %s\n\tAprobado\nCon calificacion\n\t%d\n",nombre, calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("Estudiante: %s\n\tAprobado\nCon calificacion\n\t%d\n",nombre, calificacion);

                } else {
                    System.out.printf("Estudiante: %s\n\tReprobado\nCon calificacion\n\t%d\n",nombre,calificacion);
                }
            }
        }
    }
}
