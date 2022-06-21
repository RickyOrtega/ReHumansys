import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameDash extends JFrame{
    private dash dashboard = new dash(1920,1080);
    public FrameDash(){

        setSize(1920,1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(new Color(0xD5D5D5));
        setTitle("Dashboard");
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultLookAndFeelDecorated(false);
        add(dashboard);
    }
}