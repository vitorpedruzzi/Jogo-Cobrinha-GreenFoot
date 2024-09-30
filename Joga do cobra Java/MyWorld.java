import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    //Vitor Pedruzzi, Kauan Modolo, João Pedro Becker
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Player bluePlayer = new Player(0,0,0,255);
    Player pinkPlayer = new Player(4,255,20,147);
    Counter blueCounter = new Counter();
    Counter pinkCounter = new Counter();
    int count = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1);
        // Chamamos os players
        addObject(bluePlayer, 500, 300);
        addObject(blueCounter, 650, 50);
        addObject(pinkPlayer, 150, 300);
        addObject(pinkCounter, 50, 50); 
    }
    public void act()
    {
        count++;
        if(count > 100){
            addObject(new Food(255,0,0), Greenfoot.getRandomNumber(getWidth() -1), Greenfoot.getRandomNumber(getHeight() -1));
            Greenfoot.playSound("pop.mp3");
            count = 0;
        }
    }
}
