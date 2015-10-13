/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.fundamental;

import datastructures.fundamental.dommain.GameEntry;
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
public class ScoreboardTest {

    public ScoreboardTest() {
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
     * Test of add method, of class Scoreboard.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        GameEntry entry = new GameEntry("One", 100);
        GameEntry entry2 = new GameEntry("Two", 50);
        GameEntry entry3 = new GameEntry("Three", 10);
        GameEntry[] board = {entry, entry2, entry3};

        Scoreboard instance = new Scoreboard(3);
        instance.add(entry);
        instance.add(entry3);
        instance.add(entry2);

        assertArrayEquals(board, instance.getBoard());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of remove method, of class Scoreboard.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");

        int i = 1;

        GameEntry entry = new GameEntry("One", 100);
        GameEntry entry2 = new GameEntry("Two", 50);
        GameEntry entry3 = new GameEntry("Three", 10);
        GameEntry[] board = {entry, entry3, null};

        Scoreboard instance = new Scoreboard(3);
        instance.add(entry);
        instance.add(entry3);
        instance.add(entry2);

        GameEntry result = instance.remove(i);
        assertEquals(entry2, result);

        assertArrayEquals(board, instance.getBoard());

    }
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void testRemoveOutOfEntries(){
        
        int i = 1;
        GameEntry entry = new GameEntry("One", 100);
        GameEntry entry2 = new GameEntry("Two", 50);
        GameEntry entry3 = new GameEntry("Three", 10);
        GameEntry[] board = {entry, entry3, null};

        Scoreboard instance = new Scoreboard(3);
        instance.add(entry);
        instance.add(entry3);
        instance.add(entry2);

        GameEntry result = instance.remove(i);
        
        i=2;
        instance.remove(i);
    }

}
