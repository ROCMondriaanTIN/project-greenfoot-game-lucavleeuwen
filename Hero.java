
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
    int x = 63;
    int y = 1033;
    private int animatieTimer = 0;
    
    

    public Hero() {
        super();
        gravity = 20;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
        //hello there 
        
    }
    public void animatieRight()
    {
        if(frame == 1 )
        {
            setImage("p1_walk01.png");
            frame = 2;
        }
        else if(frame == 2)
        {
            setImage("p1_walk02.png");
            frame = 3;
        }
        else if(frame == 3)
        {
            setImage("p1_walk03.png");
            frame = 4;
        }
        else if(frame == 4)
        {
            setImage("p1_walk04.png");
            frame = 5;
        }
        else if(frame == 5)
        {
            setImage("p1_walk05.png");
            frame = 6;
        }
        else if(frame == 6)
        {
            setImage("p1_walk06.png");
            frame = 7;
        }
        else if(frame == 7)
        {
            setImage("p1_walk07.png");
            frame = 8;
        }
        else if(frame == 8)
        {
            setImage("p1_walk08.png");
            frame = 9;
        }
        else if(frame == 9)
        {
            setImage("p1_walk09.png");
            frame = 10;
        }
        else if(frame == 10)
        {
            setImage("p1_walk10.png");
            frame = 11;
        }
        else if(frame == 11)
        {
            setImage("p1_walk11.png");
            frame = 1;
            return;
            
        }
        frame++;
    }
    public void animatieLeft()
    {
        if(frame == 1)
        {
            setImage("p1_walk010.png");
            frame = 2;
        }
        else if(frame == 2)
        {
            setImage("p1_walk020.png");
            frame = 3;
        }
        else if(frame == 3)
        {
            setImage("p1_walk030.png");
            frame = 4;
        }
        else if(frame == 4)
        {
            setImage("p1_walk040.png");
            frame = 5;
        }
        else if(frame == 5)
        {
            setImage("p1_walk050.png");
            frame = 6;
        }
        else if(frame == 6)
        {
            setImage("p1_walk060.png");
            frame = 7;
        }
        else if(frame == 7)
        {
            setImage("p1_walk070.png");
            frame = 8;
        }
        else if(frame == 8)
        {
            setImage("p1_walk080.png");
            frame = 9;
        }
        else if(frame == 9)
        {
            setImage("p1_walk090.png");
            frame = 10;
        }
        else if(frame == 10)
        {
            setImage("p1_walk100.png");
            frame = 11;
        }
        else if(frame == 11)
        {
            setImage("p1_walk110.png");
            frame = 1;
            return;
        }
        frame++;
        
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
       
        
        for (Actor enemy : getIntersectingObjects(sprungTile.class)){
        if(enemy != null){
        velocityY = -25;
        setLocation(getX() +0, getY());
        
           
        break;
        
        }
        
        
        }
       
        
         
}


    

    public void handleInput() {
        if (Greenfoot.isKeyDown("up")) {
            
            for(Actor Hero: getIntersectingObjects(Tile.class))
            {
            velocityY = -15;
            inAir=true;
            setImage("p1_jump.png");
        } 
    }
        if (Greenfoot.isKeyDown("left")) {
            velocityX = -5;
            animatieLeft();
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 5;
            animatieRight();
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }
public String positie(){
String k = "X"+getX()+" "+"Y"+getY();
return k ;

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
    if(isTouching(Checkpoint1.class))
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

