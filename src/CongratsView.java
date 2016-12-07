
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
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
public class CongratsView extends JPanel {

    JTextArea picture;

    JButton congratsButton;
    CongratsViewBottomPanel congratsBottom;
    
    CongratsView(String name, int score) {
        
        congratsBottom = new CongratsViewBottomPanel(name, score);
        
        picture = new JTextArea("Congradulations! \n\n * All questions on this level are finished!");
        congratsButton = new JButton(new ImageIcon("src/pkgfinal/Image/congrats.png"));

        setLayout(new BorderLayout());

        add(picture, BorderLayout.NORTH);
        add(congratsButton, BorderLayout.CENTER);
        add(congratsBottom, BorderLayout.SOUTH);
 
    }


    public JButton getCongratsButton() {
        return congratsButton;
    }

    
    public JTextArea getPicture() {
        return picture;
    }

    public void setPicture(JTextArea picture) {
        this.picture = picture;
    }
    
    public void setCongratsButton(JButton CongratsButton) {
        this.congratsButton = CongratsButton;
    }

    public void addCongratsButtonListener(ActionListener al) {
        this.congratsButton.addActionListener(al);
    }
}
