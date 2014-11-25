import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class NinjaWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NinjaWorld extends World
{

    /**
     * Constructor for objects of class NinjaWorld.
     * 
     */
    Obstacles box = null;
    long lastAdded = System.currentTimeMillis();  
    
    public NinjaWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 700, 1);         
        populate();
        
    }
    
    
    
    public void populate(){
        Ninja ninjaCharacter = new Ninja();
        addObject(ninjaCharacter, 40,600);
         animateWall();
        
        // Setting up Observer Pattern
        Score score = new Score();
        addObject(score, 150, 50);
        ninjaCharacter.attach(score);
        Level level = new Level();
        addObject(level, 250, 50);
        score.attach(level);
        CommandActor commandOp = new CommandActor();
        addObject(commandOp,300,690);
        

    }
    
    public void runLevel(){
        long curTime  = System.currentTimeMillis();  
       
        if (curTime >= lastAdded + 4000) //5000ms = 5s  
        {  
            box = ObstacleFactory.createObstacle();

            switch(Greenfoot.getRandomNumber(2)){
                case 0: 
                addObject(box, 50, 0);
                break;
                
                case 1:
                addObject(box, 550, 0);
                break;
                
                default:
                addObject(box, 50, 0);
            }
            lastAdded  = curTime;  
        }  
        
    }
    
    public void act(){
       
        runLevel();
        /*
        if( Greenfoot.isKeyDown("right") ){
            Ninja ninja = (Ninja)getObjects(Ninja.class).get(0);
            ninja.changeToRightWall();
        }
        if( Greenfoot.isKeyDown("left") ){
            Ninja ninja = (Ninja)getObjects(Ninja.class).get(0);
            ninja.changeToLeftWall();
        }*/
        Wall leftWall = (Wall)WallFactory.createWall();
        addObject(leftWall, 10, 320);
    }
    
    public void animateWall(){
        Wall leftWall = new Wall();
        addObject(leftWall, 10, 320);
        Wall rightWall = new Wall();
        addObject(rightWall, 590, 320);
    }
}
