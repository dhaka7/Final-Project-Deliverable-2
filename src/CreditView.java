
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CreditView extends JPanel {

    JTextArea text;
    Timer t;

    CreditView() {
        text = new JTextArea("Credits:\n\n * Dhaka Kharel \n\n * Oscar Sanjuan \n\n * Andy Lam ");
        setBackground(Color.ORANGE);
        add(text);    
    }
}
