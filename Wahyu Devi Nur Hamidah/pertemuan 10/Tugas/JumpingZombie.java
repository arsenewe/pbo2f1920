/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Wahyu devi
 */
public class JumpingZombie extends Zombie{
    public JumpingZombie (int health, int level){
        this.level = level;
        this.health = health;
    }
    
    public void heal(){
        if (level == 1){
            health += health*0.3;
        }else if (level == 2){
            health += health*0.4;
        }else if (level == 3){
            health += health*0.5;
        }
    }
    
    public void destroyed(){
        health -= health*0.1;
    }
    
    public String getZombieInfo(){
        String info = "\nJumping Zombie Data = \n";
        info += super.getZombieInfo()+"\n";
        return info;
    }

}
