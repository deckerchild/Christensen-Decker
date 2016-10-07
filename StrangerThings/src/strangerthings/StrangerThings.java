/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strangerthings;

import byui.cit260.strangerthings.model.Game;
import byui.cit260.strangerthings.model.Inventory;
import byui.cit260.strangerthings.model.Location;
import byui.cit260.strangerthings.model.Map;
import byui.cit260.strangerthings.model.Player;
import byui.cit260.strangerthings.model.Scene;
import byui.cit260.strangerthings.model.Weapon;
import byui.cit260.strangerthings.model.Character;

/**
 *
 * @author mount
 */
public class StrangerThings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map map1 = new Map();
        map1.setColumn("u5");
        map1.setRow(5);
        System.out.println(map1);
        
        Weapon wep1 = new Weapon();
        wep1.setItemNumber(25);
        wep1.setName("Billy Club");
        System.out.println(wep1);
        
        Inventory inven1 = new Inventory();
        inven1.setAmount(200);
        inven1.setInventoryType("tool");
        System.out.println(inven1);
        
        Game gameOne = new Game();
        gameOne.setNumPlayers(3);
        gameOne.setTotalTime(2.53);
        System.out.println(gameOne);
        
        Location loc1 = new Location();
        loc1.setColumn("u6");
        loc1.setItems("Tommy Knocker");
        loc1.setRow(5);
        loc1.setVisited(true);
        System.out.println(loc1);
        
        Player playerOne = new Player();
        playerOne.setName("Fred Flintstone");
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Character character1 = new Character();
        character1.setName("Mark Decker");
        character1.setCorrdinates(50);
        character1.setPower(12);
        
        String characterInfo = character1.toString();
        System.out.println(characterInfo);
        
        Scene play = new Scene();
        play.setDescription("This is a dark and lonely world.");
        play.setBlockedMonster("The monster is blocked");
        play.setDisplaySymbol("(-)");
        
        String playDebug = play.toString();
        System.out.println(playDebug);
        
        
        
        
        
    }
    
}
