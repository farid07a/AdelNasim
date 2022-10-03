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


public class ErrorsHandling {

    static void f(){  // infinite Recursion
        System.out.println("Error Handling");
        f();
    }

    public static void main(String[] args) {
            //Error Not good to use handling Error with try catch
            /***
             * But Handling the Error in code 
             * find the Problem in the code "Call Infinite Recursion make stackOverFlow"
             * Try Catch handling Problems in Exceptions
             */
        try {
                  f();
        } catch (Error e) {
            System.out.println(e);
        }
  
    }
}
