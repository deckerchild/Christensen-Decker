/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.strangerThings.control;

/**
 *
 * @author tcfat
 */
public class Weapon {
    
    public double monsterEquation(double mass, double speed, double metersPerSec){
        
        double force;
        double pounds;
        double number = .2248;
        
            force = (mass * (metersPerSec/speed)); 
            pounds = force * number;
        if(pounds<=0 || pounds>=14)
            return -1;
        else
            return pounds;
                             
        }
    
}