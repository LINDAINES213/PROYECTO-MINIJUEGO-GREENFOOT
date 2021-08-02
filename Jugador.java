import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Canguro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador extends Actor
{
    /**
     * Act - do whatever the Canguro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int count = 0;
    
    public void act()
    {
        moveJ();
        eat();
        
    }
    
    public void moveJ()
    {
        move(3);
        
        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
        }
    }
    
    public void eat()
    {
        Actor Comida;
        Comida = getOneObjectAtOffset(0, 0, Comida.class);
        if (Comida != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Comida);
            Greenfoot.playSound("eating.wav");
        }    
    
    }
    
    public void Winner()
        {
        Actor Comida;
        Comida = getOneObjectAtOffset(0, 0, Comida.class);
        if (Comida == null)
            {
            World world;
            world = getWorld();
            getWorld().showText("You Win", getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
            }
        }
}
