import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    
    public int leven =3;
    ArrayList<Leven>hartje= new ArrayList<Leven>();
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        LatenZien();
        doodgaan();
    }    
    
    public void HartjeEraf()
    {
        leven--;
        LatenZien();
        doodgaan();
    
    }
    
    public void LatenZien()
    {
      for(int i = 0; i<hartje.size(); i++)
      {
      getWorld().removeObject(hartje.get(i));   
          
      }
        
     hartje.clear();
     
     for(int i = 0; i<leven; i++)
     {
         Leven leven= new Leven();
         leven.setImage("hudHeart_full.png");
         getWorld().addObject(leven, 50+(i*60),50);
         hartje.add(leven);
         
        }
        
        
    }
    public void doodgaan()
    {
        if(leven==0)
        {
            
            Greenfoot.setWorld(new Gameover());
        }
        
        
        
    }
}
