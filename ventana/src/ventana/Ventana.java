
package ventana;

/**
 *
 * @author Mery Zuñiga
 */
public class Ventana {
    public Ventana(){
       
    }
    
    public void imprimirMensaje(){
        System.out.println("Hola mundo");
    }

    
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.imprimirMensaje();
    }
    
}
