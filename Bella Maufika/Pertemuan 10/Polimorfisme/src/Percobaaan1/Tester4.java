/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaaan1;

/**
 *
 * @author bella
 */
public class Tester4 {
      public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        ow.pay(eBill); // Pay for electricity bill
        System.out.println("-------------------------------");
        
        PermanenEmployee pEmp = new PermanenEmployee("Dedik", 500);
        ow.pay(pEmp); // Pay for permanent employee
        System.out.println("-------------------------------");
        
        IntershipEmployee iEmp = new IntershipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEmp); // show permanent employee info
        System.out.println("-------------------------------");
        ow.showMyEmployee(iEmp); // show internship employee info
    }
}
