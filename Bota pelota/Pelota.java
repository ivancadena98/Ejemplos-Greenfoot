import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pelota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelota extends Actor
{
    private int x;
    private int y;
    
    public Pelota()
    {
        x=10; //Incremento en x
        y=10; //Incremento en y
    }
    
    /**
     * Act - do whatever the Pelota wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    @Override
    public void act() 
    {
        //Consulta coordenadas actuales heredadas 
       int px=this.getX();
       int py=this.getY();
       
       //Se calculan las nuevas coordenadas
       int nuevoX=x+px;
       int nuevoY=y+py;
       
       //Se accede añ mundo pára conocer eñ tamaño
       World m=this.getWorld();
       if(nuevoX > m.getWidth()){   //Rebota pa' la derecha
        x=-x;
        }
        if(nuevoY > m.getHeight()){   //Rebota en la parte de abajo :o
        y=-y;
        }
        if(nuevoY < 0){   //Rebota en la parte de arriba 
        y=-y;
        }
        if(nuevoX < 0){   //Rebota en la parte de izquierda
        x=-x;
        }
       //Se cambia la posicion a la pelota 
       this.setLocation(nuevoX,nuevoY);
    }    
}
