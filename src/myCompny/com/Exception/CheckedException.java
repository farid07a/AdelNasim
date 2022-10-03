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
    
    /********Try With Ressources After Java 7 ***********************/
    
    void ReadFiles_By_Try_With_Ressource(){
        // Use My resource In try(My Resource 'Connection','File')
        //And Remove Finaly Block Because Closing Automaticaly in try
        
        try (FileInputStream fin=new FileInputStream("G:\\D\\a.txt") ){// any Instance IN Try Closing automaticaly 
                 // we can add many ressource in tray (Res1;Res2;......;ResN)       
             int r=0;
            while ((r=fin.read())!=-1){
               
                System.out.print((char)r);
                
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    
    void ReadFile(){
    
        try { // select Block try catch
            FileInputStream fin;
            
            fin=new FileInputStream("G:\\D\\a.txt");
            
            int r=0;
            try {// Statement try Catch
                while ((r=fin.read())!=-1){
                    
                    System.out.print((char)r);
                    
                }
            } catch (IOException ex) {
                Logger.getLogger(CheckedException.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CheckedException.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    /************Throws Exception*****************
     * This name by Exception Propagation(Exception Propagators)
     * this technic uses for experts handling exception 
     * in other levels in program not in same Method
     */
    void ReadFiles_With_Throws() throws FileNotFoundException, IOException{
    
        FileInputStream fin=new FileInputStream("G:\\D\\a.txt");// throws Exception for otther level or other class method
        int r;
        
        while((r=fin.read())!=-1)
            System.out.println((char)r);
   }
   
    void MethodUseException_OtherLevel(){
        try {
            ReadFiles_With_Throws();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CheckedException.class.getName()).log(Level.SEVERE, null, ex);

    }   catch (IOException ex) {
            Logger.getLogger(CheckedException.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
