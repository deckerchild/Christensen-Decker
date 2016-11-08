/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.strangerthings.view;

import byui.cit260.strangerthings.model.Player;
import java.util.Scanner;

/**
 *
 * @author mount
 */
public class StartProgramView {
    
    private String promptMessage;

    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        //display the banner when the view is created
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
          "\n************************************************"
        + "\n*                                              *"
        + "\n*Stranger things is a text based role playing  *"
        + "\n*game from the events in the Netflix original  *"
        + "\n*series Stranger Things. You will be taking    *"
        + "\n*the role of 3 children named Mike, Lucas, and *"
        + "\n*Dustin. One of their friends went missing and *"
        + "\n*Mike, Lucas and Dustin suspect foul play.     *"
        + "\n*While investigating, they cross paths with    *"
        + "\n*another child named Eleven who has telekinesis*"
        + "\n*powers. She helps Mike, Lucas, and Dustin     *"
        + "\n*discover that their friend was taken by a     *"
        + "\n*monster! They should device a rescue plan to  *"
        + "\n*find a way to defeat the Monster while        *"
        + "\n*avoiding the government and the Sheriff.While *"
        + "\n*on your journey you lost Eleven but are still *"
        + "\n*looking for the required items to defeat the  *"
        + "\n*monster. If the government finds you then you *"
        + "\n*will be taken. If the local sheriff finds you *"
        + "\n*then he will send you home and your adventure *"
        + "\n*will be over! As you explore the map you will *"
        + "\n*search for the required items and build your  *"
        + "\n*master weapon. In this game, you will start   *"
        + "\n*your journey with a flashlight, a backpack,   *"
        + "\n*and a miniature shovel. You will move as a    *"
        + "\n*team to accomplish your goal of defeating the *"
        + "\n*monster. Throughout the map there will be     *"
        + "\n*items placed that you can find to make your   *"
        + "\n*master weapon. The route you take and the     *"
        + "\n*weapon you make is up to you.                 *"
        + "\n************************************************"
        );
    }
    /**
     * displays the start program veiw
     */
    public void displayStartProgramView() 
    {
        
        boolean done = false;// set flag to not done
        do{
            // prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // User wants to quit
                return; // exits game
            
            // do the requested action and dislay the next veiw
            done = this.doAction(playersName);
        }while (!done);
         
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in); // get the infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // intialized to not valid
        
        while (!valid){ // loop while an invalide valur is entered
            System.out.println("\n" + this.promptMessage);
            
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

    private boolean doAction(String playersName) {
        if(playersName.length() < 2){
            System.out.println("\nInvalid players name: "
            + "The name must be greatere than one character in length");
        return false;
        }
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if(player == null){ // if successful
            System.out.println("\nError creating the player.");
            return false;
        }
        
        // display next view
        this.displayNextView(player);
        
        return true; // Success!
    }

    private void displayNextView(Player player) {
        
        // display a custom welcom meassage
        System.out.println("\n==================================================="
                          +"\n Welcome to the game " + player.getName()
                          +"\n We hope you have a lot of fun!"
                          +"\n==================================================="
                          );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view        
        mainMenuView.display();        
    }
    
    

    
    
 
}
