/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

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
 * @author user
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
        instance = new Anggota("Susilo", "Bandung", "089999");
        System.out.format("Start Testing : %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }
//
//    /**
//     * Test of getIdanggota method, of class Anggota.
//     */
//    @Test
//    public void testGetIdanggota() {
//        System.out.println("getIdanggota");
//        Anggota instance = new Anggota();
//        int expResult = 0;
//        int result = instance.getIdanggota();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setIdanggota method, of class Anggota.
//     */
//    @Test
//    public void testSetIdanggota() {
//        System.out.println("setIdanggota");
//        int idanggota = 0;
//        Anggota instance = new Anggota();
//        instance.setIdanggota(idanggota);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getNama method, of class Anggota.
//     */
//    @Test
//    public void testGetNama() {
//        System.out.println("getNama");
//        Anggota instance = new Anggota();
//        String expResult = "";
//        String result = instance.getNama();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setNama method, of class Anggota.
//     */
//    @Test
//    public void testSetNama() {
//        System.out.println("setNama");
//        String nama = "";
//        Anggota instance = new Anggota();
//        instance.setNama(nama);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAlamat method, of class Anggota.
//     */
//    @Test
//    public void testGetAlamat() {
//        System.out.println("getAlamat");
//        Anggota instance = new Anggota();
//        String expResult = "";
//        String result = instance.getAlamat();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAlamat method, of class Anggota.
//     */
//    @Test
//    public void testSetAlamat() {
//        System.out.println("setAlamat");
//        String alamat = "";
//        Anggota instance = new Anggota();
//        instance.setAlamat(alamat);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTelepon method, of class Anggota.
//     */
//    @Test
//    public void testGetTelepon() {
//        System.out.println("getTelepon");
//        Anggota instance = new Anggota();
//        String expResult = "";
//        String result = instance.getTelepon();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setTelepon method, of class Anggota.
//     */
//    @Test
//    public void testSetTelepon() {
//        System.out.println("setTelepon");
//        String telepon = "";
//        Anggota instance = new Anggota();
//        instance.setTelepon(telepon);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getById method, of class Anggota.
//     */
//    @Test
//    public void testGetById() {
//        System.out.println("getById");
//        int id = 0;
//        Anggota instance = new Anggota();
//        Anggota expResult = null;
//        Anggota result = instance.getById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAll method, of class Anggota.
//     */
//    @Test
//    public void testGetAll() {
//        System.out.println("getAll");
//        Anggota instance = new Anggota();
//        ArrayList<Anggota> expResult = null;
//        ArrayList<Anggota> result = instance.getAll();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of search method, of class Anggota.
     */
    @Test
    public void testSearch() {
        System.out.println("search test");
        String keyword = "Susilo";
        ArrayList<Anggota> result = instance.search(keyword);
        ArrayList<Anggota> expResult = instance.getByNamaAndAlamat(keyword,"","");
        assertEquals(expResult.size(), result.size());

    }

    @Test
    public void testSave() {
        System.out.println("save test");
        this.instance.save();
        ArrayList<Anggota> expResult = instance.getByNamaAndAlamat(instance.getNama(), instance.getAlamat(), instance.getTelepon());
        assertTrue(expResult.size()>0);
    }

//    /**
//     * Test of delete method, of class Anggota.
//     */
//    @Test
//    public void testDelete() {
//        System.out.println("delete");
//        Anggota instance = new Anggota();
//        instance.delete();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
