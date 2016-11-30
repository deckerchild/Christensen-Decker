/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strangerthings;

import byui.cit260.strangerthings.model.Game;
import byui.cit260.strangerthings.model.Player;
import citbyui.cit260.strangerthings.view.StartProgramView;

/**
 *
 * @author mount
 */
public class StrangerThings {

    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        try {
        startProgramView.display();
        }catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
    }    
           
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        StrangerThings.currentGame = currentGame;
    }
    
    public static Player getPlayer() {
        return player;
    }
    
    public static void setPlayer(Player player){
        StrangerThings.player = player;
    }
    
    
}
