import javax.swing.*;
import java.awt.*;

public class Mainpage extends JFrame {
    private JPanel mainMainPagePanel;
    private JButton aktenNrButton;
    private JButton uploadButton;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JPanel LeftTopPanel;
    private JPanel MidTopPanel;
    private JPanel RightTopPanel;
    private JScrollPane TreeMenu;
    private JPanel DirectoryDisplay;
    private JPanel Directoryinformation;
    private JButton downloadButton;
    private JButton adminButton;


    public Mainpage(){
        LeftTopPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        MidTopPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        RightTopPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        TreeMenu.setBorder(BorderFactory.createLineBorder(Color.black));
        DirectoryDisplay.setBorder(BorderFactory.createLineBorder(Color.black));
        Directoryinformation.setBorder(BorderFactory.createLineBorder(Color.black));
        Directoryinformation.setSize(100,1000);
        setContentPane(mainMainPagePanel);

    }

    public static void main(String[] args){
        Mainpage mainpage =new Mainpage();
        mainpage.setTitle("Welcome");
        mainpage.setResizable(false);
        mainpage.setLocationRelativeTo(null);
        mainpage.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainpage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainpage.setVisible(true);
    }
}
