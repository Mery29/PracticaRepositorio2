
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
        System.out.println("Meribeth Zúñiga Zúñiga");
    }

    
    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.imprimirMensaje();
    }
    
}
