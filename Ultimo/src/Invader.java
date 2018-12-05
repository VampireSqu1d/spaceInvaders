import java.awt.*;

public class Invader {
    public int x, y;

    public Invader(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.green);
        Rectangle eli = new Rectangle(this.x, this.y, 20,20);
        g2.fill(eli);
    }

}
