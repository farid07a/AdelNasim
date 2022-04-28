/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCompany.com.Polymorphisme.Overriding_pack;

/**
 *
 * @author faridPC
 * private_Package
 */
public class Mobile {
    String OS;
    String Mode;
    float   Price; 

    public Mobile(String OS, String Mode, float Price) {
        this.OS = OS;
        this.Mode = Mode;
        this.Price = Price;
    }

    public String getOS() {
        return OS;
    }

    public String getMode() {
        return Mode;
    }

    public float getPrice() {
        return Price;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }
    
}


