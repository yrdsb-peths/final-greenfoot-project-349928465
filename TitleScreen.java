import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label ("Flying Fighter", 75);
    Label instructions = new Label ("Press <enter> to begin", 35);
    Label controls1 = new Label ("Use <W> and <S> to move", 35);
    Label controls2 = new Label ("Use <space> to shoot", 35);
    AlivePilot pilot = new AlivePilot();
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(pilot, 300, 60);
        addObject(titleLabel, 300, 150);
        addObject(controls1, 300, 235);
        addObject(controls2, 300, 280);
        addObject(instructions, 300, 325);
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("enter"))
        {
            MainWorld gameWorld = new MainWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
