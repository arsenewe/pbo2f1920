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
public class Tester3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PermanentEmployee p = new PermanentEmployee("Dedik", 500);
        IntershipEmployee i = new IntershipEmployee("Sunaryo", 5);
        ElectricityBill e = new ElectricityBill(5, "R-1");
        Employee em[] = {p ,i};
        Payable pa[] = {p ,e};
        Employee em2[] = {p ,i ,e};
    }
    
}
