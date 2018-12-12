import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover extends Startscherm
{

    /**
     * Constructor for objects of class Gameover.
     * 
     */
    public Gameover()
    {
        this.setBackground("Eindscherm.png");
        addObject(new GameoverButton("restartbutton2.png"),300,90);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("Enter")) 
        {

            Greenfoot.setWorld(new Startscherm());
        }
        
    }
}
