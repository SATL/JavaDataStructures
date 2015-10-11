/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.generics;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Slem
 */
public class GenericsTest {
    
    public GenericsTest() {
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
     * Test of reverse method, of class Generics.
     */
    @Test
    public void testReverse() {
        System.out.println("reverse");
        String[] data = {"qwe", "asd", "zxc"};
        String[] expResult= {"zxc", "asd", "qwe"};
        Generics.reverse(data);
        assertArrayEquals(data, expResult);
    }
    
}
