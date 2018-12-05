import java.awt.*;

public class Nave {
    public  int x ,y;
    public  static int limiteDer = Ventana.Width - 60;
    public  static int limiteIzq = 0;
    public  static int mov = 6;
    public Campo campo;
    Rectangle rect;

    public Nave(Campo c, int x, int y){
        this.x = x;
        this.y = y;
        this.campo = c;
    }
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        rect = new Rectangle(this.x, this.y, 30, 40);
        g2.setColor(Color.red);
        g2.fill(rect);
    }

    public  void derecha(){ if (this.x < limiteDer)  x = x + mov;
             }

    public  void izquierda(){
        if (this.x >  limiteIzq) this.x = this.x - mov;
    }
}
