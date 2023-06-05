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
    
    public Pilot()
    {
        for (int x = 0; x < fly.length; x++)
        {
            fly[x] = new GreenfootImage("images/pilot_fly/fly" + x + ".png");
            fly[x].scale(105,75);
        }
        for (int x = 0; x < shoot.length; x++)
        {
            shoot[x] = new GreenfootImage("images/pilot_shoot/shoot" + x + ".png");
            shoot[x].scale(105,75);
        }
        aniTimer.mark();
        shootTimer.mark();
        setImage(fly[0]);
        setImage(shoot[0]);
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
    
    public void pilotShoot()
    {
        while(shootTimer.millisElapsed() < 300)
        {
            if(shootTimer.millisElapsed() > 50)
            {
                setImage(shoot[0]);
            }
            if(shootTimer.millisElapsed() > 100)
            {
                setImage(shoot[1]);
            }
            if(shootTimer.millisElapsed() > 150)
            {
                setImage(shoot[2]);
            }
            if(shootTimer.millisElapsed() > 200)
            {
                setImage(shoot[3]);
            }
            if(shootTimer.millisElapsed() > 250)
            {
                setImage(shoot[4]);
                shootTimer.mark();
            }
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
            setLocation(getX(), getY()-2);
        }
        if (Greenfoot.isKeyDown("S"))
        {
            setLocation(getX(), getY()+2);
        }
        if (Greenfoot.isKeyDown("space"))
        {
            setRotation(0);
            MainWorld world = (MainWorld) getWorld();
            world.createBullet(getX()+65, getY());
            pilotShoot();
        }
    }
}
