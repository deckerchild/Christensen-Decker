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
import byui.cit260.strangerthings.model.Weapon;

/**
 *
 * @author mount
 */
public class StrangerThings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        Map map1 = new Map();
        Weapon wep1 = new Weapon();
        Inventory inven1 = new Inventory();
        Game gameone = new Game();
        Location loc1 = new Location();
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
