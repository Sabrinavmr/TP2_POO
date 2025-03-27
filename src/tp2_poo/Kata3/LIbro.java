
package tp2_poo.Kata3;

import java.util.Scanner;

public class LIbro {

    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    //constructores

    public LIbro() {
    }

    public LIbro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    
    //get and setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
    

    public void setNuevoAnio(int anioPublicacion) {
        
        Scanner input = new Scanner(System.in);
               
        int nuevoAnio = 0;
        do {
            System.out.println("ingrese nuevo año del libro: ");
        nuevoAnio = Integer.parseInt(input.nextLine());
        
           if (nuevoAnio>1900 && nuevoAnio <anioPublicacion) {
              this.anioPublicacion = nuevoAnio;
            
           }else{
            System.out.println("No se puede modificar si el año es menor a 1900 o mayor al año actual, intentelo de nuevo");
            }
           
        } while (nuevoAnio<1900 || nuevoAnio>anioPublicacion);
        
    }
    
    //metodos

    @Override
    public String toString() {
        return "Titulo del libro: " + titulo+System.lineSeparator() +
                "Autor: " + autor+System.lineSeparator() +
                "Año de publicación: " + anioPublicacion;
                
    }
    
    
    
    
    
}
