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
public class JumpingZombie extends Zombie{
    public JumpingZombie(int health, int level){
        this.health=health;
        this.level=level;
    }

    @Override
    public void destroyed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
