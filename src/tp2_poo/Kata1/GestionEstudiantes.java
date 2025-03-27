
package tp2_poo.Kata1;

import java.util.Scanner;


public class GestionEstudiantes {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //crear instancia de Estudiante
        
        Estudiante estudiante1 = new Estudiante("Sabrina", "Moreira", "Primer año", 8);
        
        //mostrar info con el metodo de la clase Estudiante
        estudiante1.mostrarInfo();
        
        //aumentar la calificacion de la clase Estudiante
        double nota = estudiante1.subirCalificaion(2, 8);
        estudiante1.setCalificacion(nota);
        System.out.println("  ");
        
        //mostrar info con la calificacion actualizada
        System.out.println("informacion actualizada!");
        estudiante1.mostrarInfo();
        
        
        //disminuir ls calificacion de la clase Estudiante
        nota = estudiante1.bajarCalificacion(3, 8);
        estudiante1.setCalificacion(nota);
        System.out.println(" ");
        
        //mostrar info con la calificacion actualizada
        System.out.println("informacion actualizada!");
        estudiante1.mostrarInfo();
       
        
        
    }
}
