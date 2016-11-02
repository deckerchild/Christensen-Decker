/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.strangerThings.control;

import byui.cit260.strangerThings.control.Weapon;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tcfat
 */
public class WeaponTest {
    
    public WeaponTest() {
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
     * Test of monsterEquation method, of class Weapon.
     */
    @Test
    public void testMonsterEquation() {
        System.out.println("test case valid");
        double mass = 12.0;
        double vel = 0.25;
        double speed = 1.0;
        Weapon instance = new Weapon();
        double expResult = 10.7904;
        double result = instance.monsterEquation(mass, vel, speed);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("test case invalid #1");
        mass = -1;
        vel = 9;
        speed = 12;
        instance = new Weapon();
        expResult = -1;
        result = instance.monsterEquation(mass, vel, speed);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("test case invalid #2");
        mass = 24;
        vel = 1;
        speed = -1;
        instance = new Weapon();
        expResult = -1;
        result = instance.monsterEquation(mass, vel, speed);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("test case invalid #3");
        mass = 24;
        vel = 37;
        speed = -1;
        instance = new Weapon();
        expResult = -1;
        result = instance.monsterEquation(mass, vel, speed);
        assertEquals(expResult, result,0.0);
        
        System.out.println("Boundary test #1");
        mass = 1;
        vel = 1;
        speed = 1;
        instance = new Weapon();
        expResult = 0.2248;
        result = instance.monsterEquation(mass, vel, speed);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Boundary test #2");
        mass = 12;
        vel = 12;
        speed = 12;
        instance = new Weapon();
        expResult = 2.6976;
        result = instance.monsterEquation(mass, vel, speed);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
