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
     
        private int vSpeed = 0;
        private int acceleration = 1;
    private ArrayList<IJumpObserver> observers = new ArrayList<IJumpObserver>() ;
    
    
    GreenfootImage rightImage = new GreenfootImage("running-ninja-right.gif");
    GreenfootImage deadNinja = new GreenfootImage("dead_ninja.gif");
    GreenfootImage leftImage = new GreenfootImage("running-ninja.gif");
    private boolean isBackgroundSoundPlaying = Boolean.FALSE;
    
    
    public Ninja(){
        
        turn(90);
        setImage(leftImage);
        
         rightWallState = new RightWallState(this);
         leftWallState = new LeftWallState(this);
         deadState = new DeadState(this);
         currentState = leftWallState;
        
    }
    public void act() 
    {
        // Add your action code here.This can be removed as player now jumps using space
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
        Actor redbox = getOneIntersectingObject( RedBox.class ) ;
        Actor balcony = getOneIntersectingObject( Box.class ) ;
        if(redbox!=null || balcony!=null){
               
             try{
               hit();
               Thread.sleep(150);
             }
            catch(Exception e){
            }

        }
        
        
        if(currentState==deadState){
             goToHeaven();
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
        currentState.jump();
        //this is to avoid the increment of score after player is dead and space bar is hit
        if(currentState!=deadState){
         Greenfoot.playSound("jump.mp3");
         notifyJump(); 
        }
        
    }
    
    void hit(){
       
         currentState.hit();
    }
    
    void setState(PlayerStates nextState) {
        
        switch( nextState ) {
            case LEFT_STATE :          currentState = leftWallState ; break ;
            case RIGHT_STATE :         currentState = rightWallState ; break ;
            case DEAD_STATE:           currentState = deadState ;break ;
        }
    }
    public void goToHeaven(){
        //turn(90);
        if(!isBackgroundSoundPlaying){
            try{
            Greenfoot.playSound("hit.wav");
            Thread.sleep(800);
            Greenfoot.playSound("hit2.wav");
            Thread.sleep(800);
            //gameOverMusic.play();
            isBackgroundSoundPlaying=Boolean.TRUE;
            }
            catch(Exception e){
                
            }
            
        }
        
        setImage(deadNinja);
        if(getX()==550 || getX()>250){
            setLocation ( getX()-vSpeed, getY() - vSpeed);
        }else if(getX() >=40 || getX() < 250){
            setLocation ( getX()+vSpeed, getY() - vSpeed);
        }
        
        vSpeed = vSpeed + acceleration;
    
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
    
    /*public GreenfootSound getGameOverSound(){
        return this.gameOverMusic;
    }*/
    
    
}
