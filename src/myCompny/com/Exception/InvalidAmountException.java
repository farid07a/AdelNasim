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
public class InvalidAmountException extends Exception{

    InvalidAmountException(String insufficients_funds) {
       super(insufficients_funds);
    }

    public InvalidAmountException() {
        super();
    }
    
    
}
