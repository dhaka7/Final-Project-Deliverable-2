
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
        
        instructions = new JTextArea("");
        
        back = new JButton("Return");
        add(instructions); 
        add(back);
    }
    
}
