
package Tugas.polimorfisme;

/**
 *
 * @author BAGAS
 */
public abstract class Zombie implements Destroyable { 
    protected int health;    
    protected int level;     
    
    public String getZombieInfo(){  
        return "\nHealth = "+health+"\nLevel = "+level;
    }         
    public abstract void heal();    
    @Override    
    public abstract void destroyed(); 
} 
   
