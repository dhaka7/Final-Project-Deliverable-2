
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CreditView extends JPanel {

    JTextArea text;

    CreditView() {
        text = new JTextArea("Credits:\n Dhaka Kharel \n Oscar Sanjuan \n Andy Lam ");
        add(text);
    }
}