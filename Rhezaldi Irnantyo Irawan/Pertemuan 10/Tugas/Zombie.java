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
public abstract class Zombie implements Destroyable {
    protected int health;
    protected int level;
    
    public String getZombieInfo(){
        return "\nHealth = "+health+"\nLevel = "+level;
    }
    
    public abstract void heal();
    
    @Override
    public abstract void destroyed();
}