/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerThings.control;

import byui.cit260.strangerthings.model.Game;
import byui.cit260.strangerthings.model.Inventory;
import byui.cit260.strangerthings.model.Player;
import byui.cit260.strangerthings.model.Weapon;
import java.util.ArrayList;
import strangerthings.StrangerThings;

/**
 *
 * @author tcfat
 */
public class GameControl {
  public static void createNewGame(Player player){
      
      Game game = new Game();
      StrangerThings.setCurrentGame(game);
       
      game.setPlayer(player);
      
      ArrayList<Inventory> inventoryList = new ArrayList<Inventory>();
      game.setInventoryList(inventoryList);
      
      Weapon weapon = new Weapon();
      game.setWeapon(Weapon);
      
  }
  public static Player createPlayer(String name){
        if(name == null){
            return null;
        }
    
        Player player = new Player();
        player.setName(name);
        
        StrangerThings.setPlayer(player); //save the player
        
        return player;
   }

    private static Inventory[] createInventoryList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
