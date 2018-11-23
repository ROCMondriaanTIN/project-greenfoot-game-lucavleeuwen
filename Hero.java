
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    public int frame=0;
    boolean inAir;
    boolean checkpoint;
    int x = 92;
    int y = 100;
    
    

    public Hero() {
        super();
        gravity = 20;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
        handleInput();
        spikes();
        checkpoint1();
        lava();
        tile();
        
        
        
        
        
        

       
        
    }


    

    public void handleInput() {
        if (Greenfoot.isKeyDown("up")) {
            for(Actor Hero: getIntersectingObjects(Tile.class))
            {
            velocityY = -15;
            inAir=true;
           
        }
    }
        if (Greenfoot.isKeyDown("left")) {
            velocityX = -5;
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 5;
            ;
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
    
    public void lava()
    {
        if(isTouching(lavaTile.class))
        {
            
            setLocation(x,y);
        }
    }
    
    public void tile()
    {
      if(isTouching(DoorTile.class))
      {
          Greenfoot.setWorld(new World2());
    
        }
    }
   public void checkpoint1(){
    if(isTouching(Checkpoint.class))
        {
            x=getX();
            y=getY();
            
            
        }
    
        
    }
    public void spikes()
    {
        if(isTouching(spikesTile.class))
        {
            
            setLocation(x, y);
    }
}
  
    
    
 
    
}

