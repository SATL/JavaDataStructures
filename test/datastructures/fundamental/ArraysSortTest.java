/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.fundamental;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author slem
 */
public class ArraysSortTest {
    
    public ArraysSortTest() {
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
     * Test of insertionSort method, of class ArraysSort.
     */
    @Test
    public void testInsertionSort() {
        System.out.println("insertionSort");
        char[] arr = {'c', 'x', 'a'};
        char[] exp = {'a', 'c', 'x'};
        ArraysSort.insertionSort(arr);
        
        assertArrayEquals(exp, arr);
    }

    /**
     * Test of insertionSortDesc method, of class ArraysSort.
     */
    @Test
    public void testInsertionSortDesc() {
        System.out.println("insertionSortDesc");
        char[] arr = {'c', 'x', 'a'};
        char[] exp = {'x', 'c', 'a'};
        ArraysSort.insertionSortDesc(arr);
        
        assertArrayEquals(exp, arr);
    }
    
}
