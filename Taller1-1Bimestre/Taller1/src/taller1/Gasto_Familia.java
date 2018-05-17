/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
    Programa que permite generar un reporte de gastos de un solo padre de familia.
*/
package taller1;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Gasto_Familia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);// Importamos el metodo Scanner.
        
        double sueldo_padre;
        int cant_hijos;
        String cadena1;
        double cant_pasajes;
        double cant_bar;
        double cant_salida;
        double total_pasajes = 0;
        double total_bar = 0;
        double total_salida = 0;
        String hijo = "Hijo";
        double cantidad_total;
       
          //Valor Inicial que toma la variable 'cadena1'.
        cadena1 = String.format("\n%30s\n------------------------------------------------------\n%s\t\t%s\t\t%s\t\t%s\n"
                + "------------------------------------------------------\n", "Reporte de Gastos de Padres de Familia","Persona","Pasajes",
                "Bar","Salida");
        
        System.out.printf("%30s\n","DATOS DEL PADRE");
        System.out.printf("Ingrese su salario semanal: ");
        sueldo_padre = entrada.nextDouble();
        
         // Sentencia que permite controlar las veces que se repetira el segundo ciclo(for).
        System.out.printf("Cantidad de Hijos: ");
        cant_hijos = entrada.nextInt();
        System.out.printf("------------------------------------\n");
        
        entrada.nextLine(); //Limpiador de Scanner.
        
        for (int contador =1; contador <= cant_hijos; contador ++){
            System.out.printf("\n%35s","DATOS DEL HIJO\n");
            System.out.printf("%s %d\n",hijo,contador);
            
            //Primera concatenacion de la variable 'cadena1'.
            cadena1 = String.format("%s%s %d", cadena1,hijo,contador);
            
            System.out.printf("\tCuanto gasta en Pasajes: ");
            cant_pasajes = entrada.nextDouble();
            
            System.out.printf("\tCuanto gasta en Bar: ");
            cant_bar = entrada.nextDouble();
            
            System.out.printf("\tCuaanto gasta en Salida: ");
            cant_salida = entrada.nextDouble();
            
            //Calculo de los valores requeridos.
            total_pasajes = total_pasajes + cant_pasajes;
            total_bar = total_bar + cant_bar;
            total_salida = total_salida + cant_salida;
            
            //Segunda concatenacion de la variable 'cadena1'.
            cadena1 = String.format("%s\t\t%-16.2f%-10.2f\t%.2f\n",cadena1,cant_pasajes,cant_bar,cant_salida);
            
            entrada.nextLine();//Limpiador de Scanner,
             
        }
        //Concatenacion Final de la variable 'cadena1'.
         cadena1 = String.format("%s-------------------------------------------------------------\n%-16s%s %.2f\t%s %.2f\t%s %.2f"
                         + "\n-------------------------------------------------------------\n",cadena1
                            ,"Totales: ","Pasajes",total_pasajes,"Bar",total_bar,"Salidas",total_salida);
         
         cantidad_total = total_pasajes + total_bar + total_salida;// Calculo que permite controlar la condicion(if).
         
       
        System.out.printf("\nSueldo Semanal del Padre de Familia: %.2f\n",sueldo_padre);
        System.out.println(cadena1); //Presentamos en pantalla la variable 'cadena1'.
        
          //Condicion que permite calcular la cantidad de dinero sobrante..
          if (cantidad_total > sueldo_padre){
             System.out.println("El padre de Familia le falta dinero\n");
         }else{
             if (cantidad_total == sueldo_padre){
                 System.out.println("El padre de familia se quedo sin dinero\n");
             }else{
                  System.out.println("El padre de familia le sobra dinero\n");
             }
            
         }
               
    }
    
}
