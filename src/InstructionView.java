
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class InstructionView extends JPanel{
    
    JTextArea instructions;
    JButton back;
    
    InstructionView()
    {
        setLayout(new FlowLayout());
        
        instructions = new JTextArea("");
        
        back = new JButton("Return");
        add(instructions); 
        add(back);
    }
    
}
