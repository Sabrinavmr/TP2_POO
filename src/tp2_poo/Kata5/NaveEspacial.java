package tp2_poo.Kata5;




import java.util.Scanner;

public class NaveEspacial {
    
    Scanner input = new Scanner(System.in);

    private String nombre;
    private int combustible;
    
    
    //constructores

    public NaveEspacial() {
    }

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }
    
    //getter and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    //metodos
    
    public int despegar(int combustible, Scanner input, NaveEspacial naveEspacial){
        int combustibleActulizado = 0;
        if (combustible<10) {
            System.out.println("No puede despegar si hay menos de 10 unidades");
        }else{
            System.out.println("se redujeron 10 unidades de combustible");
            combustibleActulizado = combustible - 10;
            naveEspacial.setCombustible(combustibleActulizado);   
        }
        return combustibleActulizado;
    }
    
    public int avanzar(int distancia, int combustible, Scanner input, NaveEspacial naveEspacial){
     
        int combustibleActualizado =  0;
            if (combustible>10 && distancia<combustible) {
                
                combustibleActualizado = combustible - distancia;
                naveEspacial.setCombustible(combustibleActualizado);
            }else{
                System.out.println("No se puede avanzar si no hay suficiente combustible");
            }
            return combustibleActualizado;
    }
    
    
    public void recargarCombustible(int cantidad, int combustible, Scanner input, NaveEspacial naveEspacial){
        
        if (combustible<100 && cantidad<100) {
            
            combustible = combustible + cantidad;
            naveEspacial.setCombustible(combustible);
        }else{
            System.out.println("No se puede superar el limite de 100 unidades.");
        }
    }
    
    
    public void MostrarInfo(){
        System.out.println("Nombre de la nave: "+nombre);
        System.out.println("Cantidad de combustible actual: "+combustible);
    }
}