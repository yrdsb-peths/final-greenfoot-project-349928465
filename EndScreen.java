import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ending screen which displays a surviving pilot with the text "You Survived"
 * 
 * @author Jimmy Yip
 * @version June 13 2023
 */
public class EndScreen extends World
{
    Label titleLabel = new Label ("You Survived", 75);
    AlivePilot pilot = new AlivePilot();
    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    public EndScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        addObject(pilot, getWidth()/2, getHeight()/2 - 75);
    }
}
