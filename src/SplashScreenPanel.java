
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SplashScreenPanel extends JPanel {
    JButton splashButton;
    JLabel optionsLabel;
    SplashScreenPanel()
    {
         splashButton = new JButton(new ImageIcon("file:/Users/RamsonDhaka/Desktop/final pic.png"));            
            add(splashButton);
            
            optionsLabel = new JLabel("No options selected yet.");
            add(optionsLabel);
    }
    
}
