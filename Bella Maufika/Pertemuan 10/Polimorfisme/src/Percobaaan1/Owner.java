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
public class Owner {
    public void pay(Payable p){
        System.out.println("TOtal payment ="+p.getPaymentAmount());
        if(p instanceof ElectricityBill){
            ElectricityBill eb = (ElectricityBill) p;
            System.out.println("" eb.getBillInfo());
            
        }else if(p instanceof PermanenEmployee){
            PermanenEmployee pe = (PermanenEmployee) p;
            pe.getEmployeeInfo();
            System.out.println(""+pe.getEmployeeInfo());
        }
        
    }
    public void showMyEmployee(Employee e){
        System.out.println(""e.getEmployeeInfo());
        if(e instanceof PermanenEmployee)
            
                
    }

}
