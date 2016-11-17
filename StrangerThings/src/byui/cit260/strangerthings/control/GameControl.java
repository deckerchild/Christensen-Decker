/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerThings.control;

import byui.cit260.strangerthings.model.Game;
import byui.cit260.strangerthings.model.Inventory;
import byui.cit260.strangerthings.model.Map;
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
      game.setWeapon(weapon);
      
      Map map = MapControl.createMap();
      game.setMap(map);
      
      MapControl.moveCharacterToStartingLocation(map);
      
      
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
        Inventory[] inventoryList = new Inventory[6];
        
        Inventory nails = new Inventory();
        nails.setDescription("Nails");
        nails.setQuantityInStock(0);
        nails.setRequiredAmount(0);
        inventoryList[0] = nails;
        
        Inventory barbedWire = new Inventory();
        barbedWire.setDescription("Barbed Wire");
        barbedWire.setQuantityInStock(0);
        barbedWire.setRequiredAmount(0);
        inventoryList[1] = barbedWire;
        
        
        Inventory glassShards = new Inventory();
        glassShards.setDescription("Glass Shards");
        glassShards.setQuantityInStock(0);
        glassShards.setRequiredAmount(0);
        inventoryList[2] = glassShards;
        
        Inventory thorns = new Inventory();
        thorns.setDescription("thorns");
        thorns.setQuantityInStock(0);
        thorns.setRequiredAmount(0);
        inventoryList[3] = thorns;
        
        Inventory rock = new Inventory();
        rock.setDescription("rock");
        rock.setQuantityInStock(0);
        rock.setRequiredAmount(0);
        inventoryList[4] = rock;
        
        Inventory sharpMetal = new Inventory();
        sharpMetal.setDescription("Sharpened Piece of Metal!");
        sharpMetal.setQuantityInStock(0);
        sharpMetal.setRequiredAmount(0);
        inventoryList[5] = sharpMetal;
        
        return inventoryList;
    }
}
