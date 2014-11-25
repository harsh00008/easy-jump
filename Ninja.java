import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Ninja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ninja extends Actor implements IJumpSubject
{
    IState currentState;
    IState rightWallState;
    IState leftWallState;
    IState deadState;
    
    private ArrayList<IJumpObserver> observers = new ArrayList<IJumpObserver>() ;
	
    
    GreenfootImage rightImage = new GreenfootImage("running-ninja-right.gif");
    GreenfootImage leftImage = new GreenfootImage("running-ninja.gif");
    private boolean isLeft = true;
    
    public Ninja(){
        turn(90);
        setImage(leftImage);
        System.out.println("Player construction");
         rightWallState = new RightWallState(this);
         leftWallState = new LeftWallState(this);
         deadState = new DeadState(this);
         currentState = leftWallState;
        
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
        
         if(Greenfoot.isKeyDown("space")){
            try{
               Thread.sleep(150);
                jump();
            }
            catch(Exception e){
            }

        }
    }    
    
    public void attach(IJumpObserver obj) {
	    observers.add(obj) ;
	}

	public void detach(IJumpObserver obj) {
        observers.remove(obj) ;
	}

	public void notifyJump() {
        for (IJumpObserver obj  : observers)
        {
            obj.updateOnJump();
        }
	}
    void jump(){
        System.out.println("Player jumped");
        currentState.jump();
        notifyJump();
    }
    
    void hit(){
        System.out.println("I am dead");
        currentState.hit();
    }
    
    void setState(PlayerStates nextState) {
        
        switch( nextState ) {
            case LEFT_STATE :          currentState = leftWallState ; break ;
            case RIGHT_STATE :         currentState = rightWallState ; break ;
            case DEAD_STATE:               currentState = deadState ; break ;
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
