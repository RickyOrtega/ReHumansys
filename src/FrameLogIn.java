import javax.swing.*;

public class FrameLogIn extends JFrame {
    private LogIn entrada=new LogIn();
    public FrameLogIn() {
        setTitle("Humansys");
        setSize(720,540);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        add(entrada);
    }
}