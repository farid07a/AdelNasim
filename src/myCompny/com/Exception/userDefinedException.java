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
public class userDefinedException {

    public userDefinedException() {
    }
    
    void DefinedMethodToThrowMyException(int x) throws MyException{
        if (x>=0) {
            throw new MyException("Must Number To Greather than Zero");
        }
    
    }
    
    public static void main(String[] args) {
        
    }
}
