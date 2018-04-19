/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class UsoSwitch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int contador = 5;
        
        switch(contador){
            case 1:
                System.out.printf("Día %s\n", "Lunes");
                break;
            
            case 2:
                System.out.printf("Día %s\n", "Martes");
                break;    
            
            case 3:
                System.out.printf("Día %s\n", "Miercóles");
                break;
                
            case 4:
                System.out.printf("Día %s\n", "Jueves");
                break;
                
            default:
                System.out.println("ninguna de las anteriores");
                
        }
        
    }
}
