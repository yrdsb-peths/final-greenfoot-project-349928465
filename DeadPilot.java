import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Dead pilot for the game over screen
 * 
 * @author Jimmy Yip
 * @version June 13 2023
 */
public class DeadPilot extends Actor
{
    // Constructor which sets its image
    public DeadPilot()
    {
        GreenfootImage dead = new GreenfootImage("images/dead.png");
        dead.scale(105,75);
        setImage(dead);
    }
}
