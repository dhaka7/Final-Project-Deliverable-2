
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class InstructionView extends JPanel {

    JTextArea instructions;

    InstructionView() {
        setLayout(new FlowLayout());
        instructions = new JTextArea("You Will Be Quized On Three Different Subjects. \nFirst Set You UserName, Difficulty, and Subject in Options. \nThen Click Save Settings. \nFinally Go Back To The Main Menu and Press Play Game!. ENJOY!");
        add(instructions);
    }
}
