/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Besta
 */
public class WalkingZombie extends Zombie{
    
    public WalkingZombie(int health, int level){
        this.health=health;
        this.level=level;
    }
    public void heal(int health){
        switch (level) {
            case 1:
                this.health += 0.2 * health;
                break;
            case 2:
                this.health += 0.3 * health;
                break;
            case 3:
                this.health += 0.4 * health;
                break;
            default:
                System.out.println(".....");
                break;
        }
    }
//    public String getZombieInfo(){
//        return WalkingZombie();
//    }

    @Override
    public void destroyed() {
        }
}
