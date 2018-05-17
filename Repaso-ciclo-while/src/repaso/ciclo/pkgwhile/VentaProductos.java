/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
    Programa que permite generar un reporte del cliente con todos los articulos adquiridos con su respectivo valor de venta.
*/
package repaso.ciclo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class VentaProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); // importamos el metodo Scanner que permite ingresar datos por teclado.

        String nombre_cliente;
        String nombre_articulo;
        int cant_articulo;
        double precio_articulo;
        double precio_total;
        double total;
        double iva;
        double subtotal = 0;
        boolean verificar = true;
        String cadena1 ;
        String cadena2;
        String respuesta;
        
        //Valor inicial que toma la variable 'cadena1'
        cadena1 = String.format("\n\t\t%s\n%s\n%s","FACTURA","Supermercado 'Todo a mejor precio'","Nombre del cliente: ");
        
        //Valor inicial que toma la variable 'cadena2'
        cadena2 = String.format("%s\t%s\t%s\t\t%s\n--------------------------------------------------------------------\n", "Articulo","Cantidad"
                ,"Precio Unitario","Precio Total");
        
        // Ingreso de datos del cliente.
        System.out.println("\tDATOS DEL CLIENTE");
        System.out.printf("Nombre: ");
        nombre_cliente = entrada.nextLine();
        cadena1 = String.format("%s %s\n\n",cadena1, nombre_cliente); // Concatenacion de la variable 'cadena1'.
        
        //Ciclo repetitivo que permite ingresar los datos del articulo.
        while (verificar){
     
            System.out.println("\n\tDATOS DEL ARTICULO");
            System.out.printf("Nombre del articulo: ");
            nombre_articulo = entrada.nextLine();
            
            System.out.printf("Cantidad: ");
            cant_articulo = entrada.nextInt();
            
            System.out.printf("Precio Unitario: ");
            precio_articulo = entrada.nextDouble();
            
            precio_total = cant_articulo * precio_articulo; // Calculamos el precio total del articulo sin considerar el iva
            subtotal = subtotal + precio_total;
              
            cadena2 = String.format("%s%-15s\t%d\t\t%.2f\t\t\t%.2f\n", cadena2,nombre_articulo,cant_articulo,precio_articulo,precio_total); // Concatenacion de la variable 'cadena2'.
   
            entrada.nextLine(); //Limpiador de Scanner
            
            //Sentencia que permite verificar si el usuario desesa ingresar mas productos.
            System.out.printf("\n\t1. Ingrese 'si' para ---> Nuevo Producto\n\t2. Ingrese 'no' para --->  Salir\n");
            System.out.printf("\nEscriba su respuesta: ","\n");
            respuesta = entrada.nextLine();
            
            //Condicion que controla la salida del ciclo(while).
            if (respuesta.equals("no")) {
                verificar = false;
            }   
        }
         iva = subtotal * 0.14; // Calculo del iva del articulo.
         total = subtotal + iva; // Valor final de venta del articulo.
       
         //Concatenacion final de la variable 'cadena2'.
         cadena2 = String.format("%s--------------------------------------------------------------------\n\t\t\t\t%s\t\t%.2f\n\t\t\t\t%s\t\t\t%.2f\n"
                 + "\t\t\t\t%s\t\t\t%.2f\n\n",cadena2,"Subtotal ",subtotal,"Iva 14%",iva,"Total",total);       
       
         System.out.printf("%s%s",cadena1,cadena2); //Presenta en pantalla (cadena1 y cadena2).
    }

}
