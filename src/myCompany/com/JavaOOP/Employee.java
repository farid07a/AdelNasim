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
public class Employee {
    protected String Name;
    private String AdresEmail;
    private String Phone;
    private String Deparetement;
    private String Adress;
    private float Salary;
    
    private int year;
    
    protected int x=10;

    public Employee(String Name, String AdresEmail, String Phone, String Deparetement, String Adress, int year,float Salary) {
        this.Name = Name;
        this.AdresEmail = AdresEmail;
        this.Phone = Phone;
        this.Deparetement = Deparetement;
        this.Adress = Adress;
        this.year = year;
        this.Salary=Salary;
    }

    public Employee() {
        System.out.println("Default Constructor Employee");
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAdresEmail(String AdresEmail) {
        this.AdresEmail = AdresEmail;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setDeparetement(String Deparetement) {
        this.Deparetement = Deparetement;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return Name;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public String getAdresEmail() {
        return AdresEmail;
    }

    public String getPhone() {
        return Phone;
    }

    public String getDeparetement() {
        return Deparetement;
    }

    public String getAdress() {
        return Adress;
    }

    public int getYear() {
        return year;
    }

    /**
     * @return the Salary
     */
    public float getSalary() {
        return Salary;
    }

    /**
     * @param Salary the Salary to set
     */
    public void setSalary(float Salary) {
        this.Salary = Salary;
    }
    
    
    
    
}
