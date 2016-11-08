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
public class MainMenuView extends View{
           
    

    public MainMenuView() {
             super("\n"
                  +"\n-------------------------------------------"
                  +"\n Main Menu"
                  +"\n-------------------------------------------"
                  +"\n N - New Game"
                  +"\n R - Load/Save Game"
                  +"\n H - Help menu"
                  +"\n Q - Exit game"
                  +"\n-------------------------------------------"); 
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch(value){
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "R": // brings up load/save menu
                this.startExistingGame();
                break;
            case "H": // Displays a help menu
                this.dispalyHelpMenu();
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
         gameMenu.display();
    }

    private void startExistingGame() {
        
        LoadMenuView loadMenu = new LoadMenuView();
        loadMenu.display();
    }

    private void dispalyHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    
    
}
