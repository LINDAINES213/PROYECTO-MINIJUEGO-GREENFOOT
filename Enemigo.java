import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo extends Actor
{
    /**
     * Act - do whatever the Enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        new Enemigo();
        
        moveA();
        eat();
    }
    
    public void moveA()
    {
        move(2);
        if (Greenfoot.getRandomNumber(90) < 10)
        {
            turn(Greenfoot.getRandomNumber(70) - 45);
        }
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5)
        {
            turn(180);
        }
        if (getY() <= 5 || getY() >= getWorld().getHeight() - 5)
        {
            turn(180);
        }
    }
    
    public void eat()
    {
        Actor jugador;
        jugador = getOneObjectAtOffset(0, 0, Jugador.class);
        if (jugador != null)
        {
            World world;
            world = getWorld();
            world.removeObject(jugador);
            Greenfoot.playSound("eating.wav");
            getWorld().showText("Ha perdido, presione Reset para comenzar de nuevo", getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }    
}
