import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball  extends Actor
{
    private int incX;
    private int incY;
    private int randomX;
    private int randomY;
    public Ball(){
        incX = 5;
        incY = 5;
        randomX = Greenfoot.getRandomNumber(2);
        randomY = Greenfoot.getRandomNumber(2);
        if(randomX == 0){
            incX = -incX; 
        }
         if(randomX == 1){
            incX = -incX; 
        }
        if(randomY == 0){
            incY = -incY; 
        }
         if(randomY == 1){
            incY = -incY; 
        }
        }
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int px=this.getX();
        int py=this.getY();
        
       int nuevoX=incX+px;
       int nuevoY=incY+py;
        World mundo = this.getWorld();
        Greenfoot.delay(1000);
        if(this.isTouching(Jugador1.class) || this.isTouching(Jugador2.class)){
            if(randomX == 0){
                incX = -incX; 
            }
            else if(randomX == 1){
                incX = -incX; 
            }
            else if(randomY == 0){
                incY = -incY; 
            }
            else if(randomY == 1){
                incY = -incY; 
            }
            
        }
        else if(nuevoY > mundo.getHeight()){   //Rebota en la parte de abajo :o
                mundo.removeObject(this);
                
            }
        else if(nuevoY < 0){   //Rebota en la parte de arriba 
                mundo.removeObject(this);
            }
        else if(nuevoX > mundo.getWidth()){   //Rebota pa' la derecha
                    incX=-incX;
        }
        else if(nuevoX < 0){   //Rebota en la parte de izquierda
                incX=-incX;
        }

        
        this.setLocation(nuevoX,nuevoY);
    }    
}
