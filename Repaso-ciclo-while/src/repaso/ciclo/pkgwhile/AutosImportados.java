/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
    Programa que permite ingresar el registro de autos importados, calcular el impuesto de acuerdo al pais de origen y generar un reporte.
*/
package repaso.ciclo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class AutosImportados {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in); // importamos el metodo Scanner que permite ingresar datos por teclado.
        
        int total_autos;
        int cant_autos = 1 ;
        String marca;
        String origen;
        double costo;
        double impuesto;
        double precio_venta;
        double precio_total = 0;
        double total_impuestos = 0;
        String cadena1, cadena2="", cadena3="", cadena4="", cadena5="", cadena_final="";
        int autos_chile = 0;
        int autos_colombia = 0;
        int autos_argentina = 0;
        int otros_paises = 0;
        
        //Valor inicial que toma la variable 'cadena1'
        cadena1 = String.format("%50s\n----------------------------------------------------------------------------\n%s\t\t%s\t\t%s\t\t%s\t%s\n"
                + "----------------------------------------------------------------------------\n", "Reporte de Autos Importados","Marca","Origen",
                "Costo","Impuesto","Precio Venta");
        
        //Solicitamos al usuario la cantidad de autos que desea registrar.
        System.out.printf("%30s", "AUTOS LOJA\n");
        System.out.printf("Ingrese la cantidad de autos que desea registrar: ");
        total_autos = entrada.nextInt();
        System.out.printf("-----------------------------------------------------------------\n");
        
        entrada.nextLine(); // Limpiador del metodo Scanner.
        
        //Ciclo que permite el registro de los autos
        while (cant_autos <= total_autos){
            System.out.printf("%35s","DATOS DEL AUTOMOVIL\n");
            System.out.printf("Auto %d\n",cant_autos);
            
            System.out.printf("\tMarca: ");
            marca = entrada.nextLine();
            marca = Character.toUpperCase(marca.charAt(0)) + marca.substring(1,marca.length()); // Convierte la primera letra de la palabra en Mayuscula
                   
            System.out.printf("\tOrigen: ");
            origen = entrada.nextLine();
            origen = Character.toUpperCase(origen.charAt(0)) + origen.substring(1,origen.length()); // Convierte la primera letra de la palabra en Mayuscula.
            
            System.out.printf("\tCosto: ");
            costo = entrada.nextDouble();
             
            //Condicion que permite calcular el impuesto del auto segun el origen del mismo.          
            if (origen.equals("Argentina")){
                        impuesto = costo * 0.20;
                        precio_venta = costo + impuesto;
                        autos_argentina = autos_argentina + 1; // Acumulador que permite calcular el total de autos que corresponden a cada pais.
                        cadena2 = String.format("%-24s%d\n",origen,autos_argentina); //Se guarda en la variable 'cadena2' el origen del auto y el total de autos que son del mismo.
            }else{
                        if (origen.equals("Colombia")){
                             impuesto = costo * 0.25;
                             precio_venta = costo + impuesto;
                             autos_colombia = autos_colombia + 1; // Acumulador que permite calcular el total de autos que corresponden a cada pais.
                             cadena3 = String.format("%-24s%d\n", origen,autos_colombia);//Se guarda en la variable 'cadena3' el origen del auto y el total de autos que son del mismo.
                       }else{
                             if (origen.equals("Chile")){
                                    impuesto = costo * 0.30;
                                    precio_venta = costo + impuesto;
                                    autos_chile = autos_chile + 1;// Acumulador que permite calcular el total de autos que corresponden a cada pais.
                                    cadena4 = String.format("%-24s%d\n",origen,autos_chile); //Se guarda en la variable 'cadena4' el origen del auto y el total de autos que son del mismo.
                             
                             }else{
                                   impuesto =  costo * 0.40;
                                   String origen_temporal = "Resto de Paises";
                                   precio_venta = costo + impuesto;
                                   otros_paises = otros_paises + 1;// Acumulador que permite calcular el total de autos que corresponden a cada pais.
                                   cadena5 = String.format("%-24s%d\n",origen_temporal,otros_paises);  //Se guarda en la variable 'cadena4' el origen del auto y el total de autos que son del mismo.
                        }     
                }
           }
            cadena_final = String.format("%s%s%s%s",cadena2, cadena3, cadena4, cadena5); // Concatenamos en la variable 'cadena_final' lo que tenga cada una de las variables(cadena2,cadena3,cadena4,cadena5)
            total_impuestos = total_impuestos + impuesto; // Calcula el total de impuestos de todos los autos.
            precio_total = precio_total + precio_venta; // Calcula el precio total de venta de todos los autos.
            cadena1 = String.format("%s%-16s%-15s\t%.2f\t%-16.2f%.2f\n",cadena1,marca,origen,costo,impuesto,precio_venta); // Concatenamos la variable 'cadena1' con cada datos calculado.
            cant_autos = cant_autos + 1; // Acumulador que permite salir del ciclo repetitivo(while).
          
            entrada.nextLine(); //Limpiador de Scanner.
      }
        cadena1 = String.format("%s----------------------------------------------------------------------------\n%-16s%d\t%s %.2f\t%-16s%.2f\n",cadena1
                ,"Total Autos",total_autos,"Tot. Imps",total_impuestos,"Tot. PV",precio_total); // Concatenamos la variable 'cadena1' con los siguientes datos calculados.
        
        System.out.println(cadena1);// Presentamos en pantalla lo que contenga la variable 'cadena1'.
        System.out.println(cadena_final); // Presenta en pantalla lo que contenga la variable 'cadena_final'
   }
}