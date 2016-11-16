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
 * @author tcfat
 */
public class Inventory implements Serializable{
    private String inventoryType;
    private int amount;
    
    private int nails = 0;
    private int barbedWire = 0;
    private int glassShards = 0;
    private int thorns = 0;
    private int rocks = 0;
    private int sharpMetal = 0;
    private Game game;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    private Weapon weapon;

    public Inventory() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.inventoryType);
        hash = 53 * hash + this.amount;
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
        final Inventory other = (Inventory) obj;
        if (this.amount != other.amount) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "inventoryType=" + inventoryType + ", amount=" + amount + '}';
    }

    
    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getNails() {
        return nails;
    }

    public void setNails(int nails) {
        this.nails = nails;
    }

    public int getBarbedWire() {
        return barbedWire;
    }

    public void setBarbedWire(int barbedWire) {
        this.barbedWire = barbedWire;
    }

    public int getGlassShards() {
        return glassShards;
    }

    public void setGlassShards(int glassShards) {
        this.glassShards = glassShards;
    }

    public int getThorns() {
        return thorns;
    }

    public void setThorns(int thorns) {
        this.thorns = thorns;
    }

    public int getRocks() {
        return rocks;
    }

    public void setRocks(int rocks) {
        this.rocks = rocks;
    }

    public int getSharpMetal() {
        return sharpMetal;
    }

    public void setSharpMetal(int sharpMetal) {
        this.sharpMetal = sharpMetal;
    }
}
