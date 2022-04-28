/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCompany.com.Polymorphisme.Overriding_pack;

/**
 *
 * @author faridPC
 * getPrice Only Action by diferent ways
 */
public class Android extends Mobile{
    
    public Android(String OS, String Mode, float Price) {
        super(OS, Mode, Price);
    }

    @Override
    public void setPrice(float Price) {
        super.setPrice(Price); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMode(String Mode) {
        super.setMode(Mode); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setOS(String OS) {
        super.setOS(OS); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getPrice() {
        return super.getPrice() -5 ; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMode() {
        return super.getMode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getOS() {
        return super.getOS(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
