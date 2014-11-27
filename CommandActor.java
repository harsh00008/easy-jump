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
    GreenfootSound gameoverSound;
    GreenfootSound startSoundSound;
    public CommandActor(String screenType)
    {
        GreenfootImage menu = new GreenfootImage("commandMenu.png");
          setImage(menu);
        //setImage(new GreenfootImage("Press N for new game and X for Exit ", 39 ,  Color.GREEN, Color.BLACK, Color.YELLOW));
           startGameRecevier= new StartGameReceiver();
           exitGameReceiver= new ExitGameReceiver();
           strGame = new StartGameCommand(startGameRecevier);
           extGame = new ExitGameCommand(exitGameReceiver);
           myChangeGameInvoker = new GameInvoker();
           if(screenType.equals("GameOverScreen")){
               
               gameoverSound = new GreenfootSound("Ninja Gaiden 3 Soundtrack-A Hero Unmasked.mp3");
              // gameoverSound.play();
               
            }else{
                startSoundSound = new GreenfootSound("Ninja Gaiden.mp3");
                startSoundSound.play();
            }
           
        }
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("N"))
        {
            if(startSoundSound!=null){
                startSoundSound.stop();
            }else if(gameoverSound!=null) {
                gameoverSound.stop();
            }
        
        
        myChangeGameInvoker.executeGame(extGame); 
        }
        if(Greenfoot.isKeyDown("E"))
        {
            gameoverSound.stop();
         myChangeGameInvoker.executeGame(extGame);   
        }
    } 
    
    
    public  GreenfootSound getStartSound(){
        return this.startSoundSound;
    }
     public  GreenfootSound getGameOverSoundSound(){
        return this.gameoverSound;
    }
}
