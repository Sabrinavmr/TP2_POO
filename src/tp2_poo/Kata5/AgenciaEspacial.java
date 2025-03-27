
package tp2_poo.Kata5;

import java.util.Scanner;

public class AgenciaEspacial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        NaveEspacial naveEspacial1 = new NaveEspacial("PEGASUS01", 50);
       
         boolean salida = false;
        do {
         //crear un menu interactivo con el usuario
        
        System.out.println("----Menu-----");
        System.out.println("1- Despegar nave");
        System.out.println("2- Avanzar nave");
        System.out.println("3- Recargar combustible");
        System.out.println("4- Mostrar estado de la nave");
        System.out.println("5- salir del menu");
            System.out.println("Elija una opcion: ");
        int opc = Integer.parseInt(input.nextLine());
       
        switch (opc) {
            case 1: //despegar
               
                break;
                
            case 2: //avanzar
                
            System.out.println("Cuantos pasos quiere avanzar?");
            int distancia = Integer.parseInt(input.nextLine());
            
            if (naveEspacial1.getCombustible()>distancia && naveEspacial1.getCombustible()>10) {
                naveEspacial1.avanzar(distancia, naveEspacial1.getCombustible(), input, naveEspacial1);
            }else{
                System.out.println("No puede avanzar si no hay suficiente combustible");
                //System.out.println("Combustible actual: "+naveEspacial1.getCombustible());
            }
                break;
                
            case 3: //recargar
        //recargar combustible
        System.out.println("Cuanto combustible quiere recargar?: ");
        int cantidad = Integer.parseInt(input.nextLine());
        
        if (naveEspacial1.getCombustible()<100 && cantidad<100) {
            naveEspacial1.recargarCombustible(cantidad, naveEspacial1.getCombustible(), input, naveEspacial1);
        }else{
            System.out.println("No puede superar el limite maximo de 100 unidades.");
        }
                break;
                
            case 4: //mostrar info
                
        //mostrar el estado actual de la nave
                System.out.println("-------------------------");
                System.out.println(" ");
                naveEspacial1.MostrarInfo();
                System.out.println(" ");
                 System.out.println("-------------------------");
                break;
                
            case 5:
                
                System.out.println("Saliendo del menu.....");
                salida = true;
                break;
                
            default:
                System.out.println("Opcion no valida");
        }
        
            
            
            
        } while (!salida);
    }
    
    
}
