
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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

        add(mainButton);
        add(optionsButton);
        add(instructionsButton);
        add(highScoreButton);
        add(creditsButton);

    }
}
