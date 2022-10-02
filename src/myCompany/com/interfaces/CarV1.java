/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myCompany.com.interfaces;

/**
 *
 * @author faridPC
 */
public class CarV1 implements ISelfDrivable,Movable{
    int x,y;
    int numberOfPassenger;

    public CarV1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void Destinqtion(String Des) {
        System.out.println("Destination:"+Des);
    }

    @Override
    public void drive() {
        System.out.println("Drive");
    }

    @Override
    public void moveUP() {
      y--;
    }

    @Override
    public void moveDown() {
       y++;
    }

    @Override
    public void moveLeft() {
       x--;
    }

    @Override
    public void moveRight() {
       x++;
    }
    
    
    
}
