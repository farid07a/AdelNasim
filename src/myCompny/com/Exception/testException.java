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
public class testException {
    
    public static void main(String[] args) {
        userDefinedException udEx=new userDefinedException();
        try {
            udEx.DefinedMethodToThrowMyException(5);
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
