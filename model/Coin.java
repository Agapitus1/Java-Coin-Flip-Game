package model;
public class Coin extends Updater
{
    private final int SIDES = 2;
    private int flip;
    public Coin()
    {
    }

    public void flip()
    {
        flip = (int) ((Math.random()*SIDES)+1);
        /*if(flip == 1)
        {
            System.out.println("Congratulation, you got Head");
        }
        else
        {
            System.out.println("Congratulation, you got Tail");
        }*/
        updateView();
    }
    
    public int getFlip()
    {
        return flip;
    }
}
