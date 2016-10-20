/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.curiousworkmanship.control;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author tcfat
 */
public class Navigation {
    
    public int shackCalculation(int x, int i, int answer){
        int result;
        if(i<=0 || x<=0)
            result = -1;
        else if((((i/2)+x)/3) == answer)
                result = 1;
        else 
            result = 0;
        return result;
                             
        }


//Else 
//Result = 0
//Return result

}
    

