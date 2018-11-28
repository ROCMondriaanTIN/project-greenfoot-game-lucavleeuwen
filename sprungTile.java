import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sprungTile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sprungTile extends Tile
{
    int frame =1 ;
   
    
   public sprungTile (String image, int width, int height) 
    {
    super(image, width, height);
    } 
    
    @Override 
    
    public void act(){
    if (frame == 1){
    setImage ("spring.png");
     this.getImage().scale(68, 95);
    }
    if (frame == 2){
    setImage ("spring.png");
     this.getImage().scale(68, 95);
    }
    if (frame == 3){
    setImage ("spring.png");
     this.getImage().scale(68, 95);
    }if (frame == 4){
    setImage ("sprung.png");
     this.getImage().scale(68, 95);
    }if (frame == 5){
    setImage ("sprung.png");
     this.getImage().scale(68, 95);
    }
    else if (frame == 6){
         
    setImage ("sprung.png");
           this.getImage().scale(68, 95);
    frame = 1;
    return;
    }
    frame++;
    
    }
      
}
