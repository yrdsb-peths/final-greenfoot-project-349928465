import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Blue balloon which moves quicker than red but slower than yellow
 * 
 * @author Jimmy Yip
 * @version June 13 2023
 */
public class BlueBalloon extends Actor
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
     * Moves balloon 2 units left
     */
    public void movement()
    {
        setLocation(getX()-2, getY());
    }
}
