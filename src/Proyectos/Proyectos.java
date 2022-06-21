package Proyectos;

import javax.swing.*;
import java.awt.*;

public class Proyectos extends JPanel {
    public Proyectos() {
        super();
        this.setLayout(new FlowLayout());
        this.setSize((1920 / 8) * 7, 1080);
        this.setLocation(1920 / 8, 0);
        this.setBackground(new Color(0xFFFFFF));
    }
}
class mostrarProyectos extends JPanel {
    public mostrarProyectos() {
        super();
        this.setLayout(new FlowLayout());
        this.setSize(300, 300);
        this.setLocation(0, 0);
        this.setBackground(new Color(0xFFFFFF));
        this.setVisible(true);
    }
}