/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCompany.com.Polymorphisme.Overriding_pack;

/**
 *
 * @author faridPC
 */
public class IOS extends Mobile{
   
    public IOS(String OS, String Mode, float Price) {
        super(OS, Mode, Price);
    }

    public float getPrice() {
        return Price-10;
    }
   

    
    
}
