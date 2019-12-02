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
public class Tester4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Owner ow = new Owner();
       
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        ow.pay(eBill);
        System.out.println("--------------------------------");
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        ow.pay(pEmp);
        System.out.println("---------------------------------");
        IntershipEmployee iEmp = new IntershipEmployee("Sunaryo", 5);
        ow.showMyEmployee(iEmp);
        System.out.println("---------------------------------");
        ow.showMyEmployee(iEmp);
        
        ow.pay(Emp);
    }
    
}
