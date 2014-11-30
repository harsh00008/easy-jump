import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObstacleFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObstacleFactory
{
    
    public static Obstacles createObstacle(){
        Obstacles b = null;
        switch(Greenfoot.getRandomNumber(3)){
            case 1:
                b = new Stone();
            break;
            
            case 2:
                b = new Box();
            break;
            
            default:
                b = new Box();
        }
        return b;
    }    
}
