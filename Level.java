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
    int scoreOffset = 500;
    private LevelStrategy levelStrategy;
    Level(){
        setImage(new GreenfootImage("Level : " + level,20, Color.GREEN, Color.BLACK, Color.YELLOW));
        setLevelForStatergy(level);
    }
    
    public int getLevelSpeed(){        
        return levelStrategy.getCurrentSpeed();        
    }
    
    public void updateScore(int score){
        
        level = (score / scoreOffset) + 1;
        setLevelForStatergy(level);
        act();
        System.out.println("Current Score : " + level);
    }
    
    public void setLevelForStatergy(int level){
        switch(level){
            case 1 : levelStrategy = new Level1Strategy();
                    break;
            case 2 : levelStrategy = new Level2Strategy();
                    break;
            default : levelStrategy = new Level3Strategy();
        }
    
    }
    
    public void act() 
    {
        setImage(new GreenfootImage("Level : " + level,20, Color.GREEN, Color.BLACK, Color.YELLOW));
    }    
}
