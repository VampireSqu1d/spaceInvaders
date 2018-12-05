import javax.swing.JPanel;
import java.awt.Graphics;
import  java.awt.Color;
import java.util.Random;

public class Fondo extends JPanel {
    public int[][] pixeles = new int[Ventana.Width][Ventana.Height];

    public Fondo(){
        setSize(Ventana.Width, Ventana.Height);
    }

    public void paint(Graphics g){
        for (int i = 0; i < pixeles.length; i++) {
            for (int j = 0; j < pixeles[0].length; j++) {
                pixeles[i][j] = getRandom(1000);
            }
        }
        for (int i = 0; i < pixeles.length; i++) {
            for (int j = 0; j < pixeles[0].length; j++) {
                Color color = new Color(10,10, 25);
                if (pixeles[i][j] < 1) color = Color.white;
                g.setColor(color);
                g.drawLine(i,j,i,j);
            }
        }
    }

    public static int getRandom(int limite){
        int random = new Random().nextInt(limite + 1);
        return  random;
    }
}
