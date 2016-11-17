
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SplashScreenPanel extends JPanel {
    JButton splashButton;
    JLabel optionsLabel;
    SplashScreenPanel()
    {
         splashButton = new JButton(new ImageIcon("/Users/RamsonDhaka/NetBeansProjects/Final Project Deliverable #2/final pic.png"));            
            add(splashButton);
            setSize(900, 700);
            

    }
    
}
