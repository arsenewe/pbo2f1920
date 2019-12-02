/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjb10;

/**
 *
 * @author USER
 */
public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (this.level) {
            case 1:
                this.health += (20 / 100 * this.health);
                break;
            case 2:
                this.health += (30 / 100 * this.health);
                break;
            case 3:
                this.health += (40 / 100 * this.health);
                break;
        }
    }

    @Override
    public void destroyed() {
        this.health -= (20 * this.health / 100);
    }

    @Override
    public String getZombieInfo() {
        String info = super.getZombieInfo();
        return "Walking Zombie Data = \n"
                + info;
    }

}
