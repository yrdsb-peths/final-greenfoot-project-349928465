import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main World where the game is played in
 * 
 * @author Jimmy Yip
 * @version June 13 2023
 */
public class MainWorld extends World
{
    // Initialize variables and objects
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
        
        // Initialize objects
        Pilot pilot = new Pilot();
        RedBalloon rb = new RedBalloon();
        scoreboard = new Label(0,50);
        Bullet blt = new Bullet();
        
        // Add objects
        addObject(pilot, 50, 350);
        addObject(rb, 660, 330);
        addObject(scoreboard, 55, 55); 
        addObject(blt, 6000, 350);
        levelTimer.mark();
    }
    
    /**
     * Act method which constantly checks which level is currently being played
     */
    public void act()
    {
        levelCheck();
    }
    
    /**
     * Creates a bullet
     */
    public void createBullet(int x, int y)
    {
        Bullet bullet = new Bullet();
        addObject(bullet, x, y);
    }
    
    /**
     * Creates a red balloon
     */
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
    
    /**
     * Creates a blue balloon
     */
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
    
    /**
     * Creates a yellow balloon
     */
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
    
    /**
     * Increases score
     */
    public void increaseScore()
    {
        score++;
        scoreboard.setValue(score);
    }
    
    /**
     * Checks the current level and spawns random amounts of balloons
     */
    public void levelCheck()
    {
        // Level 1 only has red balloons and is the starter level
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
        // Level 2 is reached when score is above 50 and 
        // has red and blue balloons
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
            if (score > 250)
            {
                level++;
            }
        }
        // Level 3 is reached when score is above 250 and 
        // has red, blue, and yellow balloons
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
                        createYellowBalloon();
                    }
                    levelTimer.mark();
                }
            }
            if (score > 700)
            {
                level++;
            }
        }
        // Level 4 is reached when score is above 700 and
        // switches the world to the EndScreen 
        if (level == 4)
        {
            EndScreen endWorld = new EndScreen();
            Greenfoot.setWorld(endWorld);
        }
    }
    
    /**
     * Returns score
     */
    public static int getScore()
    {
        int prevScore = score;
        score = 0;
        return prevScore; 
    }
    
    /**
     * Switches world to the GameOverScreen();
     */
    public void gameOver()
    {
        GameOverScreen deathScreen = new GameOverScreen();
        Greenfoot.setWorld(deathScreen);
    }
}       
