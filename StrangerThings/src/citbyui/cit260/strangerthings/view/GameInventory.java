/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.strangerthings.view;

/**
 *
 * @author tcfat
 */
public class GameInventory extends View{

    public GameInventory() {
             super("\n"
                  +"\n-------------------------------------------"
                  +"\n Inventory View"
                  +"\n-------------------------------------------"
                  +"\n Nails - 5"
                  +"\n Barbed Wire - 6"
                  +"\n Glass Shards - 200"
                  +"\n Thorns - 50"
                  +"\n Rocks - 5"
                  +"\n Sharpened Piece of Metal - 6"
                  +"\n Q - Back to Last Screen"
                  +"\n-------------------------------------------"); 
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch(choice){
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
                
        }
        return false;
    }    
    
    
}
