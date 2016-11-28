
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ohs5008
 */
public class GameView extends JPanel {
    
    
    JLabel label;
    JButton test;
    GameView(){
    label = new JLabel("Working");
    test = new JButton("test");
    
    
    add(label);
    add(test);
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JButton getTest() {
        return test;
    }

    public void setTest(JButton test) {
        this.test = test;
    }
    
    public void addTestButtonListener(ActionListener al) {
        this.test.addActionListener(al);
    }
}
