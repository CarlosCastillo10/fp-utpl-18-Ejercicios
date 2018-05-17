/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
    Programa que permite generar el reporte de gastos de padres de familia
*/
package taller1;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Reporte_Padres {
    public static void main(String[] args){
    
         Scanner entrada = new Scanner(System.in); // Importamos el metodo Scanner
         
        String nombre_padre;
        int cant_padres;
        double sueldo_padre;
        int cant_hijos;
        String cadena1;
        double cant_pasajes;
        double cant_bar;
        double cant_salida;
        double total_pasajes;
        double total_bar;
        double total_salida ;
        String hijo = "Hijo";
        double cantidad_total;
        
        //Valor Inicial que toma la variable 'cadena1'.
        cadena1 = String.format("%30s\n\n","Reporte Gastos de Padres de Familia");
        
        //Sentencia que nos permite saber la cantidad de veces que se repetira el ciclo (for).
        System.out.printf("%25s\n","Registro de Padres");
        System.out.printf("%s", "Cuantos padres desea registrar: ");
        cant_padres = entrada.nextInt();
        System.out.println("----------------------------------");
        
        entrada.nextLine(); // Limpiador de Scanner
        
        //Ciclo que permite ingresar los datos del padre de familia.
        for(int cont_padres = 1; cont_padres <= cant_padres; cont_padres ++){
            total_pasajes = 0;
            total_bar = 0;
            total_salida = 0;
            
            System.out.printf("%30s\n","DATOS DEL PADRE");
            System.out.printf("%s %d","Padre",cont_padres);
            
            System.out.printf("\n\t%s", "Nombre: ");
            nombre_padre = entrada.nextLine();
            
            System.out.printf("\t%s","Sueldo: ");
            sueldo_padre = entrada.nextDouble();
            
            System.out.printf("\t%s","Cantidad de Hijos: "); // Sentencia que permite controlar las veces que se repetira el segundo ciclo(for).
            cant_hijos =  entrada.nextInt();
             
            //Primera concatenacion de la variable 'cadena1'.
            cadena1 = String.format("\n%s%s %s\n%s%.2f\n%s %d\n\n", cadena1,"Nombre del Padre de Familiaa:"
                             ,nombre_padre.toUpperCase(),"Sueldo Semanal: $",sueldo_padre,"Numero de Hijos:",cant_hijos);
                             cadena1 = String.format("\n%s%s\n------------------------------------------------------\n%s\t\t%s\t\t%s\t\t%s\n"
                             + "------------------------------------------------------\n",cadena1, "Reporte de Gastos ","Persona","Pasajes","Bar","Salida");
            
            entrada.nextLine(); // Limpiador de Scanner
            
            //Ciclo que permite ingresar los datos de los hijos del padre de familia
            for(int cont_hijos = 1; cont_hijos <= cant_hijos; cont_hijos ++){
                     System.out.printf("\n%30s","DATOS DEL HIJO\n");
                     System.out.printf("%s %d\n",hijo,cont_hijos);
            
                     // Segunda concatenacion de la variable 'cadena1'.
                    cadena1 = String.format("%s%s %d", cadena1,hijo,cont_hijos);
            
                    System.out.printf("\tCuanto gasta en Pasajes: ");
                    cant_pasajes = entrada.nextDouble();

                    System.out.printf("\tCuanto gasta en Bar: ");
                    cant_bar = entrada.nextDouble();

                    System.out.printf("\tCuaanto gasta en Salida: ");
                    cant_salida = entrada.nextDouble();

                    //Calculo de todos los valores.
                    total_pasajes = total_pasajes + cant_pasajes;
                    total_bar = total_bar + cant_bar;
                    total_salida = total_salida + cant_salida;
                    
                    // Tercera concatenacion de la variable 'cadena1'.
                    cadena1 = String.format("%s\t\t%-16.2f%-10.2f\t%.2f\n",cadena1,cant_pasajes,cant_bar,cant_salida);

                    entrada.nextLine();//Limpiador de Scanner.
            }
            
            System.out.println("-----------------------------------------");
            
            // Cuarta concatenacion de la variable 'cadena1'.
            cadena1 = String.format("%s------------------------------------------------------\n%-16s%-16.2f%-16.2f%.2f\n",cadena1
                ,"Totales: ",total_pasajes,total_bar,total_salida);
         
            cantidad_total = total_pasajes + total_bar + total_salida; // Calculo que permite controlar la condicion(if).
            
            //Condicion que permite calcular la cantidad de dinero sobrante..
             if (cantidad_total > sueldo_padre){
                 //Concatenacion Final de la variable 'cadena1'.
                 cadena1 = String.format ("%s\n%s %s %s\n------------------------------------------------------\n\n",cadena1,"El padre de Familia"
                                ,nombre_padre.toUpperCase(),"le falta dinero");
                 
             }else{
                 if (cantidad_total == sueldo_padre){
                     //Concatenacion Final de la variable 'cadena1'.
                     cadena1 = String.format("%s\n%s %s %s\n------------------------------------------------------\n\n",cadena1,"El padre de Familia"
                             ,nombre_padre.toUpperCase(),"le alcanza el dinero");
                     
             }else{
                     //Concatenacion Final de la variable 'cadena1'.
                     cadena1 = String.format ("%s\n%s %s %s\n------------------------------------------------------\n\n",cadena1,"El padre de Familia"
                             ,nombre_padre.toUpperCase(),"le sobra dinero");
             }
        }
          
     }    
        System.out.println(cadena1);    //Presentamos en pantalla la variable 'cadena1'   
    }
}
