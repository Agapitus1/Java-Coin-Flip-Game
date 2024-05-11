package model;
import java.util.*;

public class Updater
{
    protected LinkedList<MyObserver> view = new LinkedList<MyObserver>();
    public Updater()
    {
    }

    public void attach(MyObserver ZZ)
    {
        view.add(ZZ);
    }
    
    public void detach(MyObserver XX)
    {
        view.remove(XX);
    }
    
    public void updateView()
    {
        for (MyObserver view : view)
            view.update();
    }
}
