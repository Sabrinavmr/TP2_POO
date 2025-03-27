
package tp2_poo.Kata2;

import java.util.Scanner;

public class GestionMascotas {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //crear instancia de la clase Mascota
        Mascota mascota1 = new Mascota("Nini", "Siames", 12);
        
        //mostrar la informacion mediante los metodos de la clase Mascota
        System.out.println(mascota1.toString());
        
        //aumentar un anio
        int edadNueva = mascota1.cumplirAnios(1, 12);
        
        //actualizar info
        mascota1.setEdad(edadNueva);
        System.out.println("");
        
        //mostrar informacion actualizada
        System.out.println("Informacion Actualizada!");
        System.out.println(" ");
        System.out.println(mascota1.toString());
        
    }
}
