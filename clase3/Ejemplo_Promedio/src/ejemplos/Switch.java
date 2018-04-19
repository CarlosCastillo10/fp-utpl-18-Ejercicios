/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author Salas
 */


/**
 *
 * @author reroes
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nombre = "Ambato";
        char valor = nombre.charAt(0);
                
        switch(valor){
            case 'a':
            case'A':
                System.out.printf("Nombre con inicial %s\n", nombre.toUpperCase());
                break;
            
            case 'e':
                System.out.printf("Nombre con inicial %s\n", nombre.toLowerCase());
                break;    
            
            default:
                System.out.println("ninguna de las anteriores");
                
        }
        
    }
}
