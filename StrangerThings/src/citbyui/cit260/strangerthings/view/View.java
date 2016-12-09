/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.strangerthings.view;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import strangerthings.StrangerThings;

/**
 *
 * @author tcfat
 */
public abstract class View implements ViewInterface {
    private String displayMessage;
    
    protected final BufferedReader keyboard = StrangerThings.getInFile();
    protected final PrintWriter console = StrangerThings.getOutFile();
    
    public View() {
    }
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override
    public void display(){
        
       boolean done = false; // set flag to not done
        do{
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))
                return; // exit the game
            // do the requested action and display the next veiw
            done = this.doAction(value);
            
        }while (!done);
    }
    @Override
    public  String getInput()
                      {
        String value = ""; // value to be returned
        boolean valid = false; // intialized to not valid
        
        while (!valid){ // loop while an invalide value is entered
            this.console.println("\n" + this.displayMessage);
            
            try {
                value = keyboard.readLine(); // get next line typed on the keyboard
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim(); // trim off leading and trailing blanks
            
            if(value.length() < 1){ // value is blank
                ErrorView.display(this.getClass().getName(), "You must enter a value.");
                continue;
                
            }
            
            break; // end loop
                   
        }
        return value; // return the value entered
    }
}
