/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerthings.model;
import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author mount
 */
public enum Character implements Serializable {
    
    Mike("This is Mike"),
    Lucas("This is Lucas"),
    Dustin("This is Dustin"),
    Eleven("This is Eleven");
    
    private final Point corrdinates;
    private final String description;
    private Game game;
    private Location location;
   

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Location getLocation() {
        return location;
    }

    
    

    public void setLocation(Location location) {
        this.location = location;
    }

    Character(String description) {
        this.description = description;
        corrdinates = new Point(1,1);
        
        
    }

    public Point getCorrdinates() {
        return corrdinates;
    }

    public String getDescription() {
        return description;
    }

}
