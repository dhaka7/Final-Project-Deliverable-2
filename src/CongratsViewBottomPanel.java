
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
    JLabel timeLabel;

    public CongratsViewBottomPanel(String name, int score, int totalTime) {
        
        super();
        userNameLabel = new JLabel(" Congrats " + name + ".");
        userScoreLabel = new JLabel("Your Total Score Was " + String.valueOf(score) + ".");
        timeLabel = new JLabel("Your Total Time Was " + String.valueOf(totalTime) + "s.");
        
        add(userScoreLabel);
        add(userNameLabel);
        add(timeLabel);

    }
}
