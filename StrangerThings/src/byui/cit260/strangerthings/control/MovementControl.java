/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerthings.control;

import byui.cit260.strangerthings.exceptions.MovementControlException;
import byui.cit260.strangerthings.model.Game;
import byui.cit260.strangerthings.model.Location;
import byui.cit260.strangerthings.model.Map;
import byui.cit260.strangerthings.model.Player;

/**
 *
 * @author tcfat
 */
public class MovementControl {
    
    
    public void moveNorth(Game game) 
                            throws MovementControlException{
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getRow() == 0) {
            throw new MovementControlException ("ERROR: You cannot move to a non existing row");
        }
        
        int currentCol = currentLocation.getColumn();
        int currentRow = currentLocation.getRow();
        int newRow = currentRow - 1;
        
        Location newLocation = map.getLocation(newRow, currentCol);
        player.setLocation(newLocation);
        
    }
    
    public void moveEast(Game game) 
                               throws MovementControlException{
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getColumn() == Map.NUM_COLS - 1) {
            throw new MovementControlException ("Error: You cannot move to a non existing row");
        }  
        player.setLocation(map.getLocation(currentLocation.getRow(), currentLocation.getColumn() + 1));
    
    }
    
    public void moveSouth(Game game) throws MovementControlException{
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getRow() == Map.NUM_ROWS - 1) {
            throw new MovementControlException("Error: You cannot move to a location outside of the map");
        }
        
        player.setLocation(map.getLocation(currentLocation.getRow() + 1, currentLocation.getColumn()));
        
    }
    
    public void moveWest(Game game) throws MovementControlException{
        
        Player player = game.getPlayer();
        Location currentLocation = player.getLocation();
        Map map = game.getMap();
        
        if(currentLocation.getColumn() == 0) {
            throw new MovementControlException("Error: You cannot move to a location outside of the map");
        }
        
        player.setLocation(map.getLocation(currentLocation.getRow() + 1, currentLocation.getColumn()));
        
    }
    
}
