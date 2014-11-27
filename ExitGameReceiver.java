/**
 * Write a description of class ExitGameReceiver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import greenfoot.*;
public class ExitGameReceiver implements IGameReceiver
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class ExitGameReceiver
     */
    public ExitGameReceiver()
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
      System.out.println("Stop Game");
      System.exit(0);
      //Greenfoot.stop();
    }
}
