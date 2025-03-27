
package tp2_poo.Kata2;

public class Mascota {

    private String nombre;
    private String especie;
    private int edad;
    
    
    //constructor

    public Mascota() {
    }

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    //getter and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //metodos

    @Override
    public String toString() {
        return "Nombre de la mascota: " + nombre + System.lineSeparator()
               + "Especie: " + especie + System.lineSeparator()
               + "Edad: " + edad 
                ;
    }
    
    public int cumplirAnios(int anio, int edad){
        int edadNueva = 0;
        edadNueva = edad + anio;
        
        return edadNueva;
    }
    
    
}
