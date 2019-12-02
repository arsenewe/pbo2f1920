package unittest.database;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class KategoriTest extends TestCase{
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
        instance = new Kategori("Comics", "Comic is combination words and pictures");
        System.out.format("Start Testing : %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

//    @Test
//    public void testGetIdKategori() {
//        System.out.println("getIdKategori");
//        Kategori instance = new Kategori();
//        int expResult = 0;
//        int result = instance.getIdKategori();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSetIdKategori() {
//        System.out.println("setIdKategori");
//        int idKategori = 0;
//        Kategori instance = new Kategori();
//        instance.setIdKategori(idKategori);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetNama() {
//        System.out.println("getNama");
//        Kategori instance = new Kategori();
//        String expResult = "";
//        String result = instance.getNama();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSetNama() {
//        System.out.println("setNama");
//        String nama = "";
//        Kategori instance = new Kategori();
//        instance.setNama(nama);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetKeterangan() {
//        System.out.println("getKeterangan");
//        Kategori instance = new Kategori();
//        String expResult = "";
//        String result = instance.getKeterangan();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testSetKeterangan() {
//        System.out.println("setKeterangan");
//        String keterangan = "";
//        Kategori instance = new Kategori();
//        instance.setKeterangan(keterangan);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetById() {
//        System.out.println("getById");
//        int id = 0;
//        Kategori instance = new Kategori();
//        Kategori expResult = null;
//        Kategori result = instance.getById(id);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetAll() {
//        System.out.println("getAll");
//        Kategori instance = new Kategori();
//        ArrayList<Kategori> expResult = null;
//        ArrayList<Kategori> result = instance.getAll();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }

    @Test
    public void testSave() {
        System.out.println("save test");
        this.instance.save();
        ArrayList<Kategori> expResult = instance.getByNamaAndKeterangan(instance.getNama(), instance.getKeterangan());
        assertTrue(expResult.size()>0);
    }
    
        @Test
    public void testSearch() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori> result = instance.search(keyword);
        ArrayList<Kategori> expResult = instance.getByNamaAndKeterangan(instance.getNama(), instance.getKeterangan());
        assertTrue(expResult.size()>0);
    }

//    @Test
//    public void testDelete() {
//        System.out.println("delete");
//        Kategori instance = new Kategori();
//        instance.delete();
//        fail("The test case is a prototype.");
//    }
    
}
