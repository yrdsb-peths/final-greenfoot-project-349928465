import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Yellow balloon which is the fastest
 * 
 * @author Jimmy Yip
 * @version June 13 2023
 */
public class YellowBalloon extends Actor
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
     * Moves balloon 3 units left
     */
    public void movement()
    {
        setLocation(getX()-3, getY());
    }
}
