import greenfoot.*;

public class RightWallState implements IState 
{
   
    Ninja player;
    
    GreenfootImage rightImage = new GreenfootImage("running-ninja-right.gif");
    
    public RightWallState(Ninja player)
    {
        this.player = player;
    }

    public void jump()
    {
        //jump to write wall
        player.turn(-110);
        player.setLocation(40, 600);
        player.setImage(rightImage);
    
        player.setState(PlayerStates.LEFT_STATE);
        System.out.println("I am in right state");
    }
    
    public void hit()
    {
        player.setState(PlayerStates.DEAD_STATE);
    }

}
