/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.strangerthings.view;


import byui.cit260.strangerThings.control.Event;
import byui.cit260.strangerThings.control.Weapon;
import java.util.Scanner;

/**
 *
 * @author tcfat
 */
class PlayerOption {
    private String optionMenu;

    void doSomething() {
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
    
    public PlayerOption()
    {
         this.optionMenu = "\n"
                  + "\n------------------------------------------"
                  +"\n Player Option Menu"
                  +"\n-------------------------------------------"
                  +"\n A - Attack the monster"
                  +"\n F - Flea from the monster"
                  +"\n Q - Quit"
                  +"\n-------------------------------------------"; 
    }

    public String getLoadMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // intialized to not valid
        
        while (!valid){ // loop while an invalide valur is entered
            System.out.println("\n" + this.optionMenu);
            
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
            case "A": // calls weapon class
                this.attack();
                break;
            case "F": // calls event class
                this.flee();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
                
        }
        return false;
    }

    private void attack() {
    Weapon weaponA = new Weapon();
    weaponA.monsterEquation(15, 10, 5);            
    }

    private void flee() {
        Event eventA = new Event();
        eventA.runCalculation(0, 10, 20);
    }
    
}
