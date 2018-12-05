import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    public static int Width = 900;
    public static int Height = 650;
    //public static boolean ver = false, ver2 = true;
    //public static JButton newGame;

    public Ventana(){
        setTitle("Fracaso");
        setSize(Width , Height );
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        /*JPanel pane = new JPanel(null);
        pane.setVisible(false);
        newGame = new JButton("New Game");
        newGame.setBounds(430, 300, 100, 25);
        newGame.addActionListener(new ree());
        pane.add(newGame);
        pane.setBounds(0,0, Width,Height);
        */
        add(new Campo());
        add(new Fondo());
        //add(pane);
    }

    /*public static class ree implements ActionListener{
        public ree(){
        }
        @Override
        public void actionPerformed(ActionEvent a) {
            if (a.getSource() == newGame){
                Ventana.ver = true; Ventana.ver2 = false;}
        }
    }*/

}
