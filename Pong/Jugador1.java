import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador1  extends Actor
{
    /**
     * Act - do whatever the Paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("A")){
            setLocation(this.getX()-10,30);
        }
        if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("S")){
            setLocation(this.getX()+10,30);
        }
    }    
}
