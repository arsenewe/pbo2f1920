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
public class Tester2 {
 public static void main(String[] args) {
        PermanenEmployee pEmp = new PermanenEmployee("Dedik", 500);
        Employee e;
        e = pEmp;
        System.out.println(""+e.getEmployeeInfo());
        System.out.println("--------------------");
        System.out.println(""+pEmp.getEmployeeInfo());
    }
}
