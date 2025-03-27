
package tp2_poo.Kata3;

import tp2_poo.Kata3.LIbro;
import java.util.Scanner;

public class GestionBiblioteca {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //crear una instancia de libro
        LIbro libro1 = new LIbro();
        
        System.out.println("Ingrese nombre del libro: ");
        libro1.setTitulo(input.nextLine());
        
        System.out.println("Ingresse autor del libro: ");
        libro1.setAutor(input.nextLine());
        
        System.out.println("Ingrese año del libro: ");
        libro1.setAnioPublicacion(Integer.parseInt(input.nextLine()));
        
        
        //modificar anio
        libro1.setNuevoAnio(libro1.getAnioPublicacion());
        System.out.println(" ");
        
        System.out.println("Informacion del libro: ");
        System.out.println(libro1.toString());
              
    }
}
