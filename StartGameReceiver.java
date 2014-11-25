/**
 * Write a description of class StartGameReceiver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
public class StartGameReceiver  implements IGameReceiver
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class StartGameReceiver
     */
    public StartGameReceiver()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   public void doAction()
   {
       try{
      System.out.println("Start game");
      Greenfoot.setWorld(new NinjaWorld());
      Thread.sleep(1000);
    }
    catch(Exception e)
    {}
    }
}
