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
 * @author ROG
 */
public class KategoriTest extends TestCase {
    
    Kategori instance;
    
    public KategoriTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance=new Kategori("Comics", "Comic is combinations words and pictures");
        System.out.format("Start Testing : %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }
    @Test
    public void testSearch() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori> expResult =instance.getByNamaAndKeterangan(keyword, "");
        ArrayList<Kategori> result = instance.search(keyword);
        assertEquals(expResult.size(), result.size());
    }

    /**
     * Test of save method, of class Kategori.
     */
    @Test
    public void testSave() {
        System.out.println("save test");
        this.instance.save();
        ArrayList<Kategori>expResult=instance.getByNamaAndKeterangan(instance.getNama(),instance.getKeterangan());
        assertTrue(expResult.size()>0);
    }

    /**
     * Test of delete method, of class Kategori.
     */
    
}