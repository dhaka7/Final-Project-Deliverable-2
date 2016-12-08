
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lapper
 */
public class CongratsViewBottomPanel extends JPanel {

    JLabel userScoreLabel;
    JLabel userNameLabel;

    public CongratsViewBottomPanel(String name, int score) {
        
        super();
        userNameLabel = new JLabel(" Congrats " + name + ".");
        userScoreLabel = new JLabel("Your Total Score Was " + String.valueOf(score) + ".");

        add(userScoreLabel);
        add(userNameLabel);

    }
}
