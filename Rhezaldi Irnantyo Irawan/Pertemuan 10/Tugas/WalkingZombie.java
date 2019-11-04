/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author User
 */
public class WalkingZombie extends Zombie{
    public WalkingZombie(int health, int level){
        this.health=health;
        this.level=level;
    }
    @Override
    public void heal() {
        if (level == 1){
            health += health*0.2;
        }else if (level == 2){
            health += health*0.3;
        }else if (level == 3){
            health += health*0.4;
        }
    }
    @Override
    public void destroyed() {
        health -= health*0.2;
    }
    public String getZombieInfo(){
        String info = "\nWalking Zombie Data = \n";
        info += super.getZombieInfo()+"\n";
        return info;
    }
}
