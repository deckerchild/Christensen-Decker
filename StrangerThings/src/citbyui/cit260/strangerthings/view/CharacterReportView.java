/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.strangerthings.view;

import byui.cit260.strangerThings.control.GameControl;
import byui.cit260.strangerthings.exceptions.GameControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tcfat
 */
public class CharacterReportView extends View {
    public CharacterReportView (){
        super("Please enter the file destination");
    }

    @Override
    public boolean doAction(String filePath) {
        try {
            GameControl.createCharacterList(filePath);
            return true;
        } catch (GameControlException ex) {
            Logger.getLogger(CharacterReportView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
