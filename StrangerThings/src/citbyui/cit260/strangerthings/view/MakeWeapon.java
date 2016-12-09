/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.strangerthings.view;

/**
 *
 * @author mount
 */
public class MakeWeapon extends View {

    
    public MakeWeapon() {
             super("\n"
                  +"\n-------------------------------------------"
                  +"\n Make Weapon Menu"
                  +"\n-------------------------------------------"
                  +"\n Weapon Items"
                  +"\n-------------------------------------------"
                  +"\n Hockey Stick - 1"
                  +"\n Golf Club - 1"
                  +"\n Lacrosse Stick - 1"
                  +"\n Cricket Paddle - 1"
                  +"\n-------------------------------------------"
                  +"\n Weapons"
                  +"\n-------------------------------------------"
                  +"\n None"
                  +"\n Q - Back to Last Screen");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch(choice){
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
                break;
                
        }
        return false;
    }
    
}
