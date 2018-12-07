import java.util.*;

import greenfoot.*;


public class BadGuy extends Mover {
    int frames=1;
    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private double speed=0.75;
    public boolean klaar=false;
    public boolean ready=false;
    @Override

    public void act() {
        List<Hero> heroList = this.getWorld().getObjects(Hero.class);
        Hero myHero = heroList.get(0);
        int xpos=myHero.x;
        int ypos=myHero.y;
        int x= getX();
        int y = getY();
        int b=0;
        boolean ready=false;
        up(); 
        setImage("flappybird.png");
        this.getImage().scale(50,50);
        
       

       
       
if (firstAct) {

            firstAct = false;

            xMin = x - walkRange / 2;

            xMax = x + walkRange / 2;

        }
        velocityX = 2;

        applyVelocity();

        if (getX() >= xMax) {

            speed *= -1;

            x = xMax;          

        } else if (getX() <= xMin) {

            speed *= -2;

            x = xMin;

        }

    }

    public void up()

        {


            {

                for(Actor d:getObjectsInRange (70,Tile.class))

                    {    

                    int s=getY();

                    s-=6;

                    int x= getX();

                    int y = getY();

                    setLocation(x,s) ; 

                    boolean klaar=true;

                   }  

                }

          

            {

                for(Actor d:getObjectsInRange (70,Tile.class))

                {    

                int s=getY();

                s-=10;

                int x= getX();

                int y = getY();

                setLocation(x,s) ; 

                boolean klaar=true;

               } 

            }

            

            if(klaar)

            {

            ready=true;  

            klaar=false;

            }

    }

}

