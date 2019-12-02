/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Besta
 */
public class IntershipEmployee extends Employee{
    private int length;
    
    public IntershipEmployee(String name, int length){
        this.length=length;
        this.name=name;
    }
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length=length;
    }
    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo()+"\n";
        info +="Register as internship employyee for " + length + " month\n";
        return info;
    }
}
