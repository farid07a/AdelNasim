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
public class FinalyBlockExample {
    public static void main(String[] args) {
        
        try {
            
            int a []=new int[5];
            
            System.out.println(a[1]);
            
            a[7]=10;
            
            
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);// Finaly Block Not be executed 
            /***
             * The Finaly block will not be executed if the program exits(either by calling System.exit())
             * Or by Causing a fatal error that causes the process to abort
             */
            
            return;
            
        }finally{
        
            System.out.println("Finaly Block");
            /***
             * Finaly use for closing Resource 
             * File Connection 
             */
        }
        
        
        
        System.out.println("Rest of code");
        
        
        int val = getName();// return 3 
        /***
         * Because Finaly Block Must to executed 
         */
    }
    
    
    static int getName (){
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        }finally {
            return 3;
        }
        
    }
}
