import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Disparo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disparo extends Actor
{
    @Override
    public void act() 
    {
        this.setLocation(this.getX(),this.getY()-5);
        if(this.getY()==0){
            World m= this.getWorld();
            
            
            m.removeObject(this);
            
        }
        else if(this.isTouching(Pelota.class)){
            this.removeTouching(Pelota.class);
        }
    }    
}
