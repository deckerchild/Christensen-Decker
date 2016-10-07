/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strangerthings;

import byui.cit260.strangerthings.model.Player;
import byui.cit260.strangerthings.model.Character;
import byui.cit260.strangerthings.model.Scene;
import byui.cit260.strangerthings.model.ResourceTyp;
import byui.cit260.strangerthings.model.Monster;



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
        
        ResourceTyp type = new ResourceTyp();
        type.setAmmountAvailable(5);
        type.setResourceTyp("Sulfer");
        
        String typeDebug = type.toString();
        System.out.println(typeDebug);
        
        Monster beast = new Monster();
        beast.setName("Voldemort");
        beast.setStrength(20);
        
        String beastDebug = beast.toString();
        System.out.println(beastDebug);
        
        
        
        
        
    }
    
}
