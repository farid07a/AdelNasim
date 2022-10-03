/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCompny.com.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author faridPC
 */
public class ClassLevel_UseException {
    
    public static void main(String[] args) {
       CheckedException chEx=new CheckedException();
        try {
            chEx.ReadFiles_With_Throws();// class handling The Exception throws
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClassLevel_UseException.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClassLevel_UseException.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
