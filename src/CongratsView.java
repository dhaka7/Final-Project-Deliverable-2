
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class CongratsView extends JPanel {

    JTextArea picture;
    JLabel congratsPicture;
    CongratsViewBottomPanel congratsBottom;
    
    CongratsView(String name, int score) {
        
        congratsBottom = new CongratsViewBottomPanel(name, score);
        picture = new JTextArea("Congradulations! \n\n * All questions on this level are finished!");
        congratsPicture = new JLabel(new ImageIcon("src/pkgfinal/Image/congrats.png"));

        setLayout(new BorderLayout());

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
