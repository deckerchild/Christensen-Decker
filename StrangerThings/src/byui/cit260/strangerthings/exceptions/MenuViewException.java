/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.strangerthings.exceptions;

/**
 *
 * @author mount
 */
public class MenuViewException extends Exception{

    public MenuViewException() {
    }

    public MenuViewException(String message) {
        super(message);
    }

    public MenuViewException(String message, Throwable cause) {
        super(message, cause);
    }

    public MenuViewException(Throwable cause) {
        super(cause);
    }

    public MenuViewException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
