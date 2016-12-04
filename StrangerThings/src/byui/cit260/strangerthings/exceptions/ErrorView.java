/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerthings.exceptions;

import java.io.PrintWriter;
import strangerthings.StrangerThings;

/**
 *
 * @author tcfat
 */
public class ErrorView {
       
    private static final PrintWriter errorFile = StrangerThings.getOutFile();
    private static final PrintWriter logFile = StrangerThings.getLogFile();
    
    public static void display(String className, String errorMsg) {
        errorFile.println("---------------------------" +
                "\nERROR: " + errorMsg +
                "\n---------------------------");
        
        logFile.println(className + " - " + errorMsg);
       
    }
}

