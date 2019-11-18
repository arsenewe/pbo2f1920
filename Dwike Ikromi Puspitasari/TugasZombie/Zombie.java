package TugasZombie;
public abstract class Zombie implements Destroyable{
    protected int health;
    protected int level;
    
    public void heal(){
        this.health = health;
    }
    @Override
    public void destroyed(){
    }
    public String getZombieInfo(){
        return "Health = "+health+" \nLevel = "+level;
    }
}
