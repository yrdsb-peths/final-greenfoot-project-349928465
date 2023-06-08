import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainWorld extends World
{
    public static int score = 0;
    public int level = 1;
    Label scoreboard;
    SimpleTimer levelTimer = new SimpleTimer();
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
        addObject(rb, 660, 330);
        addObject(scoreboard, 55, 55); 
        addObject(blt, 6000, 350);
        levelTimer.mark();
    }
    
    public void act()
    {
        levelCheck();
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
        int x = Greenfoot.getRandomNumber(1300);
        if (650 < x)
        {
            addObject(balloon, x, y);
        }
    }
    
    public void createBlueBalloon()
    {
        BlueBalloon balloon = new BlueBalloon();
        int y = Greenfoot.getRandomNumber(400);
        int x = Greenfoot.getRandomNumber(1300);
        if (650 < x)
        {
            addObject(balloon, x, y);
        }
    }
    
    public void createYellowBalloon()
    {
        YellowBalloon balloon = new YellowBalloon();
        int y = Greenfoot.getRandomNumber(400);
        int x = Greenfoot.getRandomNumber(1300);
        if (650 < x)
        {
            addObject(balloon, x, y);
        }
    }
    
    
    public void increaseScore()
    {
        score++;
        scoreboard.setValue(score);
    }
    
    public void levelCheck()
    {
        if (level == 1)
        {
            for (int x = 0; x < 1000; x++)
            {
                if (levelTimer.millisElapsed() > 50)
                {
                    int randomNum = Greenfoot.getRandomNumber(100);
                    if (randomNum > 50)
                    {
                        createRedBalloon();
                    }
                    levelTimer.mark();
                }
            }
            if (score > 50)
            {
                level++;
            }
        }
        if (level == 2)
        {
            for (int x = 0; x < 1000; x++)
            {
                if (levelTimer.millisElapsed() > 50)
                {
                    int randomNum = Greenfoot.getRandomNumber(100);
                    if (randomNum > 50)
                    {
                        createRedBalloon();
                        createBlueBalloon();
                    }
                    levelTimer.mark();
                }
            }
            if (score > 150)
            {
                level++;
            }
        }
        
        if (level == 3)
        {
            for (int x = 0; x < 10000; x++)
            {
                if (levelTimer.millisElapsed() > 50)
                {
                    int randomNum = Greenfoot.getRandomNumber(100);
                    if (randomNum > 50)
                    {
                        createRedBalloon();
                        createBlueBalloon();
                    }
                    levelTimer.mark();
                }
            }
            if (score > 250)
            {
                level++;
            }
        }
        if (level == 4)
        {
            EndScreen endWorld = new EndScreen();
            Greenfoot.setWorld(endWorld);
        }
    }
    
    public static int getScore()
    {
        int prevScore = score;
        score = 0;
        return prevScore; 
    }
    
    public void gameOver()
    {
        GameOverScreen deathScreen = new GameOverScreen();
        Greenfoot.setWorld(deathScreen);
    }
}       
