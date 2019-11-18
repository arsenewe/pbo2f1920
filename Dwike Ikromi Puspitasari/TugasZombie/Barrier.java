/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasZombie;

/**
 *
 * @author user
 */
public class Barrier implements Destroyable{
   private int strength;
   
   Barrier(int strength){
     this.strength = strength;  
   }
   public void setStrength (int strength){
       this.strength = strength;
   }
   public int getStrength(){
       return strength;
   }
   public void destroy(){
       strength -= strength*0.1;
   }
   public String getBarrierInfo(){
       return "\nBarrier Strength = "+strength+"\n";
   }

    public void destroyed() {
        destroy();
    }
}
