
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Credits extends JPanel {
    JButton goBack;
    JTextArea text;
    
    Credits(){
        text = new JTextArea("Credits: \n Dhaka Kharel \n Oscar Sanjuan \n Andy Lam ");
        goBack = new JButton("Return");
        
        add(text);
        add(goBack);
        
    }
    
}
