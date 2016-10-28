/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.strangerthings.view;

import java.util.Scanner;
import strangerthings.StrangerThings;

/**
 *
 * @author tcfat
 */
public class HelpMenuView {
    private String menu;

    public void displayHelpMenuView() {
           
        boolean done = false; // set flag to not done
        do{
            // prompt for and get players name
            String menuOption = this.getHelpMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return; // exit the game
            // do the requested action and display the next veiw
            done = this.doAction(menuOption);
            
        }while (!done);
    }

    public HelpMenuView() {
        this.menu = "\n"
                  + "\n------------------------------------------"
                  +"\n Help Menu"
                  +"\n-------------------------------------------"
                  +"\n G - Goal of Game"
                  +"\n S - The backstory to stranger things"
                  +"\n M - How to move"
                  +"\n L - List of Inventory on map"
                  +"\n B - how to manufacture upgraded weapons"
                  +"\n Q - Quit"
                  +"\n-------------------------------------------"; 
    }

    public String getHelpMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // intialized to not valid
        
        while (!valid){ // loop while an invalide valur is entered
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine(); // get next line typed on the keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if(value.length() < 1){ // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end loop
                   
        }
        return value; // return the value entered
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch(choice){
            case "G": // create and start a new game
                this.printGoalGame();
                break;
            case "S": // retore an existing saved game
                this.printStory();
                break;
            case "M": // Displays a help menu
                this.printMoveHelp();
                break;
            case "L": // saves the game 
                this.printMapInventory();
                break;
            case "B": // saves the game 
                this.printManufacture();
                break;
            case "Q": // saves the game 
                this.quit();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
                
        }
        return false;
    }

    private void printGoalGame() {
        System.out.println("printGoalGame() was called");
    }

    private void printStory() {
        System.out.println("printStory() was called");
    }

    private void printMoveHelp() {
        System.out.println("printMoveHelp() was called");
    }

    private void printMapInventory() {
        System.out.println("printMapInventory() was called");
    }

    private void printManufacture() {
        System.out.println("printMenufacture() was called");
    }

    private void quit() {
        System.out.println("printQuit() was called");
    }

    
}

    

