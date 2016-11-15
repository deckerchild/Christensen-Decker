/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerthings.model;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author mount
 */
public enum Character implements Serializable {
    
    Mike,
    Lucas,
    Dustin,
    Eleven;
    
    private final int corrdinates;
    private final int power;

     public Character() {
    }
    Character(int power){
        this.power = power; 
    }
    

    public int getCorrdinates() {
        return corrdinates;
    }


    public int getPower() {
        return power;
    }



    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", corrdinates=" + corrdinates + ", power=" + power + '}';
    }
    
    
    
    
}
