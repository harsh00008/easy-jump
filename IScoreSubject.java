import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public interface IScoreSubject 
{
    public void attach(IScoreObserver obv);
    public void detach(IScoreObserver obv);
    public void notifyScore(int score);

    
    
}
