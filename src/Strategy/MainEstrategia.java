package Strategy;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MainGame extends JFrame{
    private JPanel panelMenu;
    private JTextArea orden;
    private JTextField factura;
    private JLabel precio;


    public MainGame() {
        this.setBounds(600, 200, 600, 600);
        setTitle("Juego Principal");
        ComponentesJugador();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void ComponentesJugador(){
        panelMenu();
        colocarBoton();
    }

    private void panelMenu(){
        panelMenu = new JPanel();
        panelMenu.setLayout(null);
        this.getContentPane().add(panelMenu);
    }

    private void colocarBoton(){
        JButton Box = new JButton("Box");
        Box.setBounds(20,70,100,30);
        panelMenu.add(Box);
        Box.setEnabled(true);

        ActionListener boxear = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Peleador p1 = new Peleador(new Box());
                p1.pelear();
            }
        };Box.addActionListener(boxear);
    }
}



public class MainEstrategia {
    public static void main(String[] args) {
        MainGame menu = new MainGame();
        menu.setVisible(true);
    }
}
