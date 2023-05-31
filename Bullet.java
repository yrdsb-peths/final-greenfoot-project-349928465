import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setRotation(0);
        move(1);
        checkHit();
    }
    
    public void checkHit()
    {
        if(isTouching(RedBalloon.class))
        {
            removeTouching(RedBalloon.class);
        }
        if(isTouching(BlueBalloon.class))
        {
            removeTouching(BlueBalloon.class);
        }
        if(isTouching(YellowBalloon.class))
        {
            removeTouching(YellowBalloon.class);
        }
    }
}
