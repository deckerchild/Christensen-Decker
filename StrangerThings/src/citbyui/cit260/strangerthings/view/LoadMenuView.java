/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.strangerthings.view;

import java.util.Scanner;

/**
 *
 * @author mount
 */
public class LoadMenuView extends View{
    
    public LoadMenuView()
    {
              super("\n"
                  + "\n------------------------------------------"
                  +"\n Load/Save Menu"
                  +"\n-------------------------------------------"
                  +"\n L - Load Game"
                  +"\n S - Save Game"
                  +"\n Q - Quit"
                  +"\n-------------------------------------------"); 
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch(choice){
            case "L": // create and start a new game
                this.loadGame();
                break;
            case "S": // retore an existing saved game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
                
        }
        return false;
    }

    private void loadGame() {
        
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false;
        while (!valid){
            System.out.println("*** For debuging purposes, enter the following: C:\\Users\\mount\\OneDrive\\Fall 2016\\CIT 260");
            value = keyboard.nextLine(); // get next line typed on the keyboard
            value = value.trim(); // trim off leading and trailing blanks
            if(value.length() >= 1)
            {
                System.out.println("Loaded Successfully");
                valid = true;
            }
            }
        }
        
        
    

    private void saveGame() {
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false;
        while (!valid){
            System.out.println("*** For debuging purposes, enter the following: C:\\Users\\mount\\OneDrive\\Fall 2016\\CIT 260");
            value = keyboard.nextLine(); // get next line typed on the keyboard
            value = value.trim(); // trim off leading and trailing blanks
            if(value.length() >= 1)
            {
                System.out.println("Saved Successfully");
                valid = true;
            }
            }
    }
}
    
    
    

