/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.strangerthings.view;

import byui.cit260.strangerthings.model.Game;
import byui.cit260.strangerthings.model.Inventory;
import java.util.ArrayList;
import strangerthings.StrangerThings;

/**
 *
 * @author tcfat
 */
public class GameMenuView extends View{
    
    public GameMenuView() {
             super("\n"
                  + "\n------------------------------------------"
                  +"\n In Game Menu"
                  +"\n-------------------------------------------"
                  +"\n M - Move"
                  +"\n I - View list of items in Inventory"
                  +"\n V - View Map"
                  +"\n S - Save Game"
                  +"\n H - Help"
                  +"\n P - Player options"
                  +"\n Q - Quit"
                  +"\n W - Manufacture Weapon/Weapon Status"
                  +"\n L - Look for items"
                  +"\n-------------------------------------------"); 
    }

    @Override
    public boolean doAction(String choice) {
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
        moveInGame.display();
    }

    private void gameInventory() {
        StringBuilder line;
        
        Game game = StrangerThings.getCurrentGame();
        ArrayList<Inventory> inventory = game.getInventoryList();
        
        System.out.println("\n      LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                                           ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        System.out.println(line.toString());
        
        // for eah inventory item
        for (Inventory item : inventory) {
            line = new StringBuilder("                                       ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getRequiredAmount());
            line.insert(33, item.getQuantityInStock());
        
            // Display the line
            System.out.println(line.toString());
        }
    }

    private void mapView() {
        System.out.println("*** mapView function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void helpMenu() {
     HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();   
    }

    private void makeWeapon() {
        MakeWeapon mWeapon = new MakeWeapon();
        mWeapon.display();
    }

    private void lookForItem() {
        System.out.println("*** lookForItem function called ***");
    }  

    private void playerOption() {
        PlayerOption playerAction = new PlayerOption();
        playerAction.display();    
    }
}
