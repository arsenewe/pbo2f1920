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
public class JumpingZombie extends Zombie{
    public JumpingZombie(int health, int level){         
        this.health = health;         
        this.level = level; 
    } 
    @Override     
    public void heal(){         
        super.heal();         
        if (level == 1 ) { 
           health = (int) (health+(health*0.3)); 
        }else if (level == 2) { 
            health = (int) (health+(health*0.4)); 
        }else if (level == 3 ) { 
            health = (int) (health+(health*0.5)); 
        }else{ 
            System.out.println("Max Level is Level 3"); 
        } 
} 
    @Override     
    public void destroyed(){         
        super.destroyed(); 
        health = (int) (health -(health*0.1));     
    } 
     
    @Override 
    public String getZombieInfo(){ 
        String info = super.getZombieInfo()+"\n";         
        info += "Jumping Zombie Info :\nHealth : "+health+"\nLevel : "+level+"\n";         
        return info; 
    } 

}
