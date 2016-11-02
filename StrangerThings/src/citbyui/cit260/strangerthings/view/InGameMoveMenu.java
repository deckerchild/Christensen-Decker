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
public class InGameMoveMenu {
        private String moveMenu;
    void displayMoveMenu() {
           
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
    public InGameMoveMenu() {
        this.moveMenu = "\n"
                  + "\n------------------------------------------"
                  +"\n Move Menu"
                  +"\n-------------------------------------------"
                  +"\n N - To move North"
                  +"\n S - To move South"
                  +"\n E - To move East"
                  +"\n W - To move West"
                  +"\n Q - To go back to game menu"
                  +"\n-------------------------------------------"; 
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // intialized to not valid
        
        while (!valid){ // loop while an invalide valur is entered
            System.out.println("\n" + this.moveMenu);
            
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
