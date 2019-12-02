/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author A S U S
 */
public class AnggotaTest {
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
        instance = new Anggota("Abdul", "Ciptomulyo", "331264");
        System.out.format("Start Testing : %s \n", this.instance.getNama());
    }
    
    @After
    public void tearDown() {
        System.out.format("Start Testing : %s \n", this.instance.getNama());
    }

    /**
     * Test of getIdAnggota method, of class Anggota.
     */

    /**
     * Test of search method, of class Anggota.
     */
    @Test
    public void testSearch() {
        System.out.println("search test");
        String keyword = "Abdul";
        ArrayList<Anggota> result = instance.search(keyword);
        ArrayList<Anggota> expResult = instance.getByNamaAndAlamat(keyword, "", "");
        assertEquals(expResult.size(), result.size());
    }

    /**
     * Test of save method, of class Anggota.
     */
    @Test
    public void testSave() {
        System.out.println("save test");
        this.instance.save();
        ArrayList<Anggota> expResult = instance.getByNamaAndAlamat(instance.getNama(), instance.getAlamat(), instance.getTelepon());
        assertTrue(expResult.size()>0);
    }

    /**
     * Test of delete method, of class Anggota.
     */

    
}
