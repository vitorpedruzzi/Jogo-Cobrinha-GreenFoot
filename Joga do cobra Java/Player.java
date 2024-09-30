import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Vitor Pedruzzi, Kauan Modolo, João Pedro Becker
    int red,pink,blue,player;
    int speed = 2;
    int count = 0;
    public Player(int player, int red, int pink, int blue)
    {
        setRotation(270);
        this.red = red;
        this.pink = pink;
        this.blue = blue;
        this.player = player;
        getImage().setColor(new Color(red, pink, blue));
        getImage().fillRect(0,0,40,40);
    }
    public void act()
    {
        // Add your action code here.
        count++;
        getWorld().addObject(new Tail(red,pink,blue), getX(),getY());
        move(speed);
        moveAround();
        eatFood();
        if(isTouching(Player.class))
        {
            getWorld().addObject(new YouLose(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.playSound("lose.mp3");
            Greenfoot.stop();
        }
    }
    public void moveAround()
    {
       if(this.player == 0){
            if(Greenfoot.isKeyDown("right"))
                setRotation(0);
            if(Greenfoot.isKeyDown("left"))
                setRotation(180);
            if(Greenfoot.isKeyDown("up"))
                setRotation(270);
            if(Greenfoot.isKeyDown("down"))
                setRotation(90);
        }
       if(this.player == 4){
            if(Greenfoot.isKeyDown("d"))
                setRotation(0);
            if(Greenfoot.isKeyDown("a"))
                setRotation(180);
            if(Greenfoot.isKeyDown("w"))
                setRotation(270);
            if(Greenfoot.isKeyDown("s"))
                setRotation(90);
        } 
    }
    public void eatFood()
    {
        if(isTouching(Food.class) && player == 0)
        {
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.blueCounter.addScore();
        }
        if(isTouching(Food.class) && player == 4)
        {
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.pinkCounter.addScore();
        }
    }
}
