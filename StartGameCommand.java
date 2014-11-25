/**
 * Write a description of class startGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartGameCommand implements ICommand
{
    // instance variables - replace the example below with your own
    private int x;
    private IGameReceiver changeGame;

    /**
     * Constructor for objects of class startGame
     */
    public StartGameCommand(IGameReceiver newGame)   
    {
        this.changeGame=newGame;
    }

    public void execute()
    {
    changeGame.doAction();
    }

}
