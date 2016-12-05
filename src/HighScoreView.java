
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lapper
 */
public class HighScoreView extends JPanel {
   
   
    JTextArea instructions;

    HighScoreView(HighScoreView hs_view) {
        setLayout(new FlowLayout());
        instructions = new JTextArea("STUFFFF");
        add(instructions);
    }
}
