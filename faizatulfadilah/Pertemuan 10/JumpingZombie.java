package tugas;
public class JumpingZombie extends Zombie{
    public JumpingZombie (int health, int level) {
        this.health = health;
        this.level = level;
    }
    @Override
    public void destroyed() {
        health -= health * 0.3;
    }

    @Override
    public void heal() {
        if (level == 1){
            health += health*0.2;
        }else if (level == 2){
            health += health*0.3;
        }else if (level == 3){
            health += health*0.4;
        }
    }
    public String getZombieInfo() {
        String info = "Jumping Zombie Data = ";
        info += super.getZombieInfo();
        return info;
    }
}
