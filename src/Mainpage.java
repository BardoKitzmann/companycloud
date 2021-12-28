import javax.swing.*;
import java.awt.*;

public class Mainpage extends JFrame {
    private JPanel mainMainPagePanel;

    public Mainpage(){
    }

    public static void main(String[] args){
        Mainpage mainpage =new Mainpage();
        mainpage.setTitle("Mainpage");
        mainpage.setResizable(false);
        mainpage.setLocationRelativeTo(null);
        mainpage.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainpage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainpage.setVisible(true);
    }
}
