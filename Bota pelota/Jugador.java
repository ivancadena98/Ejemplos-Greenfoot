import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador extends Actor
{
    private boolean dis;
    
    public Jugador(){
        dis=false;
    }
    
    @Override
    public void act() 
    {
        if(Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX()+5,this.getY());
        }
        else if(Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX()-5,this.getY());
        }
        else if(Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(),this.getY()-5);
        }
        else if(Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(),this.getY()+5);
        }
        else if(Greenfoot.isKeyDown("space") && !dis){  
            Disparo d= new Disparo();
            World m= this.getWorld();
            m.addObject(d,this.getX(),this.getY());
            dis=true;
        }    
        
        World m= this.getWorld();
        List lis=m.getObjects(Disparo.class);
        if(lis.isEmpty()){
            dis=false;
            
        }
    }
}
