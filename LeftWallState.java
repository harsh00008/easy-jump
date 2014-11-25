import greenfoot.*;


public class LeftWallState implements IState 
{
    Ninja player ;
    
    GreenfootImage leftImage = new GreenfootImage("running-ninja.gif");
    
    public LeftWallState(Ninja player)
    {
        this.player = player ;
        
    }

    public void jump()
    {
        //jump to write wall
            //player.setRotation(0);
            //while(player.getX() == 500){

              //  player.move(1);
            //}
            player.setLocation(550, 600);
            
            player.setImage(leftImage);
            player.setState(PlayerStates.RIGHT_STATE);
         System.out.println("in left wall state set state");
    }
    
    public void hit()
    {
        player.setState(PlayerStates.DEAD_STATE);
    }
}
