/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.strangerthings.view;

import java.util.Scanner;

/**
 *
 * @author mount
 */
class LoadMenuView {
    private String loadMenu;

    void displayLoadMenu() {
       boolean done = false; // set flag to not done
        do{
            // prompt for and get players name
            String menuOption = this.getLoadMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return; // exit the game
            // do the requested action and display the next veiw
            done = this.doAction1(menuOption);
            
        }while (!done);
    }
    
    public LoadMenuView()
    {
         this.loadMenu = "\n"
                  + "\n------------------------------------------"
                  +"\n Load/Save Menu"
                  +"\n-------------------------------------------"
                  +"\n L - Load Game"
                  +"\n S - Save Game"
                  +"\n Q - Quit"
                  +"\n-------------------------------------------"; 
    }

    public String getLoadMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // intialized to not valid
        
        while (!valid){ // loop while an invalide valur is entered
            System.out.println("\n" + this.loadMenu);
            
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

    private boolean doAction1(String choice) {
        choice = choice.toUpperCase();
        
        switch(choice){
            case "L": // create and start a new game
                this.loadGame();
                break;
            case "S": // retore an existing saved game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
                
        }
        return false;
    }

    private void loadGame() {
        
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false;
        while (!valid){
            System.out.println("*** For debuging purposes, enter the following: C:\\Users\\mount\\OneDrive\\Fall 2016\\CIT 260");
            value = keyboard.nextLine(); // get next line typed on the keyboard
            value = value.trim(); // trim off leading and trailing blanks
            if(value.length() >= 1)
            {
                System.out.println("Loaded Successfully");
                valid = true;
            }
            }
        }
        
        
    

    private void saveGame() {
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false;
        while (!valid){
            System.out.println("*** For debuging purposes, enter the following: C:\\Users\\mount\\OneDrive\\Fall 2016\\CIT 260");
            value = keyboard.nextLine(); // get next line typed on the keyboard
            value = value.trim(); // trim off leading and trailing blanks
            if(value.length() >= 1)
            {
                System.out.println("Saved Successfully");
                valid = true;
            }
            }
    }
}
    
    
    

