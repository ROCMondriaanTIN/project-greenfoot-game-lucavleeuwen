import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameoverButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameoverButton extends Actor
{
  
    
     String name;
    
    public GameoverButton(String image){
    setImage(image);
   // this.name = name;
    this.name = image.replaceAll("", "");
    }
    
    
    
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
        switch (name){
            case "restartbutton2.png":
            Greenfoot.setWorld(new Startscherm());
            break;
            
            // case "controllsbutton.png":
            // Greenfoot.setWorld(new ControlsScherm());
            // break;
            
            
            
            // case"PlayAgain.png":
             // Greenfoot.setWorld(new BeginScherm());
             // break;
    }    

}
}
}

