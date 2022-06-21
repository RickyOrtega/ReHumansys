import javax.swing.*;

import Mods.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LogIn extends JPanel implements ActionListener {

    JFrame frame = new JFrame("Log In");
    PanelMod backPanel = new PanelMod();
    PanelMod logInPanel = new PanelMod();
    JLabel title = new JLabel();
    iconoUsario icono;
    leerUsuario read;
    iconoContraseña icono2;

    leerContrasegna read2;
    entrar entrar;

/*    String usuario = "ChiquiChiquiBomBom";
    String contrasegna = "040102829";*/

    String usuario = "123";
    String contrasegna = "123";

    FrameDash frameDashboard=new FrameDash();
    JLabel error = new JLabel();
    public LogIn(){

        frameDashboard.setLayout(null);
        frameDashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameDashboard.setVisible(false);

        this.setSize(720, 540);
        this.setLayout(null);
        this.setVisible(true);

        backPanel.setSize(720, 540);
        backPanel.setLocation(0, 0);
        backPanel.setVisible(true);
        backPanel.setLayout(null);
        backPanel.setColor1(new Color(68, 19, 110, 100));
        backPanel.setColor2(new Color(46, 216, 186, 100));

        logInPanel.setSize(360, 420);
        logInPanel.setLocation(180, 40);
        logInPanel.setVisible(true);
        logInPanel.setLayout(null);
        logInPanel.setColor1(new Color(68, 19, 110, 50));
        logInPanel.setColor2(new Color(46, 216, 186, 50));

        title.setText("Iniciar sesión".toUpperCase());
        title.setSize(720, 100);
        title.setLocation(0, 80);
        title.setFont(new Font("Montserrat SemiBold", Font.BOLD, 30));
        title.setForeground(new Color(91, 91, 91));
        title.setVisible(true);
        title.setHorizontalAlignment(JLabel.CENTER);

        icono = new iconoUsario(new Color(255, 255, 255), 50, 50);
        icono.setLocation(235, 180);

        read = new leerUsuario(new Color(255, 255, 255), 200, 50);
        read.setText("Usuario");
        read.setForeground(new Color(153, 153, 153));
        read.setLocation(285, 180);
        read.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if(read.getText().equals("Usuario")){
                    read.setText("");
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if(read.getText().equals("")){
                    read.setText("Usuario");
                }
            }
        });

        icono2 = new iconoContraseña(new Color(255, 255, 255), 50, 50);
        icono2.setLocation(235, 250);

        read2 = new leerContrasegna(new Color(255, 255, 255), 200, 50);
        read2.setLocation(285, 250);

        entrar = new entrar(new Color(56, 157, 174), 250, 50);
        entrar.setLocation(235, 350);
        entrar.setText("Entrar".toUpperCase());
        entrar.addActionListener(this);

        error.setText("<html><body><p><center>Usuario o contraseña incorrectos</center></p></body></html>");
        error.setHorizontalAlignment(JLabel.CENTER);
        error.setSize(360, 50);
        error.setLocation(0, 350);
        error.setFont(new Font("Montserrat SemiBold", Font.BOLD, 10));
        error.setForeground(new Color(67, 67, 67));
        error.setVisible(false);

        logInPanel.add(error);
        this.add(entrar);
        this.add(read2);
        this.add(icono2);
        this.add(read);
        this.add(icono);
        this.add(title);
        this.add(logInPanel);
        this.add(backPanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==entrar){
            if(read.getText().equals(usuario) && read2.getText().equals(contrasegna)){
                frameDashboard.setVisible(true);
                this.setVisible(false);
                this.getParent().remove(this);
            }
        }
        if((read.getText().equals(usuario))==false || (read2.getText().equals(contrasegna))==false){
            if(read.getText().isEmpty() || read2.getText().isEmpty()){
                error.setText("<html><body><p><center>Por favor, ingrese sus credenciales de inicio de sesión.</center></p></body></html>");
                error.setVisible(true);
            }else if(read.getText().equalsIgnoreCase(usuario)==true || read2.getText().equalsIgnoreCase(contrasegna)==true){
                error.setText("<html><body><p><center>Recuerde activar/desactivar las mayúsculas, ya que el programa las detecta.</center></p></body></html>");
                error.setVisible(true);
            }else{
                error.setText("<html><body><p><center>Usuario o contraseña incorrectos.</center></p></body></html>");
                error.setVisible(true);
            }
        }
    }
}

