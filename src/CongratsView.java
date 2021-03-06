
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class CongratsView extends JPanel {

    JTextArea picture;
    JLabel congratsPicture;
    CongratsViewBottomPanel congratsBottom;
    
    CongratsView(String name, int score, int totalTime) {
        
        congratsBottom = new CongratsViewBottomPanel(name, score, totalTime);
        picture = new JTextArea("Congradulations! \n\n * All questions on this level are finished!");
        congratsPicture = new JLabel(new ImageIcon("src/pkgfinal/Image/congrats.png"));

        setLayout(new BorderLayout());
        
        setBackground(Color.RED);
        if(score > 10000){
        setBackground(Color.GREEN);
        }
        add(picture, BorderLayout.NORTH);
        add(congratsPicture, BorderLayout.CENTER);
        add(congratsBottom, BorderLayout.SOUTH);
 
    }


    public JLabel getCongratsButton() {
        return congratsPicture;
    }

    
    public JTextArea getPicture() {
        return picture;
    }

    public void setPicture(JTextArea picture) {
        this.picture = picture;
    }
    
    public void setCongratsButton(JLabel CongratsButton) {
        this.congratsPicture = CongratsButton;
    }

}
