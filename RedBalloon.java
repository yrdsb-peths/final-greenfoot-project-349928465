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
    SimpleTimer timer = new SimpleTimer();
    
    public void RedBalloon()
    {
        timer.mark();
    }
    
    public void act()
    {
        randomSpawn();
        movement();
    }
    
    public void randomSpawn()
    {
        if (timer.millisElapsed() >= 500)
        {
            MainWorld world = (MainWorld) getWorld();
            world.createRedBalloon();
            Greenfoot.delay(2000);
            timer.mark();
        }
    }
    
    public void movement()
    {
        setLocation(getX()-1, getY());
    }
}
