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
public class DailyEmployee extends myCompany.com.JavaOOP.Employee{

private float workDayPrice;
private int DailyRate;

    public DailyEmployee(float workDayPrice, int DailyRate, String Name, String AdresEmail, String Phone, String Deparetement, String Adress, int year, float Salary) {
        super(Name, AdresEmail, Phone, Deparetement, Adress, year, Salary);
        this.workDayPrice = workDayPrice;
        this.DailyRate = DailyRate;
    }

    @Override
    public float getSalary() {
        return DailyRate * workDayPrice;
    }

    



    
}
