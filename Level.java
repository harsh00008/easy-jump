import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends Actor implements IScoreObserver
{
    int level = 1;
    int scoreOffset = 100;
    
    Level(){
        setImage(new GreenfootImage("Level : " + level,20, Color.GREEN, Color.BLACK, Color.YELLOW));
    }
    
    
    public void updateScore(int score){
        
        level = (score / scoreOffset) + 1;
        
        System.out.println("Current Score : " + level);
    }
    
    public void act() 
    {
        setImage(new GreenfootImage("Level : " + level,20, Color.GREEN, Color.BLACK, Color.YELLOW));
    }    
}
