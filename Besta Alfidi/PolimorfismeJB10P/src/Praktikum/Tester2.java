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
public class Tester2 {
    public static void main(String[] args){
        PermanentEmployee p = new PermanentEmployee("Dedik", 500);
        Employee em;
        em = p;
        System.out.println(""+em.getEmployeeInfo());
        System.out.println("---------------------");
        System.out.println(""+p.getEmployeeInfo());
    }
}
