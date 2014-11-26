import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class GameOperation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CommandActor extends Actor
{
    IGameReceiver startGameRecevier,exitGameReceiver;
    
    ICommand strGame; 
    ICommand extGame ;
    GameInvoker myChangeGameInvoker;
    
    public CommandActor()
    {
        GreenfootImage menu = new GreenfootImage("commandMenu.png");
          setImage(menu);
        //setImage(new GreenfootImage("Press N for new game and X for Exit ", 39 ,  Color.GREEN, Color.BLACK, Color.YELLOW));
           startGameRecevier= new StartGameReceiver();
           exitGameReceiver= new ExitGameReceiver();
           strGame = new StartGameCommand(startGameRecevier);
           extGame = new ExitGameCommand(exitGameReceiver);
           myChangeGameInvoker = new GameInvoker();
    }
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("N"))
        {
        myChangeGameInvoker.executeGame(strGame);
        }
        if(Greenfoot.isKeyDown("X"))
        {
         myChangeGameInvoker.executeGame(extGame);   
        }
    }    
}
