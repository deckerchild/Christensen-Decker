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
public class Character implements Serializable {
    private String name;
    private int corrdinates;
    private int power;

    public Character() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCorrdinates() {
        return corrdinates;
    }

    public void setCorrdinates(int corrdinates) {
        this.corrdinates = corrdinates;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + this.corrdinates;
        hash = 31 * hash + this.power;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Character other = (Character) obj;
        if (this.corrdinates != other.corrdinates) {
            return false;
        }
        if (this.power != other.power) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", corrdinates=" + corrdinates + ", power=" + power + '}';
    }
    
    
    
    
}
