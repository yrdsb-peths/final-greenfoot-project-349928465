import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    GreenfootImage bullet = new GreenfootImage("images/Bullet.png");
    
    public Bullet()
    {
        bullet.scale(50,10);
        setImage(bullet);
    }
    
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()+1, getY());
        checkHit();
        MainWorld world = (MainWorld) getWorld();
        if (getX() >= world.getWidth())
        {
            world.removeObject(this);
        }
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
