/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombietugas;

/**
 *
 * @author kasbi
 */
public class Barrier implements Destroyable{
    private int Strength; 
     
    public Barrier(int strength){ 
        this.Strength = strength; 
    } 
 
    public int getStrength() { 
        return Strength; 
    } 
    
    public void setStrength(int Strength) { 
        this.Strength = Strength; 
    } 

    @Override
    public void destroyed() {
       Strength = (int) (Strength - (Strength*0.10)); 
    }
    
    public String getBarrierInfo(){ 
        return "Barrier Info : \nStrength : "+getStrength()+"\n"; 
    } 

}
