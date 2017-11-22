/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import banco.BancoClass;
import banco.CuentaCorrienteClass;
import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author alumne
 */
public class BancoTest {
    
    static CuentaCorrienteClass c1; 
    static BancoClass b1;
    
    
    @Test
    public void TestRetirar() {
        System.out.println("Retirar");
        boolean test=c1.retirar(200);
        assertTrue(true);
    }
    @Test
    public void TestTAE() {
        System.out.println("TAE");
        c1.ingreso(1000);
        long expected=100;
        double result=c1.interesTAE();
        assertEquals(expected, 100);
    }
    @BeforeClass
    public static void before(){
        System.out.println("before");
        b1=new BancoClass("BNC Internacional Banc",10.5,"C/llacuna, 10");
        c1=new CuentaCorrienteClass("Marc", "45454578X", b1, 10);
    }
}
