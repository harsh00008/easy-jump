/**
 * Write a description of class exitGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitGameCommand implements ICommand  
{
    // instance variables - replace the example below with your own
    private IGameReceiver changeGame;

    /**
     * Constructor for objects of class exitGame
     */
    public ExitGameCommand(IGameReceiver newGame)
    {
        this.changeGame=newGame;
    }
    
    public void execute()
    {
    changeGame.doAction();
    }

}
