
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SplashScreenPanel extends JPanel {

    JLabel splashButton;
    JLabel optionsLabel;
    JButton welcomeButton;
    JLabel hint;

    SplashScreenPanel() {
        setLayout(new BorderLayout());
        splashButton = new JLabel(new ImageIcon("src/pkgfinal/Image/final pic.png"));
        welcomeButton = new JButton(" Welcome to TRIvia! ");
        hint = new JLabel(" Where we test your knowledge in Math, Geography, History and Science!");
        add(welcomeButton, BorderLayout.NORTH);
        add(splashButton, BorderLayout.CENTER);
        add(hint, BorderLayout.SOUTH);
        setSize(900, 700);

    }

}
