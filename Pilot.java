import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pilot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pilot extends Actor
{
    /**
     * Act - do whatever the Pilot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        movement();
    }
    
    public void movement()
    {
        if (Greenfoot.isKeyDown("W"))
        {
            setRotation(270);
            move(1);
        }
        if (Greenfoot.isKeyDown("S"))
        {
            setRotation(90);
            move(1);
        }
        if (Greenfoot.isKeyDown("space"))
        {
            setRotation(0);
            MainWorld world = (MainWorld) getWorld();
            world.createBullet(getX(), getY());
        }
    }
}
