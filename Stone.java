import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Box here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stone extends Obstacles
{
    /**
     * Act - do whatever the Box wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Stone(){
        turn(90);
        
    }
    public void act() 
    {
        // Add your action code here.
        move(6);
        World world= getWorld();
            
        if( getY() == 699 ){
            world.removeObject(this);
        }
        
    }    
}
