
package tp2_poo.Kata4;

import java.util.Scanner;

public class GranjaDigital {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Gallina gallina1 = new Gallina("popi", 10, 2);
        Gallina gallina2 = new Gallina("popu", 8, 1);
        
        //mostrar
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        
        //aumentamos huevos +1
        gallina1.ponerHuevo(gallina1.getHuevosPuestos(),gallina1);
        gallina2.ponerHuevo(gallina2.getHuevosPuestos(),gallina2);
        
        //aumentamos edad +1
        gallina1.envejecer(gallina1.getEdad(),gallina1);
        gallina2.envejecer(gallina2.getEdad(),gallina2);
        
        //mostrar por consola con datos actualizados
        System.out.println("Informacion Actualizada!");
        gallina1.mostrarEstado();
        System.out.println(" ");
        gallina2.mostrarEstado();
    }
}
