/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerthings.control;


import byui.cit260.strangerthings.model.Map;
import byui.cit260.strangerthings.model.Scene;


/**
 *
 * @author mount
 */
public class MapControl{
    
    public static Map createMap(){
        
        Map map = new Map(5, 5);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Map moveActorsToStartingLocation(){
        System.out.println("*** moveActorsToStartingLocation() called");
        return null;
    }
    
}
