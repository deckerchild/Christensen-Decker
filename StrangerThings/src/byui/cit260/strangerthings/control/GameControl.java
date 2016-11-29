/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerThings.control;

import byui.cit260.strangerthings.control.MapControl;
import byui.cit260.strangerthings.model.Game;
import byui.cit260.strangerthings.model.Inventory;
import byui.cit260.strangerthings.model.Item;
import byui.cit260.strangerthings.model.Location;
import byui.cit260.strangerthings.model.Map;
import byui.cit260.strangerthings.model.Player;
import byui.cit260.strangerthings.model.Weapon;
import java.awt.Point;
import java.util.ArrayList;
import strangerthings.StrangerThings;

/**
 *
 * @author tcfat
 */
public class GameControl {
  public static void createNewGame(Player player){
      
      Location locationR = new Location();
      locationR.getRow();
      
      Location locationC = new Location();
      locationC.getColumn();
      
      Game game = new Game();
      StrangerThings.setCurrentGame(game);
       
      game.setPlayer(player);
      
      ArrayList<Inventory> inventoryList = new ArrayList<>();
      game.setInventoryList(inventoryList);
     
      Weapon weapon = new Weapon();
      game.setWeapon(weapon);
      
      Map map = MapControl.createMap();
      game.setMap(map);
      Point pointLocation = new Point();
      
      
      //MapControl.moveActorsToStartingLocation(player, corrdinates);
      
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
        inventoryList[Item.nails.ordinal()] = nails;
        
        Inventory barbedWire = new Inventory();
        barbedWire.setDescription("Barbed Wire");
        barbedWire.setQuantityInStock(0);
        barbedWire.setRequiredAmount(0);
        inventoryList[Item.barbedWire.ordinal()] = barbedWire;
        
        
        Inventory glassShards = new Inventory();
        glassShards.setDescription("Glass Shards");
        glassShards.setQuantityInStock(0);
        glassShards.setRequiredAmount(0);
        inventoryList[Item.glassShards.ordinal()] = glassShards;
        
        Inventory thorns = new Inventory();
        thorns.setDescription("thorns");
        thorns.setQuantityInStock(0);
        thorns.setRequiredAmount(0);
        inventoryList[Item.thorns.ordinal()] = thorns;
        
        Inventory rock = new Inventory();
        rock.setDescription("rock");
        rock.setQuantityInStock(0);
        rock.setRequiredAmount(0);
        inventoryList[Item.rock.ordinal()] = rock;
        
        Inventory sharpMetal = new Inventory();
        sharpMetal.setDescription("Sharpened Piece of Metal!");
        sharpMetal.setQuantityInStock(0);
        sharpMetal.setRequiredAmount(0);
        inventoryList[Item.sharpMetal.ordinal()] = sharpMetal;
        
        return inventoryList;
    }
    
    
}
