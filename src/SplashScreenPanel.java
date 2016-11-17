
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SplashScreenPanel extends JPanel {
    JButton splashButton;
    JLabel optionsLabel;
    SplashScreenPanel()
    {
         splashButton = new JButton(new ImageIcon("src/pkgfinal/Image/final pic.png"));            
            add(splashButton);
            setSize(900, 700);
            

    }
    
}
