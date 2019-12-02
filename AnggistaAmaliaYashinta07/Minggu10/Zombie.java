/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombie;

/**
 *
 * @author ANGGISTA AMALIA
 */
public abstract class Zombie implements Destroyable{
    protected int health;
    protected int level;

    @Override
    public abstract void destroyed();
    public abstract void heal();
    
    public String getZombieInfo() {
        return "\n Health = " +health+ "\n level = " +level;
    }
}
