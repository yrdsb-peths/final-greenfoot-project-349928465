import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Screen that displays that you died
 * 
 * @author Jimmy Yip
 * @version June 13 2023
 */
public class GameOverScreen extends World
{
    // Initialize labels
    Label titleLabel = new Label ("You Died", 75);
    Label scoreLabel = new Label ("Score: " + MainWorld.getScore(), 50);
    DeadPilot dead = new DeadPilot();
    /**
     * Constructor for objects of class GameOverScreen.
     * 
     */
    public GameOverScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // Adds objects to the world
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        addObject(scoreLabel, getWidth()/2, getHeight()/2 + 75);
        addObject(dead, getWidth()/2, getHeight()/2 - 75);
    }
}
