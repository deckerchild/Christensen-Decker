/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerThings.control;

import byui.cit260.strangerthings.model.Game;
import byui.cit260.strangerthings.model.Player;
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
      
      InventoryItem[] inventoryList = GameControl.createInventoryList();
      game.setInventory(inventoryList);
      
      Weapon weapon = new Weapon();
      game.setWeapon(weapon);
      
      Map map = MapControl.createMap();
      game.setMap(map);
      
      MapControl.moveCharacterToStartingLocation(map);
      
  }
}
