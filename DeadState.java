/**
 * Write a description of class DeadState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeadState implements IState 
{
    
    Ninja player ;
    public DeadState(Ninja player)
    {
        this.player = player ;
    }

    public void jump()
    {
        
    }
    
    public void hit()
    {
       
    }
}
