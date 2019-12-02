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
public class ElectricityBill implements Payable{
    private int kwh;
    private String category;
    
    public ElectricityBill(int kwh, String category){
        this.kwh=kwh;
        this.category=category;
    }
    public int getKwh(){
        return kwh;
    }
    public void setKwh(int kwh){
        this.kwh=kwh;
    }
    public String getCategory(){
        return category;
    }
    @Override
    public int getPayableAmount() {
        return kwh*getBasePrice();
    }
    public int getBasePrice() {
        int bPrice = 0;
        switch(category){
        case "R-1" : bPrice = 200;
        break;
        case "R-2" : bPrice = 300;
        break;
        }
        return bPrice;
    }
    public String getGetBillInfo() {
        return "kWH = "+kwh+"\n"+
                "Category = "+category+"("+getBasePrice()+" per kWH)\n";
    }
}
