
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SplashScreenPanel extends JPanel {

    JButton splashButton;
    JLabel optionsLabel;
    JButton welcomeButton;

    SplashScreenPanel() {
        splashButton = new JButton(new ImageIcon("src/pkgfinal/Image/final pic.png"));
        welcomeButton = new JButton("Welcome to TRIvia!");
        add(welcomeButton);
        add(splashButton);
        setSize(900, 700);

    }

}
