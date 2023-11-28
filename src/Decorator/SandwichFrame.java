package Decorator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.awt.*;
class MenuFrame extends JFrame {
    Component proteina;
    private JPanel panelMenu;
    private JComboBox<String> listaSandwiches;
    private JComboBox<String> listaSandwichesGrandes;
    private JComboBox<String> listaAdicionales;
    private JTextArea orden;
    private JTextField factura;
    private JLabel precio;
    private JScrollPane scroll;
    public MenuFrame() {
        this.setBounds(600, 200, 600, 600);
        setTitle("Menú de sandwich");

        ComponentesCliente();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void ComponentesCliente(){
        panelMenu();
        colocarBoton();
        colocarOpciones();
        colocarOrden();
        colocarFactura();
        colocarEtiqueta();
    }

    private void panelMenu(){
        panelMenu = new JPanel();
        panelMenu.setLayout(null);
        this.getContentPane().add(panelMenu);
    }
    private void colocarBoton(){

        JButton Seleccionar = new JButton("Seleccionar");
        Seleccionar.setBounds(20,70,100,30);
        panelMenu.add(Seleccionar);
        Seleccionar.setEnabled(true);
        ActionListener seleccionar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (listaSandwiches.getSelectedIndex() == 0)
                    proteina = new Pavo();
                if (listaSandwiches.getSelectedIndex() == 1)
                    proteina = new Italiano();
                if (listaSandwiches.getSelectedIndex() == 2)
                    proteina = new Beef();
                if (listaSandwiches.getSelectedIndex() == 3)
                    proteina = new Veggie();
                if (listaSandwiches.getSelectedIndex() == 4)
                    proteina = new Atun();
                if (listaSandwiches.getSelectedIndex() == 5)
                    proteina = new Pollo();

                orden.setText(proteina.getDescripcion());
                factura.setText(proteina.getPrecio() + "");
            }
        };Seleccionar.addActionListener(seleccionar);

        JButton SeleccionarGrande = new JButton("Seleccionar");
        SeleccionarGrande.setBounds(250,70,100,30);
        panelMenu.add(SeleccionarGrande);
        SeleccionarGrande.setEnabled(true);

        ActionListener seleccionarGrande = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (listaSandwichesGrandes.getSelectedIndex() == 0)
                    proteina = new PavoGrande();
                if (listaSandwichesGrandes.getSelectedIndex() == 1)
                    proteina = new ItalianoGrande();
                if (listaSandwichesGrandes.getSelectedIndex() == 2)
                    proteina = new BeefGrande();
                if (listaSandwichesGrandes.getSelectedIndex() == 3)
                    proteina = new VeggieGrande();
                if (listaSandwichesGrandes.getSelectedIndex() == 4)
                    proteina = new AtunGrande();
                if (listaSandwichesGrandes.getSelectedIndex() == 5)
                    proteina = new PolloGrande();

                orden.setText(proteina.getDescripcion());
                factura.setText(proteina.getPrecio() + "");
            }
        }; SeleccionarGrande.addActionListener(seleccionarGrande);

        JButton SeleccionarAdicional = new JButton("Seleccionar");
        SeleccionarAdicional.setBounds(20,300,100,30);
        panelMenu.add(SeleccionarAdicional);
        SeleccionarAdicional.setEnabled(true);

        ActionListener adicional = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (listaAdicionales.getSelectedIndex() == 0)
                    proteina = new Aguacate(proteina);
                if (listaAdicionales.getSelectedIndex() == 1)
                    proteina = new DobleProteina(proteina);
                if (listaAdicionales.getSelectedIndex() == 2)
                    proteina = new Hongos(proteina);
                if (listaAdicionales.getSelectedIndex() == 3)
                    proteina = new AguacateGrande(proteina);
                if (listaAdicionales.getSelectedIndex() == 4)
                    proteina = new DobleProteinaGrande(proteina);
                if (listaAdicionales.getSelectedIndex() == 5)
                    proteina = new HongosGrande(proteina);
                if (listaAdicionales.getSelectedIndex() == 6)
                    proteina = new Postre(proteina);;
                if (listaAdicionales.getSelectedIndex() == 7)
                    proteina = new Refresco(proteina);;
                if (listaAdicionales.getSelectedIndex() == 8)
                    proteina = new Sopa(proteina);

                orden.setText(proteina.getDescripcion());
                factura.setText(proteina.getPrecio() + "");
            }
        };SeleccionarAdicional.addActionListener(adicional);

        JButton pedirOrden = new JButton("Ordenar");
        pedirOrden.setBounds(250,300,100,30);
        panelMenu.add(pedirOrden);
        pedirOrden.setEnabled(true);

        ActionListener ordenar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(orden.getText());
                System.out.println("$"+factura.getText());
                orden.setText("");
                factura.setText("");
            }
        };pedirOrden.addActionListener(ordenar);

    }

    private void colocarOpciones(){
        String [] opciones = {"Pavo 15cm","Italiano 15cm","Beef 15cm",
                "Veggie 15cm","Atun 15cm","Pollo 15cm"};

        String [] opcionesgrandes = {"Pavo 30cm","Italiano 30cm","Beef 30cm",
                "Veggie 30cm","Atun 30cm","Pollo 30cm"};

        String [] adicionales = {"Aguacate","Doble Proteína","Hongos",
                "Aguacate Grande", "Doble Proteina Grande", "Hongos Grande",
                "Postre", "Refresco", "Sopa"};

        listaSandwiches = new JComboBox<>(opciones);
        listaSandwiches.setBounds(20,20,150,30);

        listaSandwichesGrandes = new JComboBox<>(opcionesgrandes);
        listaSandwichesGrandes.setBounds(250,20,150,30);

        listaAdicionales = new JComboBox<>(adicionales);
        listaAdicionales.setBounds(20,250,150,30);

        panelMenu.add(listaSandwiches);
        panelMenu.add(listaSandwichesGrandes);
        panelMenu.add(listaAdicionales);
    }

    private void colocarOrden(){
        orden = new JTextArea();
        orden.setBounds(20,400,400,100);
        panelMenu.add(orden);
        orden.setEditable(false);

        scroll = new JScrollPane(orden);
        scroll.setBounds(20,400,400,100);
        panelMenu.add(scroll);
    }

    private void colocarFactura(){
        factura = new JTextField();
        factura.setBounds(20,510,100,20);
        panelMenu.add(factura);
        factura.setEditable(true);
    }
    private void colocarEtiqueta(){
        precio = new JLabel("Precio ($)",SwingConstants.CENTER);
        precio.setBounds(20,540,100,25);
        panelMenu.add(precio);
        precio.setBackground(Color.BLACK);
        precio.setForeground(Color.WHITE);
        precio.setOpaque(true);
        precio.setFont(new Font("times new roman",Font.PLAIN,16));
    }

}

public class SandwichFrame{
    public static void main(String[] args) {
        MenuFrame menu = new MenuFrame();
        menu.setVisible(true);
    }
}

