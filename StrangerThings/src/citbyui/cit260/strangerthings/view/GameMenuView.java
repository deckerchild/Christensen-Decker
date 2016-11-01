/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.strangerthings.view;

import java.util.Scanner;

/**
 *
 * @author tcfat
 */
public class GameMenuView {
       private String gameMenu;
    void displayGameMenu() {
           
        boolean done = false; // set flag to not done
        do{
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return; // exit the game
            // do the requested action and display the next veiw
            done = this.doAction(menuOption);
            
        }while (!done);
    }
    public GameMenuView() {
        this.gameMenu = "\n"
                  + "\n------------------------------------------"
                  +"\n New Game Menu"
                  +"\n-------------------------------------------"
                  +"\n M - Move"
                  +"\n I - Inventory"
                  +"\n V - View Map"
                  +"\n S - Save Game"
                  +"\n H - Help"
                  +"\n Q - Quit"
                  +"\n W - Manufacture Weapon"
                  +"\n L - Look for items"
                  +"\n T - View weapon status"
                  +"\n-------------------------------------------"; 
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // intialized to not valid
        
        while (!valid){ // loop while an invalide valur is entered
            System.out.println("\n" + this.gameMenu);
            
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
            case "M": // create and start a new game
                this.moveInGame();
                break;
            case "I": // retore an existing saved game
                this.gameInventory();
                break;
            case "V": // Displays a help menu
                this.mapView();
                break;
            case "S": // saves the game 
                this.saveGame();
                break;
            case "H": // saves the game 
                this.helpMenu();
                break;
            case "W": // saves the game 
                this.makeWeapon();
                break;
            case "L": // saves the game 
                this.lookForItem();
            case "T": // saves the game 
                this.weaponStatus();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
                
        }
        return false;
    }

    private void moveInGame() {
        InGameMoveMenu moveInGame = new InGameMoveMenu();
        moveInGame.displayMoveMenuView();
    }

    private void gameInventory() {
        System.out.println("*** GameInventory Called function called ***");
    }

    private void mapView() {
        System.out.println("*** mapView function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void helpMenu() {
     HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();   
    }

    private void makeWeapon() {
        System.out.println("*** makeWeapon function called ***");
    }

    private void lookForItem() {
        System.out.println("*** lookForItem function called ***");
    }

    private void weaponStatus() {
        System.out.println("*** weaponStatus function called ***");
    }

    
}
