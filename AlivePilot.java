import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Non-animated pilot class for worlds other than the MainWorld
 * 
 * @author Jimmy Yip
 * @version June 13 2023
 */
public class AlivePilot extends Actor
{
    // Constructor which sets its image
    public AlivePilot()
    {
        GreenfootImage alive = new GreenfootImage("images/pilot_fly/fly0.png");
        alive.scale(105,75);
        setImage(alive);
    }
}