import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ninja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ninja extends Actor
{
    /**
     * Act - do whatever the Ninja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage rightImage = new GreenfootImage("running-ninja-right.gif");
    GreenfootImage leftImage = new GreenfootImage("running-ninja.gif");
    private boolean isLeft = true;
    
    public Ninja(){
        turn(90);
        setImage(leftImage);
    }
    public void act() 
    {
        // Add your action code here.
        if( Greenfoot.isKeyDown("right") ){
            changeToRightWall();
        }
        if( Greenfoot.isKeyDown("left") ){
            changeToLeftWall();
        }

  
    }    
    
    public void changeToRightWall(){
            setRotation(0);
            while(getX() == 500){

                move(1);
            }
            setImage(rightImage);
    }
    
    
    public void changeToLeftWall(){
            turn(-110);
            setLocation(40, 600);
            setImage(rightImage);
    }
}
