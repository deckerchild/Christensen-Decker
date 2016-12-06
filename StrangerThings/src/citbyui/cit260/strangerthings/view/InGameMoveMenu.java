/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.strangerthings.view;

import byui.cit260.strangerthings.control.MovementControl;
import byui.cit260.strangerthings.exceptions.MovementControlException;
import byui.cit260.strangerthings.model.Location;
import static java.lang.System.console;
import strangerthings.StrangerThings;

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
            case "M":
                this.viewMap();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
                
        }
        return false;
    }

private void moveNorth(){
        MovementControl mc = new MovementControl();
        try{
            mc.moveNorth(StrangerThings.getCurrentGame());
        }catch(MovementControlException me){
            this.console.println(me.getMessage());
        }
        Location playerLocation = StrangerThings.getCurrentGame().getPlayer().getLocation();
        System.out.println(
                "\n Your locations is " + playerLocation.getRow() + ", " + playerLocation.getColumn()
        );
    }
    
    private void moveEast(){
        MovementControl mc = new MovementControl();
        try{
           mc.moveEast(StrangerThings.getCurrentGame());
            
        
        }catch(MovementControlException me){
            this.console.println(me.getMessage());
        }
        Location playerLocation = StrangerThings.getCurrentGame().getPlayer().getLocation();
        System.out.println(
                "\n Your locations is " + playerLocation.getRow() + ", " + playerLocation.getColumn()
        );
    }
    
    private void moveSouth(){
        MovementControl mc = new MovementControl();
        try{
           mc.moveSouth(StrangerThings.getCurrentGame());
           
        }catch(MovementControlException me){
            this.console.println(me.getMessage());
        }
        Location playerLocation = StrangerThings.getCurrentGame().getPlayer().getLocation();
        System.out.println(
                "\n Your locations is " + playerLocation.getRow() + ", " + playerLocation.getColumn()
        );
    }
    
    private void moveWest(){
        MovementControl mc = new MovementControl();
            if(mc.moveWest(StrangerThings.getCurrentGame()) == false){
            System.out.println("You can't move West!");
        }
        Location playerLocation = StrangerThings.getCurrentGame().getPlayer().getLocation();
        System.out.println(
                "\n Your locations is " + playerLocation.getRow() + ", " + playerLocation.getColumn()
        );
    }
    
    private void viewMap(){            
        //System.out.println(StrangerThings.getCurrentGame().getMap().displayMap());
    }
       
}
