/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.strangerthings.view;


import byui.cit260.strangerthings.control.EventControl;
import byui.cit260.strangerthings.control.WeaponControl;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                this.console.println("\n*** Invalid Selection *** Try Again");
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
        
        this.console.println("\nYou are attacking the monster your weapon has a mass "
                + "of "+ mass +" you need to choose how fast you swing it and how hard it is swung.");
      
            boolean valid = false; // intialized to not valid
        
        while (!valid){ // loop while an invalide value is entered
            this.console.println("\nPlease enter how long it takes for your weapon to hit the monster in seconds.");
            
            try {
                value = keyboard.readLine(); // get next line typed on the keyboard
            } catch (IOException ex) {
                Logger.getLogger(PlayerOption.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim(); // trim off leading and trailing blanks
            speed = Double.parseDouble(value);
            
            this.console.println("\nPlease enter how fast you will swing the weapon in meters per sec");
             
            try {
                number = keyboard.readLine(); // get next line typed on the keyboard
            } catch (IOException ex) {
                Logger.getLogger(PlayerOption.class.getName()).log(Level.SEVERE, null, ex);
            }
            number = number.trim(); // trim off leading and trailing blanks
            hard = Double.parseDouble(number);
            
            if(value.length() < 1 || number.length() < 1){ // value is blank
                this.console.println("\nInvalid value: value can not be blank");
                continue;
            };
            
            break; // end loop
                   
        }
        
        WeaponControl weaponA = new WeaponControl();
        double ansewer = weaponA.monsterEquation(mass, speed, hard);
 
        if(ansewer > 60){
            ErrorView.display(this.getClass().getName(), "Their is no humanly way to do this unless you are Captian America"
                   + "\nPlease try again");
        }
        else if(ansewer < 5){
                ErrorView.display(this.getClass().getName(),"You are not that wimpy put some back into it lad"
                        + "\nPlease try again");
                }
        else{
        this.console.println(ansewer);
          }
        
        }

    private void flee() {
        EventControl eventA = new EventControl();
        int ansewer = eventA.runCalculation(0, 10, 20);
        this.console.println(ansewer);
    }
    
}
