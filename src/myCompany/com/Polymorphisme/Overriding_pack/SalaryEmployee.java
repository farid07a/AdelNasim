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
public class SalaryEmployee extends Employee{
    private float bouns;
    protected int x;
    /**
     *same name with parent Class Employe
     */
    
    public SalaryEmployee(float bouns, String Name, String AdresEmail, String Phone, String Deparetement, String Adress, int year, float Salary) {
        super(Name, AdresEmail, Phone, Deparetement, Adress, year, Salary);
        this.bouns = bouns;
    }

    public SalaryEmployee() {
    }
    
    public static void Printf(){
        System.out.println("Sub - Class");
    }
    
    public float getBouns() {
        return bouns;
    }

    @Override
    public void setSalary(float Salary) {
        super.setSalary(Salary); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getSalary() {
        return super.getSalary()+bouns; //To change body of generated methods, choose Tools | Templates.
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
    
    
    
}
