/**
 *
 * @author Rental Servicios
 */
public class Aplicacion {
    public static void main(String[] args){
        Cajero cajeroAutomatico = new Cajero();
        Thread pepito = new Thread(cajeroAutomatico, "Pepito");
        Thread juanito = new Thread(cajeroAutomatico, "Juanito");
        
        pepito.start();
        juanito.start();
    }
}
