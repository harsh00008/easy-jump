/**
 * Write a description of class game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
public interface IGameReceiver  
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class game
     */
    
    public void doAction();
   /* 
    public void gameOn() {
        try{
      System.out.println("Start game");
      Greenfoot.setWorld(new NinjaWorld());
      Thread.sleep(1000);
    }
    catch(Exception e)
    {}
   }
 
   public void gameOff() {
      System.out.println("Stop Game");
      Greenfoot.stop();
   }
   */
}
