import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Vitor Pedruzzi, Kauan Modolo, João Pedro Becker
    public int score = 0;
    public Counter()
    {
        setImage(new GreenfootImage("Score: " + score, 30, Color.WHITE, new Color(0, 0, 0, 0)));
    }
    public void act()
    {
        // Add your action code here.
        setImage(new GreenfootImage("Score: " + score, 30, Color.WHITE, new Color(0, 0, 0, 0)));
        youWin();
    }
    public void addScore()
    {
        score++;
    }
    public void youWin()
    {
        if(score == 100){
        getWorld().addObject(new YouWin(), getWorld().getWidth()/2, getWorld().getHeight()/2);
        Greenfoot.stop();
        Greenfoot.playSound("win.mp3");
        }  
    }
}
