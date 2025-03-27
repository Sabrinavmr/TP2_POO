
package tp2_poo.Kata4;

public class Gallina {

    private String idGallina;
    private int edad;
    private int huevosPuestos;
    
    //contructores

    public Gallina() {
    }

    public Gallina(String idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }
    
    //getter and setters

    public String getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(String idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    //metodos
    public int ponerHuevo(int huevosPuestos, Gallina gallina){
        
        int nuevoHuevo = 1;
        
        huevosPuestos = huevosPuestos + nuevoHuevo;
        gallina.setHuevosPuestos(huevosPuestos);
        
        
        return huevosPuestos;
    }
    
    
    public int envejecer(int edad, Gallina gallina){
        
        int nuevoAnio = 1;
        
        edad = edad + nuevoAnio;
        gallina.setEdad(edad);
        
        return edad;
    }
    
    public void mostrarEstado(){
        System.out.println("---------------------------------------");
        System.out.println("Estado de la gallina: ");
        System.out.println("ID: "+idGallina);
        System.out.println("Edad: "+edad);
        System.out.println("Cantidad de huevos puestos: "+huevosPuestos);
        System.out.println("---------------------------------------");
    }
}
