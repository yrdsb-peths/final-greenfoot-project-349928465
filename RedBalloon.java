import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Red balloon which is the slowest of the 3 balloons
 * 
 * @author Jimmy Yip
 * @version June 13 2023
 */
public class RedBalloon extends Actor
{
    /**
     * Act - consistently moves the balloon and checks if it is 
     * outside the world's boundaries
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
    
    /**
     * Moves balloon 1 unit left
     */
    public void movement()
    {
        setLocation(getX()-1, getY());
    }
}
