/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS;

/**
 *
 * @author hokyt
 */
public abstract class Zombie implements Destroyable {

    protected int health;
    protected int level;

    @Override
    public abstract void destroyed();

    public abstract void heal() ;
        
    public String getZombieInfo() {
        return "\nHealth = " + health + "\nLevel = " + level;
    }
}
