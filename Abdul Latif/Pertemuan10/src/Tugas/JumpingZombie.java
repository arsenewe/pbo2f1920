/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author A S U S
 */
public class JumpingZombie extends Zombie{

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }
    
    public void heal(){
        if(level==1)
            health += (30*health)/100;
        else if(level==2)
            health += (40*health)/100;
        else
            health += (50*health)/100;
    }
    
    public void destroyed(){
        health -= (10*health)/100;
    }
    
    public String getZombieInfo(){
        return "Jumping Zombie Data =\nHealth = "+health+"\nLevel = "+level;
    }
    
}
