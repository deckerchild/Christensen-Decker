/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.strangerthings.view;

import byui.cit260.strangerthings.model.Player;
import strangerthings.StrangerThings;

/**
 *
 * @author mount
 */
class GameControl {
    
    public static Player createPlayer(String name){
        if(name == null){
            return null;
        }
    
        Player player = new Player();
        player.setName(name);
        
        StrangerThings.setPlayer(player);
        
        return player;
   }
   
    
}
