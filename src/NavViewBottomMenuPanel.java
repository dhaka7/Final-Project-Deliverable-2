
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

public class NavViewBottomMenuPanel extends JPanel{

    JButton mainButton;
    JButton optionsButton;
    JButton instructionsButton;
    JButton creditsButton;
    JButton highScoreButton;
    
    public NavViewBottomMenuPanel() {
        super();
        mainButton = new JButton("Main Menu");
        optionsButton = new JButton("Options");
        instructionsButton = new JButton("Instructions");
        creditsButton = new JButton("Credits");
        highScoreButton = new JButton("See High Scores");

        mainButton.setBackground(Color.yellow);
        optionsButton.setBackground(Color.CYAN);
        instructionsButton.setBackground(Color.MAGENTA);
        highScoreButton.setBackground(Color.PINK);
        creditsButton.setBackground(Color.ORANGE);
        add(mainButton);
        add(optionsButton);
        add(instructionsButton);
        add(highScoreButton);
        add(creditsButton);

    }
}
