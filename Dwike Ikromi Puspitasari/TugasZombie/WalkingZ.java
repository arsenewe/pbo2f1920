package TugasZombie;

/**
 *
 * @author user
 */
public class WalkingZ extends Zombie{
    public WalkingZ(int health, int level){
      this.health = health;
      this.level = level;
    }
    public void heal(){
        if (level == 1) {
            health += health*0.2;
        }else if (level ==2){
            health += health*0.3;
        }else if (level == 3){
            health += health*0.4;
        }
    }
    public void destroyed(){
         health -= (health*0.19);
    }
    public String getZombieInfo(){
        return "Walking Zombie Data = \nHealth = "+health+" \nLevel = "+level+"\n";
    }
}
