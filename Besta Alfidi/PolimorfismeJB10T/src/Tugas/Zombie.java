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
public abstract class Zombie implements Destroyable{
    protected int health;
    protected int level;
    
    public void heal(int health){
        this.health=health;
        System.out.println("halooo");
    }
    public void destroyed(int level){
        this.level=level;
    }
    public String getZombieInfo(){
        return ("Health : "+ health +" Level : " +level);
    }
}
