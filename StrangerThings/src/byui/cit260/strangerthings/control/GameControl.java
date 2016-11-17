/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerThings.control;

import byui.cit260.strangerthings.model.Game;
import byui.cit260.strangerthings.model.Inventory;
import byui.cit260.strangerthings.model.Item;
import byui.cit260.strangerthings.model.Location;
import byui.cit260.strangerthings.model.Map;
import byui.cit260.strangerthings.model.Player;
import byui.cit260.strangerthings.model.Scene;
import byui.cit260.strangerthings.model.SceneType;
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
      
      ArrayList<Inventory> inventoryList = new ArrayList<>();
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
    
    private static void assignScenesLocations(Map map, Scene[] scenes){
            Location[][] locations = map.getLocations();
            
            //Starting point
            locations[0][0].setScene(scenes[SceneType.nails.ordinal()]);
            locations[0][1].setScene(scenes[SceneType.sharpMetal.ordinal()]);
            locations[0][2].setScene(scenes[SceneType.start.ordinal()]);
            locations[0][3].setScene(scenes[SceneType.rock.ordinal()]);
            locations[0][4].setScene(scenes[SceneType.thorns.ordinal()]);
            locations[1][0].setScene(scenes[SceneType.glassShards.ordinal()]);
            locations[1][1].setScene(scenes[SceneType.sharpMetal.ordinal()]);
            locations[1][2].setScene(scenes[SceneType.rock.ordinal()]);
            locations[1][3].setScene(scenes[SceneType.sherif.ordinal()]);
            locations[1][4].setScene(scenes[SceneType.glassShards.ordinal()]);
            locations[2][0].setScene(scenes[SceneType.government.ordinal()]);
            locations[2][1].setScene(scenes[SceneType.thorns.ordinal()]);
            locations[2][2].setScene(scenes[SceneType.upsideDown.ordinal()]);
            locations[2][3].setScene(scenes[SceneType.nails.ordinal()]);
            locations[2][4].setScene(scenes[SceneType.barbedWire.ordinal()]);
            locations[3][0].setScene(scenes[SceneType.thorns.ordinal()]);
            locations[3][1].setScene(scenes[SceneType.monster.ordinal()]);
            locations[3][2].setScene(scenes[SceneType.barbedWire.ordinal()]);
            locations[3][3].setScene(scenes[SceneType.sherif.ordinal()]);
            locations[3][4].setScene(scenes[SceneType.government.ordinal()]);
            locations[4][0].setScene(scenes[SceneType.barbedWire.ordinal()]);
            locations[4][1].setScene(scenes[SceneType.shack.ordinal()]);
            locations[4][2].setScene(scenes[SceneType.rock.ordinal()]);
            locations[4][3].setScene(scenes[SceneType.nails.ordinal()]);
            locations[4][4].setScene(scenes[SceneType.finish.ordinal()]);
    }
}
