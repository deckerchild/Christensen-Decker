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
public class Map implements Serializable{
    private int row;
    private int column;
    private Location[][] locations;
    private int noOfRows;
    private int noOfColumns;

    public Map(int noOfRows, int noOfColumns) {
        if (noOfRows < 1 || noOfColumns < 1){
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this. noOfColumns = noOfColumns;
        
        this.locations = new Location[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++){
            for(int column = 0; column < noOfColumns; column++){
                
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(true);
                
                locations[row][column] = location;
            }
        }
    }

    public int getRow() {
        return row;
    }

    public Map() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.row;
        hash = 47 * hash + Objects.hashCode(this.column);
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
        final Map other = (Map) obj;
        if (this.row != other.row) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "row=" + row + ", column=" + column + '}';
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Location[][] getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
