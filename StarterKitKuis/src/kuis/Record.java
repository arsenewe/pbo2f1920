/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author septianenggarsukmana
 */
public class Record {
    private String angka1, angka2, operator, hasil;
    
    public Record(String angka1,String angka2, String operator, String hasil){
        this.angka1 = angka1;
        this.angka2 = angka2;
        this.operator = operator;
        this.hasil = hasil;
    }

    public void setAngka1(String angka1) {
        this.angka1 = angka1;
    }

    public void setAngka2(String angka2) {
        this.angka2 = angka2;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }

    public String getAngka1() {
        return angka1;
    }

    public String getAngka2() {
        return angka2;
    }

    public String getOperator() {
        return operator;
    }

    public String getHasil() {
        return hasil;
    }
    
    
}
