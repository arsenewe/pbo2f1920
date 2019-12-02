/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.anggota;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IQBAL
 */
public class AnggotaTest extends TestCase{
    
    Anggota instance;
    
    public AnggotaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Anggota("fanani", "jomabang", "098092831");
        System.out.format("Start Testing : %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    @Test
    public void testSearch() {
        System.out.println("search test");
        String keyword = "iqbal";
        ArrayList<Anggota> result = instance.search(keyword);
        ArrayList<Anggota> expResult = instance.getByNamaAlamatAndTelepon("iqbal", "","");
        assertEquals(expResult.size(), result.size());
    }

    @Test
    public void testSave() {
       System.out.println("save test");
        this.instance.save();
        ArrayList<Anggota> expResult = instance.getByNamaAlamatAndTelepon(instance.getNama(), instance.getAlamat(), instance.getTelepon());
        assertTrue(expResult.size()>0);
    }
    
}
