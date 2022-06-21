import Actividades.Actividades;
import Equipo.Equipo;
import Mods.PanelMod;
import Proyectos.Proyectos;
import Recursos.Recursos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dash extends JPanel implements ActionListener{

    private JScrollPane scroll = new JScrollPane();

    private PanelMod background= new PanelMod();
    private Botones proyectos = new Botones(new Color(255,255,255));

    private Botones actividades = new Botones(new Color(255,255,255));

    private Botones equipo = new Botones(new Color(255,255,255));

    private Botones recursos = new Botones(new Color(255,255,255));

    private Proyectos proyectosPanel = new Proyectos();
    private Equipo equipoPanel = new Equipo();
    private Recursos recursosPanel = new Recursos();
    private Actividades actividadesPanel = new Actividades();
    public dash(int width, int height) {

        equipoPanel.setPreferredSize(new Dimension(1400,1200));
        scroll.setBounds(240,0,1298,1000);
        scroll.getVerticalScrollBar().setUnitIncrement(16);

        this.setFont(new Font("Montserrat SemiBold", Font.BOLD, 12));
        this.setSize(width, height);
        this.setBackground(new Color(0xB5B5B5));
        this.setLayout(null);

        background.setSize(1920/8, 1080 );
        background.setLocation(0, 0);
        background.setVisible(true);
        background.setLayout(null);
        background.setColor1(new Color(33, 33, 33, 100));
        background.setColor2(new Color(33, 33, 33, 100));

        proyectos.setForeground(new Color(0x000000));
        proyectos.setFont(new Font("Montserrat SemiBold", Font.BOLD, 12));
        proyectos.setBackground(new Color(0xFFFFFF));
        proyectos.setLocation(0, 100);
        proyectos.setText("Proyectos".toUpperCase());
        proyectos.setVisible(true);
        proyectos.addActionListener(this);

        actividades.setForeground(new Color(0x000000));
        actividades.setFont(new Font("Montserrat SemiBold", Font.BOLD, 12));
        actividades.setBackground(new Color(0x6A6A6A));
        actividades.setLocation(0, 220);
        actividades.setText("Actividades".toUpperCase());
        actividades.setVisible(true);
        actividades.addActionListener(this);

        equipo.setForeground(new Color(0x000000));
        equipo.setFont(new Font("Montserrat SemiBold", Font.BOLD, 12));
        equipo.setBackground(new Color(0x6A6A6A));
        equipo.setLocation(0, 340);
        equipo.setText("Equipo".toUpperCase());
        equipo.setVisible(true);
        equipo.addActionListener(this);
        scroll.setViewportView(equipoPanel);

        recursos.setForeground(new Color(0x000000));
        recursos.setFont(new Font("Montserrat SemiBold", Font.BOLD, 12));
        recursos.setBackground(new Color(0x6A6A6A));
        recursos.setLocation(0, 460);
        recursos.setText("Recursos".toUpperCase());
        recursos.setVisible(true);
        recursos.addActionListener(this);

        this.add(proyectosPanel);
        this.add(recursos);
        this.add(equipo);
        this.add(actividades);
        this.add(proyectos);
        this.add(background);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source.equals(proyectos)){
            proyectosPanel.setVisible(true);
            recursosPanel.setVisible(false);
            scroll.setVisible(false);
            actividadesPanel.setVisible(false);

            proyectos.nuevoColor(new Color(0xFFFFFF));
            actividades.nuevoColor(new Color(0x6A6A6A));
            scroll.setBackground(new Color(0x6A6A6A));
            recursos.nuevoColor(new Color(0x6A6A6A));

            this.add(proyectosPanel);
        } else if (source.equals(actividades)){
            proyectosPanel.setVisible(false);
            recursosPanel.setVisible(false);
            scroll.setVisible(false);
            actividadesPanel.setVisible(true);

            proyectos.nuevoColor(new Color(0x6A6A6A));
            actividades.nuevoColor(new Color(0xFFFFFF));
            scroll.setBackground(new Color(0x6A6A6A));
            recursos.nuevoColor(new Color(0x6A6A6A));

            this.add(actividadesPanel);
        } else if (source.equals(equipo)){
            proyectosPanel.setVisible(false);
            recursosPanel.setVisible(false);
            scroll.setVisible(true);
            actividadesPanel.setVisible(false);

            proyectos.nuevoColor(new Color(0x6A6A6A));
            actividades.nuevoColor(new Color(0x6A6A6A));
            equipo.nuevoColor(new Color(0xFFFFFF));
            recursos.nuevoColor(new Color(0x6A6A6A));

            this.add(scroll);
        } else if (source.equals(recursos)){
            proyectosPanel.setVisible(false);
            recursosPanel.setVisible(true);
            scroll.setVisible(false);
            actividadesPanel.setVisible(false);

            proyectos.nuevoColor(new Color(0x6A6A6A));
            actividades.nuevoColor(new Color(0x6A6A6A));
            scroll.setBackground(new Color(0x6A6A6A));
            recursos.nuevoColor(new Color(0xFFFFFF));

            this.add(recursosPanel);
        }
    }
}

class Botones extends JButton {
    int width=1920/8;
    int height=80;
    Color bgColor;
    public Botones(Color c) {

        this.bgColor=c;
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setSize(this.width, this.height);
        this.setFont(new Font("Montserrat SemiBold", Font.BOLD, 20));
        this.setForeground(new Color(99, 99, 99));
        this.setLayout(null);
        this.setHorizontalAlignment(JTextField.CENTER);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);//para darle el efecto de bordes redondeados
        g2d.setColor(bgColor);
        g2d.drawRect(0, 0, this.width, this.height);
    }

    public void nuevoColor(Color c){
        this.bgColor=c;
        cambiarColor();
        this.repaint();
    }
    public void cambiarColor(){
        this.setBackground(bgColor);
    }

    public static class scroll {
    }
}