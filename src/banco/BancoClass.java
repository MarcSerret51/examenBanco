/**
 * La classe BancoClass conté métodes i constructors per aquest 
 * @author Marc Serret
 * @version 1.1
 * @since 22 novembre
 */

package banco;
public class BancoClass {
    //attributes
    final private String nombre;
    double capital = 5.2;
    String direccion ="Sin direccion";
    /** 
    * BancoClass(String nombre)
    * Constructor de nom
    * @param String nombre. El nom
    * @return nothing
    * @version 1.0
    * @since 22/11//17
    */
    BancoClass(String nombre) {
        this.nombre = nombre;
    }
    
    /** 
    * BancoClass(String nombre, double capital, String direccion)
    * Constructor total
    * @since 22/11//17
    */
    public BancoClass (String nombre, double capital, String direccion){
        
        this.nombre = nombre;
        this.capital = capital;
        this.direccion = direccion;
    }
    
    /**
     * Metodo per mostrar la info del banc
     * @author Marc Serret
     * @version 1.0
     * @since 22/11//17
     */
    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Capital: " + capital);
        System.out.println("Direccion: " + direccion);
        System.out.println("");        
    }
}
