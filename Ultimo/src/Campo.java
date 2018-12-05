import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Campo  extends JPanel implements KeyListener {
public  Nave nave;
boolean izq = false;
boolean der = false;
public int ler = 430;
ArrayList<Invader> invaders = new ArrayList<>();

    public Campo(){
        setSize(Ventana.Width, Ventana.Height);
        nave = new Nave(this, ler, 560);
        setFocusable(true);
        addKeyListener(this);
        setFocusTraversalKeysEnabled(false);
        int x = 50;
        int y =150;
        for (int i = 0; i < 68; i++) {
            invaders.add(new Invader(x  ,  y));
            if (x + 50 >  850){
                x = 0;  y = y + 50;
            }
            x= x + 50;
        }
        repaint();
    }

    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
        nave.paint(g2);
        for (Invader i : invaders  )  i.paint(g2);
        g2.dispose();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            nave.derecha();
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            nave.izquierda();
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {

        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
}
