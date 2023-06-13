import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bullet which travels through the air and pops balloons
 * 
 * @author Jimmy Yip
 * @version June 13 2023
 */
public class Bullet extends Actor
{
    // Initializes bullet image
    GreenfootImage bullet = new GreenfootImage("images/Bullet.png");
    
    /**
     * Constructor for bullet class
     */
    public Bullet()
    {
        bullet.scale(50,10);
        setImage(bullet);
    }
    
    /**
     * Act - moves bullet 3 units right, checks if it hit a balloon and 
     * checks if it is outside the world's boundaries
     */
    public void act()
    {
        setLocation(getX()+3, getY());
        checkHit();
        MainWorld world = (MainWorld) getWorld();
        if (getX() >= world.getWidth())
        {
            world.removeObject(this);
        }
    }
    
    /**
     * Checks if it is touching a balloon
     * and remove and updates scores accordingly
     */
    public void checkHit()
    {
        // Removes red balloon and increases score by 1
        if(isTouching(RedBalloon.class))
        {
            removeTouching(RedBalloon.class);
            MainWorld world = (MainWorld) getWorld();
            world.increaseScore();
            setLocation(601,0); // puts the object outside the screen to remove it
        }
        // Removes the blue balloon and increases score by 2
        if(isTouching(BlueBalloon.class))
        {
            removeTouching(BlueBalloon.class);
            MainWorld world = (MainWorld) getWorld();
            world.increaseScore();
            world.increaseScore();
            setLocation(601,0); // puts the object outside the screen to remove it
        }
        // Removes the yellow ballon and increases score by 3
        if(isTouching(YellowBalloon.class))
        {
            removeTouching(YellowBalloon.class);
            MainWorld world = (MainWorld) getWorld();
            world.increaseScore();
            world.increaseScore();
            world.increaseScore();
            setLocation(601,0); // puts the object outside the screen to remove it
        }
    }
}
