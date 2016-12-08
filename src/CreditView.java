import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CreditView extends JPanel {

    JTextArea text;
    Timer t;

    CreditView() {
        text = new JTextArea("Credits:\n\n * Dhaka Kharel \n\n * Oscar Sanjuan \n\n * Andy Lam ");
        add(text);    
        
        t = new Timer();
        t.startTimer();
        t.stopTimer();
        
        t.displayTime();
    }
}
