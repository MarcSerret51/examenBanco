package banco;

/**
 * La classe CuentaCorrienteClass conté métodes i constructors per aquest 
 * @author Marc Serret
 * @version 1.1
 * @since 22 novembre
 */
public class CuentaCorrienteClass {
    //attributes
    private double saldo;
    public String nombre;
    String dni;  
    private double limite;   
    private double interes;
    BancoClass banco;
    
    
    
    /** 
    * CuentaCorrienteClass(String nombre, String dni, BancoClass banco, double interes)
    * Constructor
    * @return nothing
    * @since 22/11//17
    */
    public CuentaCorrienteClass(String nombre, String dni, BancoClass banco, double interes) {
        
        saldo = 0;
        limite = -50;
        this.nombre = nombre;
        this.dni = dni;
        this.banco = banco;
        this.interes = interes;
        
     }
    
    /**
     * Determina si es poden retirar diners. En cas afirmatiu retorna true i realitza la transacció. En cas negatiu retorna false.
     * @param cant La quantitat de diners que es volen treure
     * @return boolean true si es pot realitzaro fals si no es pot duur a terme
     * @since 22/11//17
     * @version 1.1
     */
    public boolean retirar(double cant) {
       if(saldo-cant>=limite) {
           saldo=saldo-cant;
           return true;
       }
       else return false;
    }
    
     
    /**
     * Suma l'ingres al compte corrent
     * @param cant La quantitat de diners que es volen afegir
     * @since 22/11//17
     * @version 1.1
     */
    public void ingreso(double cant){
        saldo=saldo+cant;
    }
    
    /**
     * Calcula l'interes TAE
     * @return double amb el TAE ja calculat
     * @since 22/11//17
     * @version 1.1
     */
    public double interesTAE() {        
        return saldo*interes/100;
    }
    
    /**
     * Cambia el banc de l'usuari
     * @return nothing
     * @param banco objecte tipus BancoClass
     * @since 22/11//17
     * @version 1.1
     */
    void cambiarBanco(BancoClass banco){
        this.banco = banco;        
    }
    
   /**
     * Mostra info del compte corrent
     * @return nothing
     * @param nothing
     * @since 22/11//17
     * @version 1.1
     */ 
    void mostrarInformacion() {
        if (banco!=null)
        {
            banco.mostrarInformacion();
        }
        System.out.println("Nombre cliente: "+nombre);
        System.out.println("DNI cliente: "+dni);
        System.out.println("Interes cliente: "+interes);
        System.out.println("Saldo cliente: "+saldo);
        System.out.println("Limite cliente: "+limite);
        System.out.println("---------------------------------------------------------");
        
        
    }
}