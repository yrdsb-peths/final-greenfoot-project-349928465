import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueBalloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueBalloon extends Actor
{
    /**
     * Act - do whatever the BlueBalloon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        movement();
        MainWorld world = (MainWorld) getWorld();
        if (getX() < 0)
        {
            world.gameOver();
        }
    }
    
    public void movement()
    {
        setLocation(getX()-2, getY());
    }
}
