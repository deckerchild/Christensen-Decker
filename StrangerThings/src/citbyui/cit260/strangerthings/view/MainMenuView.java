/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.strangerthings.view;

import java.util.Scanner;
import strangerthings.StrangerThings;
import citbyui.cit260.strangerthings.view.HelpMenuView;

/**
 *
 * @author mount
 */
class MainMenuView {
    private String menu;

    public void displayMainMenuView() {
           
        boolean done = false; // set flag to not done
        do{
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("E"))
                return; // exit the game
            // do the requested action and display the next veiw
            done = this.doAction(menuOption);
            
        }while (!done);
    }

    public MainMenuView() {
        this.menu = "\n"
                  + "\n------------------------------------------"
                  +"\n Main Menu"
                  +"\n-------------------------------------------"
                  +"\n N - New Game"
                  +"\n R - Restore Existing Game"
                  +"\n H - Help menu"
                  +"\n S - Save Game"
                  +"\n E - Exit game"
                  +"\n-------------------------------------------"; 
    }

    private String getMenuOption() {
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
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "R": // retore an existing saved game
                this.startExistingGame();
                break;
            case "H": // Displays a help menu
                this.dispalyHelpMenu();
                break;
            case "S": // saves the game 
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
                
        }
        return false;
    }

    private void startNewGame() {
                 // Create a new game
        GameControl.createNewGame(StrangerThings.getPlayer());
    
         // display the game menu
         GameMenuView gameMenu = new GameMenuView();
         gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void dispalyHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    
}
