import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public interface IJumpSubject 

{
    public void attach(IJumpObserver obv);
    public void detach(IJumpObserver obv);
    public void notifyJump();
}
