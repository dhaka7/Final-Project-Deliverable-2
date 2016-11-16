
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Instructions extends JPanel{
    
    JTextArea instructions;
    JButton back;
    
    Instructions()
    {
        setLayout(new FlowLayout());
        
        Instructions = new JTextArea("");
        
        back = new JButton("Return");
        add(Instructions); 
        add(back);
    }
    
}
