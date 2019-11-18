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
public class WalkingZombie extends Zombie{
    public WalkingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }
    
    public void heal(){
        if(level==1)
            health += (20*health)/100;
        else if(level==2)
            health += (30*health)/100;
        else
            health += (40*health)/100;
    }
    
    public void destroyed(){
        health -= (20*health)/100;
    }
    
    public String getZombieInfo(){
        return "Walking Zombie Data =\nHealth = "+health+"\nLevel = "+level;
    }
}
