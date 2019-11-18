
package Tugas;

/**
 *
 * @author ASUS
 */
public class Barrier implements Destroyable {
    private int strength;
    
    public Barrier (int strength){
        this.strength = strength;
    }
    public void setStrength (int strength){
        this.strength = strength;
    }
    public int getStrength (){
        return strength;
    } 
    public void destroy(){
        strength -= strength*0.1;
    }  
    public void destroyed(){
        destroy();
    }
    public String getBarrierInfo(){
        return "Barrier Strength = "+strength+"\n";
    }
}
