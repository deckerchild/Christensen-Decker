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
public class InGameMoveMenu extends View{
     
    public InGameMoveMenu() {
              super("\n"
                  + "\n------------------------------------------"
                  +"\n Move Menu"
                  +"\n-------------------------------------------"
                  +"\n N - To move North"
                  +"\n S - To move South"
                  +"\n E - To move East"
                  +"\n W - To move West"
                  +"\n Q - To go back to game menu"
                  +"\n-------------------------------------------"); 
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch(choice){
            case "N": // create and start a new game
                this.moveNorth();
                break;
            case "S": // retore an existing saved game
                this.moveSouth();
                break;
            case "E": // Displays a help menu
                this.moveEast();
                break;
            case "W": // saves the game 
                this.moveWest();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
                
        }
        return false;
    }

        private void moveNorth() {
        System.out.println("*** Moving North ***");
        }

        private void moveSouth() {
        System.out.println("*** Moving South ***");
        }

        private void moveEast() {
        System.out.println("*** Moving East ***");    
        }

        private void moveWest() {
        System.out.println("*** Moving West ***");    
        }
    
}
