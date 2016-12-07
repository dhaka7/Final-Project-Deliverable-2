
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CreditView extends JPanel {

    JTextArea text;

    CreditView() {
        text = new JTextArea("Credits:\n\n * Dhaka Kharel \n\n * Oscar Sanjuan \n\n * Andy Lam ");
        add(text);
        
        String[] subjects = new String[] {"Math", "Geography", "Science"};
        JComboBox<String> subjectList = new JComboBox<>(subjects);
        
        add(subjectList);
        String selectSubject = (String)subjectList.getSelectedItem();
        System.out.println("Subject selected:  " + selectSubject);
    }
}
