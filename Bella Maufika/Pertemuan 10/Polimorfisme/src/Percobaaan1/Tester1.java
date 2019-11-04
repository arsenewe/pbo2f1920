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
public class Tester1 {
 public static void main(String[] args) {
        PermanenEmployee pEmp = new PermanenEmployee("Dedik", 500);
        IntershipEmployee iEmp = new IntershipEmployee("Sunarto", 5);
        ElectricityBill eBill= new ElectricityBill(5, "A-1");
        Employee e;
        Payable p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
        
    }   
}
