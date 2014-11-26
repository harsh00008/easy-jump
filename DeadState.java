import greenfoot.*; 
public class DeadState implements IState 
{
    
    Ninja player ;
    public DeadState(Ninja player)
    {
        this.player = player ;
    }

    public void jump()
    {
        GameOverWorld gameoverWorld = new GameOverWorld();
        Greenfoot.setWorld(gameoverWorld);
    }
    
    public void hit()
    {
       
    }
}
