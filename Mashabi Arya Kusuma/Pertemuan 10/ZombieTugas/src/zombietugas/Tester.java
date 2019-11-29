/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombietugas;

/**
 *
 * @author kasbi
 */
public class Tester {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1); 
        JumpingZombie jz = new JumpingZombie(100, 2); 
        Barrier b = new Barrier(100); 
        Plant p = new Plant(); 
        
        System.out.println("--------- PLANTS VS ZOMBIE ---------");
        System.out.println(""+wz.getZombieInfo()); 
        System.out.println(""+jz.getZombieInfo()); 
        System.out.println(""+b.getBarrierInfo());         
        System.out.println("-----------------------");         
        for (int i = 0; i < 4; i++) {             
            p.doDestroyed(wz); 
            p.doDestroyed(jz); 
            p.doDestroyed(b); 
        } 
        System.out.println("Plant Attack in 4 times"); 
        System.out.println(""+wz.getZombieInfo()); 
        System.out.println(""+jz.getZombieInfo()); 
        System.out.println(""+b.getBarrierInfo()); 
    } 
}

