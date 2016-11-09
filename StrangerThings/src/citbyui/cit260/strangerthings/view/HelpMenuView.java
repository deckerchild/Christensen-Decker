/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.strangerthings.view;

/**
 *
 * @author tcfat
 */
public class HelpMenuView extends View {    

    public HelpMenuView() {
            super( "\n"
                  + "\n------------------------------------------"
                  +"\n Help Menu"
                  +"\n-------------------------------------------"
                  +"\n G - Goal of Game"
                  +"\n S - The backstory to stranger things"
                  +"\n M - How to move"
                  +"\n L - List of Inventory on map"
                  +"\n B - how to manufacture upgraded weapons"
                  +"\n Q - Quit"
                  +"\n-------------------------------------------"); 
    }

    @Override
    public boolean doAction(String choice) {
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
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
                
        }
        return false;
    }

    private void printGoalGame() {
        System.out.println("The three main characters are Mike, Dustin, and "
                         + "\nLucas are out on an Adventure because they lost "
                         + "\nEleven. They are out in the woods with the "
                         + "\nmonster,other creatures, and other obstacles such"
                         + "\nas government officials and the Sheriff. You will"
                         + "\nexplore the map seeking required items in order "
                         + "\nto destroy the monster while avoiding the Sheriff"
                         + "\nand the government. Using simple commandsyou will"
                         + "\nmoveyour characters in order to complete the "
                         + "\ntasks that are needed to complete the game. Take"
                         + "\none wrong turn the game is OVER!");
    }

    private void printStory() {
        System.out.println("Stranger things is an American science "
                         + "\nfiction-horror web television series created by"
                         + "\nthe Duffer Brothers. The plot follows the "
                         + "\ndisappearance of a young boy, and a telekinetic "
                         + "\ngirl who helps his friends in their search, while"
                         + "\nthe boy's older brother, his mother, and the "
                         + "\ntown police chief start their own "
                         + "investigations");
    }

    private void printMoveHelp() {
        System.out.println("Characters will all be moving together one space "
                         + "\nat a time. You will us a grid pattern to move"
                         + "\nyou will be asked to move a direction of N for"
                         + "\nnorth, S for south E for east or W for west."
                         + "\nYou will only be able to move one square at a"
                         + "\ntime. Use the map to know the next location"
                         + "\n you wish to move.");
    }

    private void printMapInventory() {
        System.out.println("The list of inventory on the map shows you what "
                         + "\nitems you have on the map to make weapons but "
                         + "\ndoesn’t show you the location of these items "
                         + "\non the map.");
    }

    private void printManufacture() {
        System.out.println("Throughout the game, objects for making "
                         + "\nweapons will be at randomized places on the map. "
                         + "\nYou are to gather as many objects as possible "
                         + "\nwithout getting caught by the sheriff, government"
                         + "\nand monster. The more objects you have, the more "
                         + "\npowerful your weapon becomes.");
    }
    

    
}

    

