
package banco;
import banco.BancoClass;
import banco.CuentaCorrienteClass;
public class BancoMain{
    public static void main(String[] args) {
        
        CuentaCorrienteClass c1,c2,c3;
        BancoClass b1;              
        BancoClass b2;
              
        //Instanciem 2 objectes Banc
        
        b1 = new BancoClass("Tokio Internacional Banc ");
        b2 = new BancoClass("BNC Internacional Banc",10.5,"C/llacuna, 10");
        
        
        
        //Instaciem varies comptes de corrent                
        
        c1 = new CuentaCorrienteClass("Ana Pastor","24876987Y",b1,3);
        c1.ingreso(100000);
        c1.mostrarInformacion();
        c1.retirar(10000000);
        c2 = new CuentaCorrienteClass("Juan Jose","45876123O",b1,6);
        c2.ingreso(50000);
        c2.mostrarInformacion();
        c2.retirar(40000);
        c2.cambiarBanco(b2);
        c2.mostrarInformacion();
        System.out.println("InteresTAE: " + c2.interesTAE());
        c3= new CuentaCorrienteClass("Maria Perez","90876345E",null,2);
        c3.mostrarInformacion();
                     
        }
    }