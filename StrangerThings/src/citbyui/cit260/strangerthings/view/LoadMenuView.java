/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.strangerthings.view;

import byui.cit260.strangerThings.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author mount
 */
public class LoadMenuView extends View {

    public LoadMenuView() {
        super("\n"
                + "\n------------------------------------------"
                + "\n Load/Save Menu"
                + "\n-------------------------------------------"
                + "\n L - Load Game"
                + "\n S - Save Game"
                + "\n Q - Quit"
                + "\n-------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();

        switch (choice) {
            case "L": // create and start a new game
                this.loadGame();
                break;
            case "S": // retore an existing saved game
                this.saveGame();
                break;
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
                break;

        }
        return false;
    }

    private void loadGame() {
        
        this.console.println("Enter file name: ");
        try {
            String value = keyboard.readLine();
            value = value.trim();
            GameControl.loadGame(value);
            GameMenuView gmv = new GameMenuView();
            gmv.display();
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error on input");
        }
    }

    private void saveGame() {
        this.console.println("Enter file name: ");
        try {
            String value = keyboard.readLine();
            value = value.trim();
            GameControl.loadGame(value);
            GameMenuView gmv = new GameMenuView();
            gmv.display();
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error on input");
        }
    }
}
