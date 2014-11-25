import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Box extends Obstacles
{
    public Box(){
        turn(90);
    }
    
    public void act() 
    {
        move(6);
        World world= getWorld();
            
        if( getY() == 699 ){
            world.removeObject(this);
        }
    }    
}
