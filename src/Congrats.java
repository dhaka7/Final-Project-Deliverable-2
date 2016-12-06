
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ohs5008
 */
public class Congrats extends JPanel {
      JTextArea text;
      JButton CongratsButton;

    Congrats() {
        text = new JTextArea("Congradulations! \n\n * You have mastered every subject!");
        CongratsButton = new JButton(new ImageIcon("src/pkgfinal/Image/congrats.png"));

        add(text);
    }

}
