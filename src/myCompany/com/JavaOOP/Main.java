/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCompany.com.JavaOOP;

/**
 *
 * @author farid
 */
public class Main {
    public static void main(String[] args) {
        Developer d1=new Developer();// call defaul constructor(no paremter constrctor) of super class when no constructor in subclass
                                     // when subClass has (No PAREMETER CONSTRUCTOR) Call Const of Super Class then SubClass Constr 
        d1.setName("farid");// access Modifiers is default access modifier (Private Package) can access to attributs
        System.out.println(d1.getName());
       /***************************/
        
       MobileDeveloper MbDev=new MobileDeveloper();// run MobileDevelo Call SuperClass 
                                                    //  No Parametre Constructor Employe
                                                    // Next No Pare Const Developer
                                                    // Next No Pare Const MobileDeveloper
    }
}
