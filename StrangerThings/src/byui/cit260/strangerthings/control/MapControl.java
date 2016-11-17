/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerthings.control;


import byui.cit260.strangerthings.model.Map;
import byui.cit260.strangerthings.model.Scene;
import byui.cit260.strangerthings.model.SceneType;


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
       Scene[] scenes = new Scene[SceneType.values().length];
       Scene startingScene = new Scene();
       startingScene.setDescription(
                 "You have started your journey to save Eleven from the Government"
               + "\nyou have the duty to find her and kill the monster"
               + "\nyou must find a weapon and add to it to defeat the"
               + "\nthe monster enjoy the journey");
       startingScene.setMapSymbol(" ST ");
       startingScene.setBlocked(false);
       startingScene.setTravelTime(240);
       scenes[SceneType.start.ordinal()] = startingScene;
       
       
       Scene finishScene = new Scene();
       finishScene.setDescription(
                  "Congratulations! You have destroyed the monster and have survived the "
                          + "upside down and have stayed away from the Government"
                          + "you have one the game.");
       finishScene.setMapSymbol(" FN ");
       finishScene.setBlocked(false);
       finishScene.setTravelTime(400);
       scenes[SceneType.finish.ordinal()] = finishScene;       
       
              Scene nailScene = new Scene();
       nailScene.setDescription(
                  "You have found some nails");
       nailScene.setMapSymbol(" NL ");
       nailScene.setBlocked(false);
       nailScene.setTravelTime(600);
       scenes[SceneType.nails.ordinal()] = finishScene;
       
       Scene shackScene = new Scene();
       shackScene.setDescription(
                  "You have arrived at the shack");
       shackScene.setMapSymbol(" SK ");
       shackScene.setBlocked(false);
       shackScene.setTravelTime(100);
       scenes[SceneType.shack.ordinal()] = finishScene;
       
       Scene monsterScene = new Scene();
       monsterScene.setDescription(
                  "You have found the monster");
       monsterScene.setMapSymbol(" MS ");
       monsterScene.setBlocked(false);
       monsterScene.setTravelTime(700);
       scenes[SceneType.monster.ordinal()] = finishScene;
       
       Scene governmentScene = new Scene();
       governmentScene.setDescription(
                  "They found you");
       governmentScene.setMapSymbol(" GV ");
       governmentScene.setBlocked(false);
       governmentScene.setTravelTime(700);
       scenes[SceneType.government.ordinal()] = finishScene;
       
       Scene sherifScene = new Scene();
       sherifScene.setDescription(
                  "He found you");
       sherifScene.setMapSymbol(" SH ");
       sherifScene.setBlocked(false);
       sherifScene.setTravelTime(700);
       scenes[SceneType.sherif.ordinal()] = finishScene;
       
       Scene upsideDownScene = new Scene();
       upsideDownScene.setDescription(
                  "You found the upsid down enter if you dare");
       upsideDownScene.setMapSymbol(" UD ");
       upsideDownScene.setBlocked(false);
       upsideDownScene.setTravelTime(900);
       scenes[SceneType.upsideDown.ordinal()] = finishScene;
       
       Scene barbedWireScene = new Scene();
       barbedWireScene.setDescription(
                  "You found some barbed wire for your weapon");
       barbedWireScene.setMapSymbol(" BW ");
       barbedWireScene.setBlocked(false);
       barbedWireScene.setTravelTime(200);
       scenes[SceneType.barbedWire.ordinal()] = finishScene;
       
       Scene glassShardsScene = new Scene();
       glassShardsScene.setDescription(
                  "You found some glass shards for your weapon");
       glassShardsScene.setMapSymbol(" GS ");
       glassShardsScene.setBlocked(false);
       glassShardsScene.setTravelTime(200);
       scenes[SceneType.glassShards.ordinal()] = finishScene;
       
       Scene thornsScene = new Scene();
       thornsScene.setDescription(
                  "You found some thorns for your weapon");
       thornsScene.setMapSymbol(" TH ");
       thornsScene.setBlocked(false);
       thornsScene.setTravelTime(200);
       scenes[SceneType.thorns.ordinal()] = finishScene;
       
       Scene rockScene = new Scene();
       rockScene.setDescription(
                  "You found some rocks for your weapon");
       rockScene.setMapSymbol(" RK ");
       rockScene.setBlocked(false);
       rockScene.setTravelTime(200);
       scenes[SceneType.rock.ordinal()] = finishScene;
       
       Scene sharpMetalScene = new Scene();
       sharpMetalScene.setDescription(
                  "You found some peices of sharp metal for your weapon");
       sharpMetalScene.setMapSymbol(" SM ");
       sharpMetalScene.setBlocked(false);
       sharpMetalScene.setTravelTime(200);
       scenes[SceneType.sharpMetal.ordinal()] = finishScene;
       
       return scenes;
       
    }
    
    public Map moveActorsToStartingLocation(){
        System.out.println("*** moveActorsToStartingLocation() called");
        return null;
    }
    
}
