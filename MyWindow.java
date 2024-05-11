import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.*;
public class MyWindow extends JFrame
{
    private MyPanel panel = new MyPanel();
    public MyWindow()
    {
        super("Coin Flipper Game!");
        setup();
        build();
        setVisible(true);
    }

    public void setup()
    {
        setSize(400,400);
        setLocation(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void build()
    {
        add(panel);
    }

    private class MyPanel extends JPanel implements MyObserver
    {
        private JButton button = new JButton("Flip!");
        private JLabel label = new JLabel("Coin...");
        private Coin coin = new Coin();
        public MyPanel()
        {
            setup();
            build();
            coin.attach(this);
        }

        public void setup()
        {
            button.addActionListener(new Listener());
        }

        public void build()
        {
            add(button);
            add(label);
        }

        public void update()
        {
            label.setText(" " + coin.getFlip());
        }
        private class Listener implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                coin.flip();
            }
        }
    }
}
