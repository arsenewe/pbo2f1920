/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspolimorfisme;

/**
 *
 * @author ROG
 */
public class JumpingZombie extends Zombie{
    public JumpingZombie (int health, int level){
        this.level = level;
        this.health = health;
    }
    public void heal(){
        if (level == 1){
            health += health*0.2;
        }else if (level == 2){
            health += health*0.3;
        }else if (level == 3){
            health += health*0.4;
        }
    }
    public void destroyed(){
        health -= health*0.093;
    }
    public String getZombieInfo(){
        String info = "Jumping Zombie Data = ";
        info += super.getZombieInfo()+"\n";
        return info;
    }
}
