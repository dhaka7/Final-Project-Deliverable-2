
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SplashScreenPanel extends JPanel {

    JButton splashButton;
    JLabel optionsLabel;
    JButton welcomeButton;
    JLabel hint;

    SplashScreenPanel() {
        setLayout(new BorderLayout());
        splashButton = new JButton(new ImageIcon("src/pkgfinal/Image/final pic.png"));
        welcomeButton = new JButton(" Welcome to TRIvia! ");
        hint = new JLabel(" Where we test your cranium! ");
        add(welcomeButton, BorderLayout.NORTH);
        add(splashButton, BorderLayout.CENTER);
        add(hint, BorderLayout.SOUTH);
        setSize(900, 700);

    }

}
