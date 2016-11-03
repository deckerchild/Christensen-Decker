/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.strangerThings.control;

import byui.cit260.strangerthings.control.Event;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mount
 */
public class EventTest {
    
    public EventTest() {
    }

    /**
     * Test of runCalculation method, of class Event.
     */
    @Test
    public void testRunCalculation() {
        System.out.println("test case #1");
        int startRun = 1;
        int finalRun = 12;
        int time = 12;
        Event instance = new Event();
        int expResult = 1;
        int result = instance.runCalculation(startRun, finalRun, time);
        assertEquals(expResult, result);
        
    
    
        System.out.println("test case #2");
        startRun = 2;
        finalRun = 24;
        time = 2;
        instance = new Event();
        expResult = 1;
        result = instance.runCalculation(startRun, finalRun, time);
        assertEquals(expResult, result);
        
        System.out.println("test case #3");
        startRun = 24;
        finalRun = 2;
        time = 1;
        instance = new Event();
        expResult = 1;
        result = instance.runCalculation(startRun, finalRun, time);
        assertEquals(expResult, result);
}

}