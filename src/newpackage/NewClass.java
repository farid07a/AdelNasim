/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import sun.net.www.content.audio.x_aiff;

/**
 *
 * @author faridPC
 */
public class NewClass extends myCompany.com.JavaOOP.Employee{

    public NewClass() {
      //  x=20; when x in private package cannot access to this memeber
      // but when uses protected we cann access and modified
      
      x=26;// we access it when protected acces modifier
    }
 
    
    
}
