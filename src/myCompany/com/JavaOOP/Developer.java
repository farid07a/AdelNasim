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
public class Developer extends Employee{
    String ProjectName;

    public Developer() {
        System.out.println("Sub Class Constructor");
        
    }

    public Developer(String Name) {
        // this.Name = Name; // Cannot access to SuperClass Field Name Because Private Access Modifiers
                          // Solve This Probles Is Change Access Modifiers Of Field SuperClass to Protected
                          
         /*******Change Name To Protected Access Mdf*****/
         this.Name=Name;
         
    }

    public Developer(String ProjectName, String Name, String AdresEmail, String Phone, String Deparetement, String Adress, int year) {
        super(Name, AdresEmail, Phone, Deparetement, Adress, year, year);// Call Constructor of SuperClass 
                                                                    // without Add code Manuly
                                                                    // super () call default constructor
        // Super is first Line in constructor child because the first uses is the parent class not SubClass
        // and respect the inheritence
        // and super use to call field and methode
        this.ProjectName = ProjectName;
    }

    public Developer(String name,String ProjectName){
        super.Name=name;
        this.ProjectName=ProjectName;
    }
    

    
    
    
    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }
    
}
