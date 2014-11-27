/**
 * Write a description of class changeGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameInvoker  implements IGameInvoker
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class changeGame
     */
    public void executeGame(ICommand cmd)
    {
     cmd.execute();   
    }
   
}
