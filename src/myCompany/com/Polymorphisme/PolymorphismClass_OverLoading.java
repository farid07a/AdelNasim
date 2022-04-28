/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCompany.com.Polymorphisme;

/**
 *
 * @author faridPC
 */
// We can acheive polymorphism in java using the following ways:

//1-Overloading
//1-2- this is compile time (Static polymorphisme or early binding)
//2-Overriding
//2-1- this is an example of runtime (Dynamic Method Dispatch or late binding)
/*
*Advantage of polymorphism
*more readability of programmers like orer(prm1) prm(2)
*not order1(prm1) order2(prm1,prm2)...
*Polymorphism: uses those methods to perform differents tasks.this allows us to perform a single action in differents Ways
*/


public class PolymorphismClass_OverLoading {
    
    
     static void order(float x){
         System.out.println("1 example for polymorphism");
    }
    
     static void order(float x , int delivry){
         System.out.println("2 example for polymorphism");
    }
     
     static float order(float cost, float cobon){
         System.out.println("3 example for polymorphism");
         
     return 10.5f;
     }
    
    
}
