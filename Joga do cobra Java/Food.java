import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food extends Actor
{
    /**
     * Act - do whatever the Food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Vitor Pedruzzi, Kauan Modolo, João Pedro Becker
    int red, pink, blue;
    int count = 0;
    public Food(int red, int pink, int blue)
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
        count++;
        if(count > 400)
        getWorld().removeObject(this);
        else if (isTouching(Player.class))
        getWorld().removeObject(this);
        else if (isTouching(Tail.class))
        getWorld().removeObject(this);
    }
}
