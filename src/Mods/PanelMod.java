package Mods;

import javax.swing.*;
import java.awt.*;

public class PanelMod extends JPanel {

    int x=0;
    int y=0;
    private Color color1;
    private Color color2;
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        GradientPaint gp = new GradientPaint(cambiarValorX(y),cambiarValorY(x),getColor1(),720,height,getColor2());
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public Color getColor2() {
        return color2;
    }

    public int cambiarValorX(int y){
        //Desplazamiento norte izquierda a derecha sobre el eje x
        if(y==0&&x<=720){
            x++;
        }
        if(y==0&&x==720){
            x=720;
        }
        return x;
    }

    public int cambiarValorY(int x) {
        //Desplazamiento este arriba hacia abajo sobre el eje y
        if(x>=720 && y>=0 && y<200){
            y++;
        }
        return y;
    }
}