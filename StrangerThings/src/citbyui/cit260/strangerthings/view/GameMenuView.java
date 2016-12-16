/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.strangerthings.view;

import byui.cit260.strangerThings.control.GameControl;
import byui.cit260.strangerthings.control.MapControl;
import byui.cit260.strangerthings.exceptions.GameControlException;
import byui.cit260.strangerthings.model.Game;
import byui.cit260.strangerthings.model.Inventory;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import strangerthings.StrangerThings;

/**
 *
 * @author tcfat
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n------------------------------------------"
                + "\n In Game Menu"
                + "\n-------------------------------------------"
                + "\n M - Move"
                + "\n I - View Inventory"
                + "\n R - Inventory Status Report"
                + "\n C - Character Status Report"
                + "\n V - View Map"
                + "\n S - Save Game"
                + "\n H - Help"
                + "\n P - Player options"
                + "\n Q - Quit"
                + "\n W - Manufacture Weapon/Weapon Status"
                + "\n L - Look for items"
                + "\n-------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();

        switch (choice) {
            case "M": // Move the game along
                this.moveInGame();
                break;
            case "I": // Checks the inventory
                this.gameInventory();
                break;
            case "R": {
                String outputLocation = "";
                try {
                    this.inventoryStatusReport(outputLocation);
                } catch (IOException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "C": {
            try {
                // Checks the inventory
                this.characterReport();
            } catch (GameControlException ex) {
                ErrorView.display(this.getClass().getName(), "Wrong choice");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
                this.console.println("\n*** Invalid Selection *** Try Again");
                break;

        }
        return false;
    }

    private void moveInGame() {
        InGameMoveMenu moveInGame = new InGameMoveMenu();
        moveInGame.display();
    }

    private void characterReport() throws GameControlException, FileNotFoundException{
        String outputLocation = "";
        this.console.print("Please enter report destination: ");
        try {
            outputLocation = keyboard.readLine();
        } catch (IOException ex) {
            this.console.println(ex.getMessage());
        }

        GameControl gameControl = new GameControl();
        gameControl.createCharacterList(outputLocation);
    }

    private void inventoryStatusReport(String outputLocation) throws IOException {
        this.console.print("Please enter report destination: ");
        outputLocation = keyboard.readLine();

        GameControl gameControl = new GameControl();
        gameControl.createInventoryReport(outputLocation);
    }

    private void gameInventory() {
        StringBuilder line;

        Game game = StrangerThings.getCurrentGame();
        Inventory[] inventory = game.getInventoryList();

        this.console.println("\n      LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                                           ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        this.console.println(line.toString());

        // for each inventory item
        for (Inventory item : inventory) {
            line = new StringBuilder("                                       ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getRequiredAmount());
            line.insert(33, item.getQuantityInStock());

            // Display the line
            this.console.println(line.toString());
        }
    }

    private void mapView() {
        MapControl display = new MapControl();
        display.displayMap(console);
    }

    private void saveGame() {
        LoadMenuView loadMenu = new LoadMenuView();
        loadMenu.display();
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
        this.console.println("*** lookForItem function called ***");
    }

    private void playerOption() {
        PlayerOption playerAction = new PlayerOption();
        playerAction.display();
    }

}
