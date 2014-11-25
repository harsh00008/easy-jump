import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.ArrayList;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor implements IJumpObserver ,IScoreSubject
{
    int score = 0;
    int increment = 20;
    
    private ArrayList<IScoreObserver> observers = new ArrayList<IScoreObserver>() ;
    
    
    Score(){
    //    score = 0;
    //    increment = 20;
        setImage(new GreenfootImage("Score : " + score,20, Color.GREEN, Color.BLACK, Color.YELLOW));
    
    }
    
    
    public void updateOnJump(){
        score = score + 20;
        notifyScore(score);
        System.out.println("Current Score : " + score);
    }
    
    public void notifyScore(int score)
    {
        for (IScoreObserver obj  : observers)
        {
            obj.updateScore(score);
        }
    }
    
    public void attach(IScoreObserver obj) {
        observers.add(obj) ;
    }

    public void detach(IScoreObserver obj) {
        observers.remove(obj) ;
    }

    
    
    public void act() 
    {
        setImage(new GreenfootImage("Score : " + score,20, Color.GREEN, Color.BLACK, Color.YELLOW));
    }    
}
