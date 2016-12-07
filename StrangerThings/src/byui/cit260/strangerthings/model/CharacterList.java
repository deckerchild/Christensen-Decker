/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerthings.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author mount
 */
public class CharacterList implements Serializable{
    
    private final Point corrdinates;
    private final String description;
    private Game game;
    private Location location;
    private int health = 0;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Location getLocation() {
        return location;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    

    public void setLocation(Location location) {
        this.location = location;
    }

    CharacterList(String description) {
        this.description = description;
        corrdinates = new Point(1,1);
        
        
    }

    
    
}
