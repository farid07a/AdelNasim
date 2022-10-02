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
public class ExceptionExamples {

    public static void main(String[] args) {
        try {

            int[] arr = {12, 10, 5};
            
            arr[5]=7/0; // catch arithmitic exception the first
            
            arr = null;
            
            int x = 0;
            
            int y=x/0;
            
          
            int xx = Integer.parseInt("a");
            
            
              System.out.println(arr[5]); //
            System.out.println("After exception In try");

        } catch (NumberFormatException e) {
            System.out.println(e);

        }catch(ArithmeticException e){
        
            System.out.println("Arithmetic exception");
        }catch (Exception e) {
            System.out.println(e);
        }
        //e.printStackTrace()

        System.out.println("after exception");

        
       /*********************************Finaly Block*********************************/ 
       /***
        * Finaly Block in java can be used to put "Clean up" code
        * such as closing file , closing connection 
        * Finaly block is always get executed whether the exception has occurred or not
        * For each try block there can be zero or more Catch blocks, but only one finaly block
        */ 
       
       
    }
}
