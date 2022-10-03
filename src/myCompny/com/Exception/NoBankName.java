/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCompny.com.Exception;

/**
 *
 * @author faridPC
 */
public class NoBankName {
    
    private double balence;
    
    public void Deposit (double amount) throws InvalidAmountException{
        
        if (amount<=0) {
            throw new InvalidAmountException("Is not Valid");
        }
        balence+=amount;
    }
    
    public double withdraw(int amount) throws InsufficientAmountException{
        if (balence<amount) {
            throw new InsufficientAmountException("Insufficients funds");
        }
        
        balence-=amount;
        return amount;
        
    
    }
    
}
