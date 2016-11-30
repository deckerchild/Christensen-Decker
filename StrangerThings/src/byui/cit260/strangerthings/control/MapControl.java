/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerthings.control;

import byui.cit260.strangerthings.model.Character;
import byui.cit260.strangerthings.exceptions.MapControlException;
import byui.cit260.strangerthings.model.Location;
import byui.cit260.strangerthings.model.Map;
import byui.cit260.strangerthings.model.Scene;
import byui.cit260.strangerthings.model.SceneType;
import java.awt.Point;
import strangerthings.StrangerThings;

/**
 *
 * @author mount
 */
public class MapControl {

    public static Map createMap() {

        Map map = new Map(5, 5);

        Scene[] scenes = createScenes();

        MapControl.assignScenesLocations(map, scenes);

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
        startingScene.setDisplaySymbol(" ST ");
        startingScene.setBlockedMonster(0);
        scenes[SceneType.start.ordinal()] = startingScene;

        Scene finishScene = new Scene();
        finishScene.setDescription(
                "Congratulations! You have destroyed the monster and have survived the "
                + "upside down and have stayed away from the Government"
                + "you have one the game.");
        finishScene.setDisplaySymbol(" FN ");
        finishScene.setBlockedMonster(1);
        scenes[SceneType.finish.ordinal()] = finishScene;

        Scene nailScene = new Scene();
        nailScene.setDescription(
                "You have found some nails");
        nailScene.setDisplaySymbol(" NL ");
        nailScene.setBlockedMonster(0);
        scenes[SceneType.nails.ordinal()] = finishScene;

        Scene shackScene = new Scene();
        shackScene.setDescription(
                "You have arrived at the shack");
        shackScene.setDisplaySymbol(" SK ");
        shackScene.setBlockedMonster(0);
        scenes[SceneType.shack.ordinal()] = finishScene;

        Scene monsterScene = new Scene();
        monsterScene.setDescription(
                "You have found the monster");
        monsterScene.setDisplaySymbol(" MS ");
        monsterScene.setBlockedMonster(0);
        scenes[SceneType.monster.ordinal()] = finishScene;

        Scene governmentScene = new Scene();
        governmentScene.setDescription(
                "They found you");
        governmentScene.setDisplaySymbol(" GV ");
        governmentScene.setBlockedMonster(0);
        scenes[SceneType.government.ordinal()] = finishScene;

        Scene sherifScene = new Scene();
        sherifScene.setDescription(
                "He found you");
        sherifScene.setDisplaySymbol(" SH ");
        sherifScene.setBlockedMonster(0);
        scenes[SceneType.sherif.ordinal()] = finishScene;

        Scene upsideDownScene = new Scene();
        upsideDownScene.setDescription(
                "You found the upsid down enter if you dare");
        upsideDownScene.setDisplaySymbol(" UD ");
        upsideDownScene.setBlockedMonster(0);
        scenes[SceneType.upsideDown.ordinal()] = finishScene;

        Scene barbedWireScene = new Scene();
        barbedWireScene.setDescription(
                "You found some barbed wire for your weapon");
        barbedWireScene.setDisplaySymbol(" BW ");
        barbedWireScene.setBlockedMonster(0);
        scenes[SceneType.barbedWire.ordinal()] = finishScene;

        Scene glassShardsScene = new Scene();
        glassShardsScene.setDescription(
                "You found some glass shards for your weapon");
        glassShardsScene.setDisplaySymbol(" GS ");
        glassShardsScene.setBlockedMonster(0);
        scenes[SceneType.glassShards.ordinal()] = finishScene;

        Scene thornsScene = new Scene();
        thornsScene.setDescription(
                "You found some thorns for your weapon");
        thornsScene.setDisplaySymbol(" TH ");
        thornsScene.setBlockedMonster(0);
        scenes[SceneType.thorns.ordinal()] = finishScene;

        Scene rockScene = new Scene();
        rockScene.setDescription(
                "You found some rocks for your weapon");
        rockScene.setDisplaySymbol(" RK ");
        rockScene.setBlockedMonster(0);
        scenes[SceneType.rock.ordinal()] = finishScene;

        Scene sharpMetalScene = new Scene();
        sharpMetalScene.setDescription(
                "You found some peices of sharp metal for your weapon");
        sharpMetalScene.setDisplaySymbol(" SM ");
        sharpMetalScene.setBlockedMonster(0);
        scenes[SceneType.sharpMetal.ordinal()] = finishScene;

        return scenes;

    }
    
    

    public static void moveActorToLocation(Character character, Point corrdinates) 
                           throws MapControlException{
        Map map = StrangerThings.getCurrentGame().getMap();
        int newRow = corrdinates.x-1;
        int newColumn = corrdinates.y-1;
        
        if(newRow < 0 || newRow >= map.getNoOfRows() ||
                newColumn < 0 || newColumn >= map.getNoOfColumns()){
            throw new MapControlException("Can not move character to location");
        }
    }
    public static int moveActorsToStartingLocation(Map map)
                                throws MapControlException{
       
        Character[] characters = Character.values();
        
        for (Character character : characters){
        Point corrdinates = character.getCorrdinates();
        MapControl.moveActorToLocation(character, corrdinates);
        
        }
        
        return 0;
    }

    

    public void displayMap() {
        System.out.println("\n                 Map View");
        System.out.println("\n    1     2     3     4     5");
        System.out.println(" ------------------------------");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
            for (int j = 0; j <= 4; j++) {
                System.out.print("|");
                System.out.print(" ?? ");
                System.out.print("|");
            }
           System.out.println("\n ------------------------------");        
        }
    }

    private static void assignScenesLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

        //Starting point
        locations[0][0].setScene(scenes[SceneType.nails.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.sharpMetal.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.rock.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.thorns.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.glassShards.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.sharpMetal.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.rock.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.sherif.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.glassShards.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.government.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.thorns.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.upsideDown.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.nails.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.barbedWire.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.thorns.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.monster.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.barbedWire.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.sherif.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.government.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.barbedWire.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.shack.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.rock.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.nails.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.finish.ordinal()]);
    }
}
