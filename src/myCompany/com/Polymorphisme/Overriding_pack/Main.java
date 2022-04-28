/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCompany.com.Polymorphisme.Overriding_pack;

//import myCompany.com.JavaOOP.Employee;

/**
 *
 * @author faridPC
 */
public class Main {
    
    public static void main(String[] args) {
        Employee employe=new  Employee(" Name", "AdresEmail", "Phone", "Deparetement"," Adress", 1989, 100.0f);
        SalaryEmployee salEmp=new SalaryEmployee(200.0f, "salEmpName", "AdresEmail", "Phone", "Deparetement", "Adress", 1990, 200.0f);
        
        System.out.println("Employee salary :"+employe.getSalary());
        System.out.println("Employee salary :"+salEmp.getSalary());
        
        DailyEmployee dEmp=new DailyEmployee(30.0f, 30, " Name", "AdresEmail", "Phone", "Deparetement"," Adress", 1989, 0);
        
        HourlyEmployee hEmpl=new  HourlyEmployee(3, 150," Name", "AdresEmail", "Phone", "Deparetement"," Adress", 1989, 0);
        
        System.out.println("Daily Employee :"+dEmp.getSalary());
        System.out.println("Hourly Employee:"+hEmpl.getSalary());
        
        /**
         * and we can use parent class to create childs class
         * when we create overriding of methods the parent allows to use the method of child
         * by with UpCasting operation
         */
        Employee EmpParentForDailyEmploy =new DailyEmployee(30.0f, 30, " Name", "AdresEmail", "Phone", "Deparetement"," Adress", 1989, 0);
        System.out.println("Call Method getSalary() of class DailyEmployee:"+EmpParentForDailyEmploy.getSalary());
        
        
        Employee EmpParentForHourlyEmploy =new  HourlyEmployee(3, 150," Name", "AdresEmail", "Phone", "Deparetement"," Adress", 1989, 0);
        System.out.println("Call Method getSalary() of class HourlyEmployee:"+EmpParentForHourlyEmploy.getSalary());
        /**
         * FOR EXPLAIN Upcasting of Common methods between parent and classes 
         * we show below exmple about getBonus() os
         * public float getBouns() {
         * return bouns;
         * }
         * parent clss cannot access to this method wi upCasting
         * 
         * But when create GetBonus Method in parent class (Common method ) parent can access
         */
        Employee EmpParentForSalaryEmploy=new SalaryEmployee(200," Name", "AdresEmail", "Phone", "Deparetement"," Adress", 1989, 0);
        
        //EmpParentForSalaryEmploy.getbonus(); error cannot find getBonus()
        EmpParentForSalaryEmploy.x
        
        
        
    }
    
}
