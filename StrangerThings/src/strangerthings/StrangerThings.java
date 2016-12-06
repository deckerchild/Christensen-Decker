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
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author mount
 */
public class StrangerThings {

    private static Game currentGame = null;
    private static Player player = null;
    private static BufferedReader inFile = null;
    private static PrintWriter outFile = null;
    
    private static PrintWriter logFile = null;
    
    public static void main(String[] args) {
        
        StartProgramView startProgram = null;
        try {
        StrangerThings.inFile = new BufferedReader(new InputStreamReader(System.in));
        StrangerThings.outFile = new PrintWriter(System.out, true);
        String logPath = "log.txt";
        StrangerThings.logFile = new PrintWriter(logPath);
        
        StartProgramView startProgramView = new StartProgramView();
        
        startProgramView.display();
    } catch (Throwable e) {
        System.out.println("Exception: " + e.toString() +
                           "\nCause: " + e.getCause() + 
                           "\nMessage: " + e.getMessage());
        e.printStackTrace();    
        
    } finally {
            try {
                if (StrangerThings.inFile != null) {
                    StrangerThings.inFile.close();
                }
                if (StrangerThings.outFile != null) {
                    StrangerThings.outFile.close();
                }
                if (StrangerThings.logFile != null) {
                    StrangerThings.logFile.close();
                }
            } catch (Throwable ex) {
                System.out.println("Error closing files");
            }
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
