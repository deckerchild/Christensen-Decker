/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strangerthings;

import byui.cit260.strangerthings.model.Game;
import byui.cit260.strangerthings.model.Player;
import citbyui.cit260.strangerthings.view.StartProgramView;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author mount
 */
public class StrangerThings {

    private static Game currentGame = null;
    private static Player player = null;
    private static BufferedReader inFile;
    private static PrintWriter outFile;
    
    private static PrintWriter logFile;
    
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
    
        public static Game getGame() {
        return currentGame;
    }

    public static void setGame(Game game) {
        StrangerThings.currentGame = game;
    }
    
        public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        StrangerThings.inFile = inFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        StrangerThings.outFile = outFile;
    }

       public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        StrangerThings.logFile = logFile;
    }
}
