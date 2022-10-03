/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCompny.com.Exception;

import java.io.FileNotFoundException;

/**
 *
 * @author faridPC
 */
public class ThrowKeyWord {
    
    
    /***
     * The Throw KeyWord use when Create Custom Exception or error
     * The throw keyWord in java is used to explicity throw an exception
     * From method or any Block of code .We Can throw either checked or unchecked exception
     */

    public static void valiate(int n)   {
        /***
         * in case when probability of occurrence an Unchecked exception is optinal "throws ArithmiticException or Not throws "
         * Because the Compiler force you make try catch or throws Exception
         * 
         * Throws Uncheked Exception to Alert users 
         * 
         */
        
        if (n<=0) {
            System.out.println("the Number must be greater than Zero");
            //throw  new ArithmeticException();// throw Custom Exception 
            ArithmeticException ae=new ArithmeticException("the Number must be greater than Zero");
            throw ae;
            
        }else {
            System.out.println("The number Has been entred");
        }
        
    }

    
    public static void valiateCheckedException(int n) throws FileNotFoundException   {
        /***
         * in case when probability of occurrence an checked exception is Obligated to throws  Exception
         * Because the Compiler force you make try catch or throws Exception
         * 
         * Throws cheked Exception to Alert users 
         * 
         */
        
        if (n<=0) {
            System.out.println("the Number must be greater than Zero");
            //throw  new ArithmeticException();// throw Custom Exception 
            FileNotFoundException ae=new FileNotFoundException("the Number must be greater than Zero");
            throw ae;
            
        }else {
            System.out.println("The number Has been entred");
        }
        
    }
    
    public static void main(String[] args) {
        try {
            valiate(-1);
            // when pass - value the first Exception handling the Custom exception
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
   
        
    
    }
    
    
    
    /****
     * 1- Throw within a method or constructor   
     * 1- Throws with method or constructor Signature
     * 2- used to throw an exception explecity
     * 2- used to declare exceptions
     * 3- throw can only throw a single exception
     * 3-throws can declare multiple exceptions
     * 4- throw fllowed by throwable instance (new Exception)
     * 4- followed by an exception class name
     * 5-throw cannot be used to propagate checked exception by itself
     * 5- throws can be used to propagate checked exceptions by itself
     * 
     */
}
