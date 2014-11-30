import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Actor
{
    World world = getWorld();
    GreenfootImage wallImage = new GreenfootImage("wall.png");
    public Wall(){
        turn(90);
        setImage(wallImage);
       
    }
    
    
    public void act() 
    {
        //move(10);
      
    }    
}
