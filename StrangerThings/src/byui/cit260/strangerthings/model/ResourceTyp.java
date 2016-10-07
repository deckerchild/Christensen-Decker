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
public class ResourceTyp implements Serializable {
    private int ammountAvailable;
    private String ResourceTyp;

    public ResourceTyp() {
    }
    
    

    public int getAmmountAvailable() {
        return ammountAvailable;
    }

    public void setAmmountAvailable(int ammountAvailable) {
        this.ammountAvailable = ammountAvailable;
    }

    public String getResourceTyp() {
        return ResourceTyp;
    }

    public void setResourceTyp(String ResourceTyp) {
        this.ResourceTyp = ResourceTyp;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.ammountAvailable;
        hash = 23 * hash + Objects.hashCode(this.ResourceTyp);
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
        final ResourceTyp other = (ResourceTyp) obj;
        if (this.ammountAvailable != other.ammountAvailable) {
            return false;
        }
        if (!Objects.equals(this.ResourceTyp, other.ResourceTyp)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ResourceTyp{" + "ammountAvailable=" + ammountAvailable + ", ResourceTyp=" + ResourceTyp + '}';
    }
    
    
    
}
