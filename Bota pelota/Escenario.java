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
        prepare();
    }

    @Override 
    public void act()
    {

        if(Greenfoot.mouseClicked(this)){
            System.out.println("Le diste click al mundo, maese");
            MouseInfo raton=Greenfoot.getMouseInfo();
            //System.out.println(raton.getX() + " " + raton.getY());
            Pelota p = new Pelota();
            super.addObject(p,raton.getX(),raton.getY());
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Jugador jugador = new Jugador();
        addObject(jugador,215,215);
        Pelota pelota = new Pelota();
        addObject(pelota,95,83);
        Pelota pelota2 = new Pelota();
        addObject(pelota2,346,88);
        Pelota pelota3 = new Pelota();
        addObject(pelota3,249,28);
        jugador.setLocation(221,326);
    }
}
