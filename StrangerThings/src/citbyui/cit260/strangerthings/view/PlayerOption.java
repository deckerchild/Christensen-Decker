/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.strangerthings.view;


import byui.cit260.strangerthings.control.Event;
import byui.cit260.strangerthings.control.Weapon;
import java.util.Scanner;

/**
 *
 * @author tcfat
 */
public class PlayerOption extends View{
    
    public PlayerOption()
    {
              super("\n"
                  + "\n------------------------------------------"
                  +"\n Player Option Menu"
                  +"\n-------------------------------------------"
                  +"\n A - Attack the monster"
                  +"\n F - Flee from the monster"
                  +"\n Q - Quit"
                  +"\n-------------------------------------------"); 
    }

    @Override
    public boolean doAction(String choice) {
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
        int mass = 15;
        String value = ""; // value to be returned
        double speed = 0;
        double hard = 0;
        String number = "";
        
        System.out.println("\nYou are attacking the monster your weapon has a mass "
                + "of "+ mass +" you need to choose how fast you swing it and how hard it is swung.");
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
            boolean valid = false; // intialized to not valid
        
        while (!valid){ // loop while an invalide value is entered
            System.out.println("\nPlease enter how long it takes for your weapon to hit the monster in seconds.");
            
            value = keyboard.nextLine(); // get next line typed on the keyboard
            value = value.trim(); // trim off leading and trailing blanks
            speed = Double.parseDouble(value);
            
            System.out.println("\nPlease enter how fast you will swing the weapon in meters per sec");
             
            number = keyboard.nextLine(); // get next line typed on the keyboard
            number = number.trim(); // trim off leading and trailing blanks
            hard = Double.parseDouble(number);
            
            if(value.length() < 1 || number.length() < 1){ // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            };
            
            break; // end loop
                   
        }
        
        Weapon weaponA = new Weapon();
        double ansewer = weaponA.monsterEquation(mass, speed, hard);
 
        if(ansewer > 60){
           System.out.println("Their is no humanly way to do this unless you are Captian America"
                   + "\nPlease try again");
        }
        else if(ansewer < 5){
                System.out.println("You are not that wimpy put some back into it lad"
                        + "\nPlease try again");
                }
        else{
        System.out.println(ansewer);
          }
        
        }

    private void flee() {
        Event eventA = new Event();
        int ansewer = eventA.runCalculation(0, 10, 20);
        System.out.println(ansewer);
    }
    
}
