import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pilot class for the main world which can fly and shoot
 * 
 * @author Jimmy Yip
 * @version June 13 2023
 */
public class Pilot extends Actor
{
    // Initializes objects and variables
    SimpleTimer aniTimer = new SimpleTimer();
    SimpleTimer shootTimer = new SimpleTimer();
    
    GreenfootSound gunSound = new GreenfootSound("ak47.mp3");
    
    GreenfootImage[] shoot = new GreenfootImage[5];
    GreenfootImage[] fly = new GreenfootImage[2];
    
    public static int cooldown = 0; 
    
    /**
     * Constructor which starts loads animation images and starts timer
     */
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
    /**
     * Animates the pilots flying motion
     */
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
     * Act - runs the methods which move and animate it
     */
    public void act()
    {
        // Add your action code here.
        movement();
        pilotFly();
    }
    
    /**
     * Takes input from the user and moves and allows them to shoot
     */
    public void movement()
    {
        //Moves up 3 units
        if (Greenfoot.isKeyDown("W"))
        {
            setLocation(getX(), getY()-3);
        }
        // Moves left 3 units
        if (Greenfoot.isKeyDown("A"))
        {
            setLocation(getX()-3, getY());
        }
        // Moves down 3 units
        if (Greenfoot.isKeyDown("S"))
        {
            setLocation(getX(), getY()+3);
        }
        // Moves right 3 units
        if (Greenfoot.isKeyDown("D"))
        {
            setLocation(getX()+3, getY());
        }
        // Cooldown for the gun so that the user doesn't spawn too many bullets
        if (cooldown > 0)
        {
            cooldown--;
        }
        // Creates bullets, plays sound and resets cooldown
        else if (Greenfoot.isKeyDown("space"))
        {
            setRotation(0);
            MainWorld world = (MainWorld) getWorld();
            world.createBullet(getX()+65, getY());
            cooldown = 3;
            gunSound.play();
        }
    }
}
