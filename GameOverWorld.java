import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverWorld extends World
{

    /**
     * Constructor for objects of class GameOverWorld.
     * 
     */
        //GreenfootSound backgroundMusic = new GreenfootSound("Mortal Kombat-Sub-Zero Chinese Ninja Warrior.mp3");  
    public GameOverWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 700, 1);
        //backgroundMusic.play();
        populate();
    }
    
    public void populate(){
      
        
        CommandActor commandOp = new CommandActor("GameOverScreen");
        addObject(commandOp,300,490);
        

    }
}
