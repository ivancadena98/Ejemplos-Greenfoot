import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escenario extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Escenario()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,true);
    }
    
    @Override 
    public void act()
    {
        
        if(Greenfoot.mouseClicked(this)){
            System.out.println("Le diste click al mundo, maese");
            MouseInfo raton=Greenfoot.getMouseInfo();
            //System.out.println(raton.getX() + " " + raton.getY());
            Pelota p= new Pelota(raton.getX(),raton.getY());
        }
    }
}
