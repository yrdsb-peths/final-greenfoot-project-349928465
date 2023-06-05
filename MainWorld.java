import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainWorld extends World
{
    public static int score = -1;
    Label scoreboard;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        
        Pilot pilot = new Pilot();
        RedBalloon rb = new RedBalloon();
        scoreboard = new Label(0,50);
        Bullet blt = new Bullet();
        
        
        
        addObject(pilot, 50, 350);
        addObject(rb, 590, 330);
        addObject(scoreboard, 55, 55); 
        addObject(blt, 599, 350);
    }
    
    public void createBullet(int x, int y)
    {
        Bullet bullet = new Bullet();
        addObject(bullet, x, y);
    }
    
    public void createRedBalloon()
    {
        RedBalloon balloon = new RedBalloon();
        int y = Greenfoot.getRandomNumber(400);
        addObject(balloon, 550, y);
    }
    
    public void createBlueBalloon()
    {
        BlueBalloon balloon = new BlueBalloon();
        int y = Greenfoot.getRandomNumber(400);
        addObject(balloon,550,y);
    }
    
    public void createYellowBalloon()
    {
        YellowBalloon balloon = new YellowBalloon();
        int y = Greenfoot.getRandomNumber(400);
        addObject(balloon,550,y);
    }
    
    public void increaseScore()
    {
        score++;
        scoreboard.setValue(score);
    }
}       
