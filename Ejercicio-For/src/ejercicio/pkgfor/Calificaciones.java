/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
    Programa que permite generar un reporte de calificaciones de cualquier cantidad de estudiantes
*/
package ejercicio.pkgfor;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner entrada = new Scanner(System.in); // Importamos el metodo Scanner
             
            //Variables Globales.
            String nombre_estudiante;
            String cadena;
            String nombre_materia;
            int edad;
            int cant_asignaturas;
            int cant_estudiantes;
            double bimestre1;
            double bimestre2;
            double promedio;
            double promedio_final;
            
            // Valor Inicial que toma la variable 'cadena'.
            cadena = String.format("\n%50s\n-----------------------------------------------------\n","Reporte Calificaciones de Estudiantes");

             System.out.printf("%30s\n","Registro de Estudiantes");
             //Sentencia que permite determinar la cantidad de veces que se repetira el primer ciclo(for).
             System.out.printf("\n%s", "Cuantos estudiantes desea registrar: ");
             cant_estudiantes = entrada.nextInt();
             System.out.println("---------------------------------------");

             entrada.nextLine();// Limpiador del Scanner.
             
           //Ciclo principal.
            for (int cont_estudiantes = 1; cont_estudiantes <= cant_estudiantes; cont_estudiantes ++){
                        promedio_final = 0;
                        
                        //Datos del estudiante.
                        System.out.printf("\n%30s\n","DATOS DEL ESTUDIANTE");      
                        System.out.printf("%s %d","Estudiante",cont_estudiantes);

                        System.out.printf("\n\t%s","Nombre: ");
                        nombre_estudiante = entrada.nextLine();

                        System.out.printf("\t%s","Edad: ");
                        edad = entrada.nextInt();
                         
                        //Sentencia que permite determinar la cantidad de veces que se repetira el segundo ciclo(for).
                        System.out.printf("\t%s","Número de Asignaturas: ");
                        cant_asignaturas = entrada.nextInt();
                        
                        //Primera concatenacion de la variable 'cadena'.
                        cadena = String.format("%s%s %d: %s\n%s%d\n%s%d\n\n",cadena,"Nombre de Estudiante",cont_estudiantes,
                                nombre_estudiante.toUpperCase(),"Edad: ",edad, "Número de Asiganturas: ",cant_asignaturas);
                        
                        //Segunda concatenacion de la variable 'cadena'.
                        cadena = String.format("%s%s\n-----------------------------------------------------\n%-15s%-15s%-15s%-15s\n-----------------------------"
                                + "------------------------\n", cadena,"Reporte de Notas","Materia","Bim-1","Bim-2" ,"Promedio");

                        entrada.nextLine(); // Limpiador de Scanner         
                        
                        //Segundo ciclo(for) donde se ingresa el nombre de materia y las respectivas calificaciones de los 2 bimestes.
                        for(int cont_asignaturas = 1; cont_asignaturas <= cant_asignaturas; cont_asignaturas ++ ){
                                               
                                    System.out.printf("\n%30s\n","DATOS DE LA MATERIA"); 
                                    System.out.printf("%s %d","Materia",cont_asignaturas);

                                    System.out.printf("\n\t%s", "Nombre: ");
                                    nombre_materia = entrada.nextLine();
                                    nombre_materia = Character.toUpperCase(nombre_materia.charAt(0)) + nombre_materia.substring(1,nombre_materia
                                            .length()); // Metodo que permite convertir en mayuscula la primera letra de la palabra.
                                    
                                    System.out.printf("\n%30s\n","REPORTE DE NOTAS");   
                                    System.out.printf("%s\n",nombre_materia);

                                     System.out.printf("\t%s","Bimestre 1: ");
                                     bimestre1 = entrada.nextDouble();
                                     
                                     entrada.nextLine();//Limpiador del Scanner.
                                     
                                     //Condicion que controla que no se ingresen notas mayores a los 20 pts.
                                     if(bimestre1 > 20){
                                              //Si la nota es mayor a 20 pts presenta un mensaje y permite ingresar una nueva calificacion
                                              System.out.printf("\n%s\n","ADVERTENCIA: Se permiten notas hasta los 20 pts.");
                                              System.out.printf("\n\t%s", "Nueva nota Bimestre 1: ");
                                              bimestre1 = entrada.nextDouble();
                                              entrada.nextLine();//Limpiador de Scanner
                                    }    
                                    System.out.printf("\t%s","Bimestre 2: ");
                                    bimestre2 = entrada.nextDouble();
                                    
                                    entrada.nextLine();//Limpiador del Scanner.
                                    
                                    //Condicion que controla que no se ingresen notas mayores a los 20 pts.
                                    if (bimestre2 > 20){
                                              //Si la nota es mayor a 20 pts presenta un mensaje y permite ingresar una nueva calificacion
                                              System.out.printf("\n%s\n","ADVERTENCIA: Se permiten notas hasta los 20 pts.");
                                              System.out.printf("\n\t%s", "Nueva nota Bimestre 2: ");
                                              bimestre2 = entrada.nextDouble();
                                              entrada.nextLine();//Limpiador del Scanner.
                                    }
                   
                                    promedio = (bimestre1 + bimestre2) / 2;//Calcula el promedio de los 2 bimestres
                                    promedio_final = promedio_final + promedio;//Suma el promedio de todas las materias.
                                     
                                    //Tercera Concatenacion de la variable 'cadena'
                                    cadena = String.format("%s%-15s%-15.1f%-15.1f%-15.1f\n", cadena, nombre_materia, bimestre1,bimestre2,promedio);
                         }
                        System.out.printf("----------------------------------------\n");
                        promedio_final = promedio_final / cant_asignaturas;//Calcula el promedio general del estudiante.
                        
                        //Cuarta Concatenacion de la variable 'cadena'
                        cadena = String.format("%s%38s%11.1f\n\n", cadena,"Promedio",promedio_final);
                        
                        //Condicion que permite saber el promedio del estudiante.
                        if(promedio_final >=19){
                                  //Concatenacion Final de la variable 'cadena'.
                                  cadena = String.format("%s%s Tiene un promedio de SOBRESALIENTE\n"
                                          + "-----------------------------------------------------\n\n", cadena,nombre_estudiante.toUpperCase());
                        }else{
                                  if (promedio_final >= 16 && promedio_final < 19 ){
                                            //Concatenacion Final de la variable 'cadena'.
                                             cadena = String.format("%s%s Tiene un promedio de MUY BUENO\n"
                                                     + "-----------------------------------------------------\n\n", cadena,nombre_estudiante.toUpperCase());
                                  }else{
                                             if (promedio_final >= 13 && promedio_final < 16){
                                                        //Concatenacion Final de la variable 'cadena'.
                                                        cadena = String.format("%s%s Tiene un promedio de BUENO\n"
                                                                + "-----------------------------------------------------\n\n", cadena,nombre_estudiante.toUpperCase());
                                             }else{
                                                        //Concatenacion Final de la variable 'cadena'.
                                                        cadena = String.format("%s%s Tiene un promedio de REGULAR\n"
                                                                + "-----------------------------------------------------\n\n", cadena,nombre_estudiante.toUpperCase());
                                             }
                                  }
                        }
             }
            System.out.println(cadena);    //Presenta en pantalla el valor que tiene la variable 'cadena'.
        
       }
    
}

            
            