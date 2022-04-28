/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCompany.com.Polymorphisme.Overriding_pack;
import myCompany.com.JavaOOP.Employee;
/**
 *
 * @author faridPC
 */
public class HourlyEmployee extends Employee{
    
    private float workHourPrice;
    private int HourlyRate;

    public HourlyEmployee(float workHourPrice, int HourlyRate, String Name, String AdresEmail, String Phone, String Deparetement, String Adress, int year,float salary) {
        super(Name, AdresEmail, Phone, Deparetement, Adress, year, salary);
        this.workHourPrice = workHourPrice;
        this.HourlyRate = HourlyRate;
    }

    public float getWorkHourPrice() {
        return workHourPrice;
    }

    public void setWorkHourPrice(float workHourPrice) {
        this.workHourPrice = workHourPrice;
    }

    public void setHourlyRate(int HourlyRate) {
        this.HourlyRate = HourlyRate;
    }

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    public int getHourlyRate() {
        return HourlyRate;
    }

    /**
     *
     * @return
     */
    @Override
    public String getName() {
        return Name;
    }

    /**
     *
     * @return
     */
    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setSalary(float Salary) {
        
    }

    @Override
    public float getSalary() {
        return workHourPrice*HourlyRate;
    }
    
    
}
