import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pilot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pilot extends Actor
{
    SimpleTimer aniTimer = new SimpleTimer();
    SimpleTimer shootTimer = new SimpleTimer();
    
    GreenfootImage[] shoot = new GreenfootImage[5];
    GreenfootImage[] fly = new GreenfootImage[2];
    
    public static int cooldown = 0; 
    public Pilot()
    {
        for (int x = 0; x < fly.length; x++)
        {
            fly[x] = new GreenfootImage("images/pilot_fly/fly" + x + ".png");
            fly[x].scale(105,75);
        }
        aniTimer.mark();
        setImage(fly[0]);
    }
    
    int imageIndex = 0;
    public void pilotFly()
    {
        if (aniTimer.millisElapsed() > 75)
        {
            setImage(fly[imageIndex]);
            imageIndex = (imageIndex + 1) % fly.length;
            aniTimer.mark();
        }
    }
    
    /**
     * Act - do whatever the Pilot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        movement();
        pilotFly();
    }
    
    public void movement()
    {
        if (Greenfoot.isKeyDown("W"))
        {
            setLocation(getX(), getY()-3);
        }
        if (Greenfoot.isKeyDown("S"))
        {
            setLocation(getX(), getY()+3);
        }
        if (cooldown > 0)
        {
            cooldown--;
        }
        else if (Greenfoot.isKeyDown("space"))
        {
            setRotation(0);
            MainWorld world = (MainWorld) getWorld();
            world.createBullet(getX()+65, getY());
            cooldown = 3;
        }
    }
}
