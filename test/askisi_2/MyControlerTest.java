/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi_2;

import dao.Idao;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import stubdao.StubDao;

/**
 *
 * @author fil
 */
public class MyControlerTest {
    
    public MyControlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMaxnumbers method, of class MyControler.
     */
        @Test
    public void testMyControllerListNull() {
        System.out.println("Listnull");
        Idao dao = new StubDao();
        MyControler instance = new MyControler(dao);
        assertEquals(0, instance.getMaxnumbers());
       
    }
    /**
     * Test of getMaxnumbers method, zero numbers.
     */
    @Test
    public void testMyControllerListWithOnlyZero() {
        System.out.println("getZero");
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        Idao dao = new StubDao(numbers);
        MyControler instance = new MyControler(dao);
        int expResult = 0;
        int result = instance.getMaxnumbers();
        assertEquals(expResult, result);
       
    }
    /**
     * Test of getMaxnumbers method, max 5 whith negative number -6.
     */   
         @Test
    public void testMyControllerListwhithmax5() {
        System.out.println("getNumbersMax5");
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(-6);
        numbers.add(3);
        numbers.add(5);
        Idao dao = new StubDao(numbers);
        MyControler instance = new MyControler(dao);
        int expResult = 5;
        int result = instance.getMaxnumbers();
        
        assertEquals(expResult, result);
       
    }  
    /**
     * Test of getMaxnumbers method, only one negative numbers.
     */
         @Test
    public void testMyControllerListonlyone() {
        System.out.println("getNumbers only one");
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(-6);
        Idao dao = new StubDao(numbers);
        MyControler instance = new MyControler(dao);
        int expResult = -6;
        int result = instance.getMaxnumbers();
        
        assertEquals(expResult, result);
       
    }
     @Test
    public void testMyControllerListnegative() {
        System.out.println("max with negative numbers");
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(-6);
        numbers.add(-5);
        numbers.add(0);
        Idao dao = new StubDao(numbers);
        MyControler instance = new MyControler(dao);
        int expResult = 0;
        int result = instance.getMaxnumbers();
        
        assertEquals(expResult, result);
       
    }
    
}