class iconoUsario extends JPanel{
    private int width;
    private int height;
    private Color color;
    public iconoUsario(Color bgColor,int width,int height){
        this.width = width;
        this.height = height;
        this.color = bgColor;
        this.setBackground(bgColor);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setSize(this.width, this.height);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);//para darle el efecto de bordes redondeados
        g2d.setColor(new Color(191, 191, 191));
        g2d.setStroke(new BasicStroke(3));
        g2d.drawRect(0, 0, this.width, this.height);
        g2d.setColor(new Color(99, 99, 99));
        g2d.fillArc(10, 25, this.width-20, this.height-20, 360, 180);
        g2d.setColor(new Color(255, 255, 255));
        g2d.fillOval(13, 9, this.width-26, this.height-26);
        g2d.setColor(new Color(99, 99, 99));
        g2d.fillOval(15, 10, this.width-30, this.height-30);
    }
}
class leerUsuario extends JTextField{
    private int width;
    private int height;
    private Color color;

    public leerUsuario(Color bgColor,int width,int height){
        this.width = width;
        this.height = height;
        this.color = bgColor;
        this.setForeground(new Color(99, 99, 99));
        this.setCaretColor(new Color(99, 99, 99));
        this.setBackground(bgColor);
        this.setSize(this.width, this.height);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setFont(new Font("Montserrat SemiBold", Font.BOLD, 20));
        this.setLayout(null);
        this.setHorizontalAlignment(JTextField.CENTER);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(191, 191, 191));
        g2d.setStroke(new BasicStroke(3));
        g2d.drawRect(0, 0, this.width, this.height);
        g2d.setColor(new Color(99, 99, 99));
    }
}
class iconoContraseña extends JPanel{
    private int width;
    private int height;
    private Color color;
    public iconoContraseña(Color bgColor,int width,int height){
        this.width = width;
        this.height = height;
        this.color = bgColor;
        this.setBackground(bgColor);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setSize(this.width, this.height);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);//para darle el efecto de bordes redondeados
        g2d.setColor(new Color(191, 191, 191));
        g2d.setStroke(new BasicStroke(3));
        g2d.drawRect(0, 0, this.width, this.height);
        g2d.setColor(new Color(99, 99, 99));
        g2d.fillRoundRect(10, 20, this.width-20, this.height-30, 6, 6);
        g2d.drawArc(15, 5, this.width-30, this.height-30, 360, 180);
        g2d.setColor(color);
        g2d.fillOval(22, 22, this.width-44, this.height-44);
        g2d.fillRoundRect(23, 25, this.width-46, this.height-42, 6, 6);
    }
}
class leerContrasegna extends JPasswordField{

    private int width;
    private int height;
    private Color color;

    public leerContrasegna(Color bgColor, int width, int height) {
        this.width = width;
        this.height = height;
        this.color = bgColor;
        this.setForeground(new Color(99, 99, 99));
        this.setBackground(bgColor);
        this.setCaretColor(new Color(99, 99, 99));
        this.setSize(this.width, this.height);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setFont(new Font("Montserrat SemiBold", Font.BOLD, 20));
        this.setLayout(null);
        this.setHorizontalAlignment(JTextField.CENTER);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(191, 191, 191));
        g2d.setStroke(new BasicStroke(3));
        g2d.drawRect(0, 0, this.width, this.height);
    }
}
class entrar extends JButton{
    private int width;
    private int height;
    private Color color;
    public entrar(Color bgColor, int width, int height) {

        this.color = bgColor;
        this.width = width;
        this.height = height;
        this.setBackground(bgColor);
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
        g2d.setColor(new Color(91, 91, 91));
        g2d.setStroke(new BasicStroke(3));
        g2d.drawRect(0, 0, this.width, this.height);
    }
}