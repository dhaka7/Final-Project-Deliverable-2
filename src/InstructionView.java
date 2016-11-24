
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class InstructionView extends JPanel {

    JTextArea instructions;

    InstructionView() {
        setLayout(new FlowLayout());
        instructions = new JTextArea("Please Do Stuff");
        add(instructions);
    }
}
