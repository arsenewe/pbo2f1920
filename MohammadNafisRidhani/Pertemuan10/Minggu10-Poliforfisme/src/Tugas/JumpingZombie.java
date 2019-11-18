package Tugas;

public class JumpingZombie extends Zombie{

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch(level) {
            case 1 :
                this.health += this.health *0.3;
                break;
            case 2 :
                this.health += this.health *0.4;
                break;
            case 3 :
                this.health += this.health *0.5;
                break;
        }
    }

    @Override
    public void destroyed() {
        this.health -= this.health * 10 / 100;
    }

    @Override
    public String getZombieInfo() {
        String info = super.getZombieInfo() + "\n";
        info += "Jumping Zombie Data = \n" + super.getZombieInfo();
        return info;
    }
}
