/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCompny.com.Exception;

/**
 *
 * @author faridPC
 */
public class InsufficientAmountException  extends Exception{

    public InsufficientAmountException(String amount) {
        super(amount);
    }

    public InsufficientAmountException() {
        super();
    }
    
    
}
