/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasZombie;

/**
 *
 * @author user
 */
public class Plant {
    public void doDestroy(Destroyable d){
        if (d instanceof WalkingZ){
            WalkingZ wz = (WalkingZ)d;
            wz.destroyed();
        }
        else if(d instanceof JumpingZ){
            JumpingZ js = (JumpingZ)d;
            js.destroyed();
        }
        else if(d instanceof Barrier){
            Barrier b = (Barrier)d;
            b.destroyed();
        }
    }
}
