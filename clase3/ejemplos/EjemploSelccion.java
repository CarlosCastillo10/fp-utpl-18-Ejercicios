/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
   Crear un programa que permita ingresar una calificacion por teclado
Si la calificacion ingresada es mayor o igual a 5 y la calificacion es menor
a 10, se dbe presentar un mensaje que diga usted esta n supletorios, de lo 
contrario se presenta un mensaje con el valor d la calificacion dividido para 
dos

  */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class EjemploSelccion {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      double calificacion;
      
      System.out.println("Ingrese por favor una calificacion");
      calificacion = entrada.nextDouble();
      
      if (calificacion >= 5 && calificacion < 10){
           System.out.println("Usted esta en supletorios");
          }else{
               double resultado;
               resultado = calificacion / 2 ;
               System.out.printf("Su nota dividida es: %.2f\n",resultado);
       } 
      
        
    }
}
