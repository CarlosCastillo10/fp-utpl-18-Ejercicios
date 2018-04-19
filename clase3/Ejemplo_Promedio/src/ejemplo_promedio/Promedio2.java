/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_promedio;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Promedio2 {

    /**
     * @param args the command line arguments
     * Contenido académico
     */
    
    // el método principal de la ejecución del programa
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        double calificacion1; // primer número a sumar
        double calificacion2; // segundo número a sumar
        double calificacion3; // suma del primer y segundo número
        double suma;
        double promedio;

        String nombre;
        String apellido;
        
        System.out.println("Ingresar el nombre");
        nombre = entrada.nextLine();
        
        System.out.println("Ingresar la primera calificación");
        calificacion1 = entrada.nextDouble(); // lee el primer número que el usuario ingresa
        
        System.out.println("Ingresar la segunda calificación");
        calificacion2 = entrada.nextDouble(); // 
        
        System.out.println("Ingresar la tercera calificación");
        calificacion3 = entrada.nextDouble(); // 
        
            
        suma = calificacion1 + calificacion2 + calificacion3;        
        promedio = suma / 3;
        
        entrada.nextLine(); // limpiar el scanner
        System.out.println("Ingresar el apellido");
        apellido = entrada.nextLine();
        
        System.out.printf("El alumno %s tiene de promedio: %f.\n", nombre, promedio);
        
    }
    
}
