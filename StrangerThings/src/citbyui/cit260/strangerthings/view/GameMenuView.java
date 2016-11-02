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
                  +"\n In Game Menu"
                  +"\n-------------------------------------------"
                  +"\n M - Move"
                  +"\n I - Inventory"
                  +"\n V - View Map"
                  +"\n S - Save Game"
                  +"\n H - Help"
                  +"\n P - Player options"
                  +"\n Q - Quit"
                  +"\n W - Manufacture Weapon/Weapon Status"
                  +"\n L - Look for items"
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
            case "M": // Move the game along
                this.moveInGame();
                break;
            case "I": // Checks the inventory
                this.gameInventory();
                break;
            case "V": // Shows the map
                this.mapView();
                break;
            case "S": // saves the game 
                this.saveGame();
                break;
            case "H": // Shows the help menu 
                this.helpMenu();
                break;
            case "W": // Allows you to create a weapon 
                this.makeWeapon();
                break;
            case "P": // Allows you to create a weapon 
                this.playerOption();
                break;
            case "L": // Look for items on the location 
                this.lookForItem();
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
                
        }
        return false;
    }

    private void moveInGame() {
        InGameMoveMenu moveInGame = new InGameMoveMenu();
        moveInGame.displayMoveMenu();
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

    private void playerOption() {
        PlayerOption playerAction = new PlayerOption();
        playerAction.doSomething();    
    }
}
