import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedBalloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedBalloon extends Actor
{
    /**
     * Act - do whatever the RedBalloon wants to do. This method is called whenever
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
        setLocation(getX()-1, getY());
    }
}
