/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerthings.control;

/**
 *
 * @author tcfat
 */
public class EventControl {
    public int runCalculation(int startRun, int finalRun, int time){
        int result = 0;
        
        int answer = ((startRun - finalRun)/time);
        if(answer <=1 || answer >= .5)
            result = 1;
        else
            result = 0;
        
        return result;
    }
}
