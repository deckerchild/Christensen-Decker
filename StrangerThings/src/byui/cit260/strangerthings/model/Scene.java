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
public class Scene implements Serializable {
    private String description;
    private int blockedMonster;
    private String displaySymbol;

    public Scene() {
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBlockedMonster() {
        return blockedMonster;
    }

    public void setBlockedMonster(int blockedMonster) {
        this.blockedMonster = blockedMonster;
    }

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.description);
        hash = 47 * hash + Objects.hashCode(this.blockedMonster);
        hash = 47 * hash + Objects.hashCode(this.displaySymbol);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.blockedMonster, other.blockedMonster)) {
            return false;
        }
        if (!Objects.equals(this.displaySymbol, other.displaySymbol)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", blockedMonster=" + blockedMonster + ", displaySymbol=" + displaySymbol + '}';
    }

}
