
package tp2_poo.Kata1;

public class Estudiante {
  
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    
    //constructores
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public Estudiante() {
    }
    //get and set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    //metodos
    
    public void mostrarInfo(){
        System.out.println("--------------------------------------");
        System.out.println("Nombre del estudiante: "+nombre);
        System.out.println("Apellido del estudiante: "+apellido);
        System.out.println("Curso: "+curso);
        System.out.println("calificación: "+calificacion);
        System.out.println("--------------------------------------");
    }
    
    public double subirCalificaion(double puntos, double calificacion){
         double calificacionAumentada = 0;
         
         if (puntos<=10){
            calificacionAumentada = calificacion + puntos;
            
        }else{
             System.out.println("se paso del limite de puntos");
         }
       
        return calificacionAumentada;
         
    }
    
    
    public double bajarCalificacion(double puntos, double calificacion){
        double nuevaCalificacion = 0;
        
        if (puntos>=0) {
            nuevaCalificacion = calificacion - puntos;
        }else{
            System.out.println("el minimo de puntos es cero ");
        }
        return nuevaCalificacion;
        
    }
    
}
