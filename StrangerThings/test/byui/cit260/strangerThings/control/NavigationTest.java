/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerThings.control;

import byui.cit260.strangerThings.control.NavigationControl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mount
 */
public class NavigationTest {
    
    public NavigationTest() {
    }

    /**
     * Test of shackCalculation method, of class NavigationControl.
     */
    @Test
    public void testShackCalculation() {
        System.out.println("Test Case #1");
        int x = 12;
        int i = 24;
        int answer = 8;
        NavigationControl instance = new NavigationControl();
        int expResult = 1;
        int result = instance.shackCalculation(x, i, answer);
        assertEquals(expResult, result);
    
        System.out.println("Test Case #2");
        x = 12;
        i = -1;
        answer = 3;
        instance = new NavigationControl();
        expResult = -1;
        result = instance.shackCalculation(x, i, answer);
        assertEquals(expResult, result);
        
        System.out.println("Test Case #3");
        x = -1;
        i = 24;
        answer = 3;
        instance = new NavigationControl();
        expResult = -1;
        result = instance.shackCalculation(x, i, answer);
        assertEquals(expResult, result);
        
        System.out.println("Test Case #4");
        x = 0;
        i = 0;
        answer = 0;
        instance = new NavigationControl();
        expResult = -1;
        result = instance.shackCalculation(x, i, answer);
        assertEquals(expResult, result);
        
    }
    
}
