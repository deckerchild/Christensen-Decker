/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerThings.control;

import byui.cit260.strangerthings.control.MapControl;
import citbyui.cit260.strangerthings.view.ErrorView;
import byui.cit260.strangerthings.model.Game;
import byui.cit260.strangerthings.model.Inventory;
import byui.cit260.strangerthings.model.Item;
import byui.cit260.strangerthings.model.Location;
import byui.cit260.strangerthings.model.Map;
import byui.cit260.strangerthings.model.Player;
import byui.cit260.strangerthings.model.Weapon;
import byui.cit260.strangerthings.model.Character;
import java.awt.Point;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import static java.sql.DriverManager.println;
import java.util.Scanner;
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
      
      Inventory[] inventoryList = GameControl.createInventoryList();
      game.setInventoryList(inventoryList);
     
      Weapon weapon = new Weapon();
      game.setWeapon(weapon);
      
      Map map = MapControl.createMap();
      game.setMap(map);
      Point pointLocation = new Point();
      
      player.setLocation(map.getLocation(0, 3));
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
  
  public void createCharacterList(String outputLocation){
      
      Game game = new Game();
      
      try(PrintWriter out = new PrintWriter(outputLocation)){
          
      
      Character[] characterList = Character.values();
      
          out.println("\n\n                Character Report               ");
          out.printf("%n%-20s%10s%10s", "Description", "HealthMax", "HealthMin");
          out.printf("%n%-20s%10s%10s", "----------", "--------", "------");
      
      for (int i = 0; i < characterList.length; i++) {
          Character character = characterList[i];
          out.printf("%n%-20s%7d%13.2f", character.getDescription()
                                       , game.getHealth()
                                       , game.getMinHealth());
      }
      
      }catch (IOException ex){
          System.out.println("I/O Error: " + ex.getMessage());
      }
  }
  
  private void createInventoryReport(String outputLocation){
      
      try(PrintWriter out = new PrintWriter(outputLocation)){
      Inventory[] inventoryList = new Inventory[6];
      
          out.println("\n\n                Inventory Report               ");
          out.printf("%n%-20s%10s%10s", "Description", "Quantity", "Actual Quantity");
          out.printf("%n%-20s%10s%10s", "----------", "--------", "----------");
           
          for(int i = 0; i < 7; i++)
          {
              Inventory inventory = inventoryList[i];
              out.printf("%n%-20s%7d%13.2f", inventory.getDescription()
                                       , inventory.getRequiredAmount()
                                       , inventory.getQuantityInStock());
          }
          
      }catch(IOException ex){
                  System.out.println("I/O Error:" + ex.getMessage());
                  }
  }

    private static Inventory[] createInventoryList() {
        Inventory[] inventoryList = new Inventory[6];
        
        Inventory nails = new Inventory();
        nails.setDescription("Nails");
        nails.setQuantityInStock(1);
        nails.setRequiredAmount(10);
        inventoryList[Item.nails.ordinal()] = nails;
        
        Inventory barbedWire = new Inventory();
        barbedWire.setDescription("Barbed Wire");
        barbedWire.setQuantityInStock(5);
        barbedWire.setRequiredAmount(2);
        inventoryList[Item.barbedWire.ordinal()] = barbedWire;
        
        
        Inventory glassShards = new Inventory();
        glassShards.setDescription("Glass Shards");
        glassShards.setQuantityInStock(4);
        glassShards.setRequiredAmount(20);
        inventoryList[Item.glassShards.ordinal()] = glassShards;
        
        Inventory thorns = new Inventory();
        thorns.setDescription("thorns");
        thorns.setQuantityInStock(6);
        thorns.setRequiredAmount(100);
        inventoryList[Item.thorns.ordinal()] = thorns;
        
        Inventory rock = new Inventory();
        rock.setDescription("rock");
        rock.setQuantityInStock(50);
        rock.setRequiredAmount(50);
        inventoryList[Item.rock.ordinal()] = rock;
        
        Inventory sharpMetal = new Inventory();
        sharpMetal.setDescription("Sharpened Metal");
        sharpMetal.setQuantityInStock(2);
        sharpMetal.setRequiredAmount(2);
        inventoryList[Item.sharpMetal.ordinal()] = sharpMetal;
        
        return inventoryList;
    }
    
        public static void saveGame(String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(StrangerThings.getGame());
            
        } catch(FileNotFoundException fne ){
            ErrorView.display("ProgramControl", "Invalid File Name " + filePath);
        
        } catch(Exception e) {
            ErrorView.display("ProgramControl", e.getMessage());
            
        }
    }
    
    public static void loadGame(String filePath) {
        Game game = null;
        
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            game = (Game)ois.readObject();
            
            StrangerThings.setGame(game);
            StrangerThings.setPlayer(game.getPlayer());
        } catch (Exception e) {
            ErrorView.display("ProgramControl", e.getMessage());
        }
    }
    
    
}
