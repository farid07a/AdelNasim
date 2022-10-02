/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCompny.com.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author faridPC
 */

/***
 * 
 * @author faridPC
 * 1- Checked Exception(Compile-Time Exceptions ) :is an Exception that is checked notified by the compiler at the
 *      Compilation-Time,these are also called as compile time exceptions
 *      thes Exceptions cannot simply be ignored
 *      the programmer should take care of (handle) these exceptions
 * 2- Unchecked Exception(Runtime Exceptions) :is an Exception that occurs at the time execution
 *      these are alse called runtime Exceptions
 *      thes include programming Bugs
 *      such as logic errors or improper use of an API
 *      Runtime Exceptions are ignored at the time of compilation.
 *      classes =  RunTimeException ,Error,IOError,VirtualMachineError
 * 
 * 3- Errors 
 *      Represent serious and usually irrecoverable conditions like a library incompatibility-infinite recursion memory 
 *      leaks
 */


public class CheckedException {
    
    public static void main(String[] args) {
        try {
            FileReader file;
            file = new FileReader("G:\\D\\a.txt");
            
            
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(CheckedException.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        
        readFile("G:\\D\\a.txt");
    }
    
    
    static void readFile(String path)  {
        
        
            FileInputStream fin = null;
        try {
             fin=new FileInputStream("G:\\D\\a.txt");
        System.out.println("File Content");
            int r=0;
            while ((r=fin.read())!=-1){
               
                System.out.print((char)r);
            }
        } catch (FileNotFoundException  ex) {
            Logger.getLogger(CheckedException.class.getName()).log(Level.SEVERE, null, ex);
        }catch( IOException ex){
        
        }finally{
            if (fin!=null) {
                try {
                    fin.close();
                } catch (IOException ex) {
                    Logger.getLogger(CheckedException.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        // close in finaly bloc because fin is ressource must to closing by Finaly block
        }
    }
}
