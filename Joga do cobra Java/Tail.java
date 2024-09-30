import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tail extends Actor
{
    /**
     * Act - do whatever the Tail wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Vitor Pedruzzi, Kauan Modolo, João Pedro Becker
    int red, pink, blue, player;
    int countLength = 0;
    static int blueLength = 1;
    static int pinkLength = 1;
    public Tail(int red, int pink, int blue)
    {
        this.red = red;
        this.pink = pink;
        this.blue = blue;
        getImage().setColor(new Color(red, pink, blue));
        getImage().fillRect(0,0,40,40);
    }
    public void act()
    {
        // Add your action code here.
        countLength++;
        if(countLength > 15 && isTouching(Player.class))
        {
            getWorld().addObject(new YouLose(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.playSound("lose.mp3");
            Greenfoot.stop();
        }
        if(player == 0 && countLength % blueLength == 0){
            getWorld().removeObject(this);
            blueLength++;
        }
        if(player == 4 && countLength % pinkLength == 0){
            getWorld().removeObject(this);
            pinkLength++;
        }
    }
}
