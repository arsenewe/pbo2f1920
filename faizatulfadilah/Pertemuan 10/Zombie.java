package tugas;
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