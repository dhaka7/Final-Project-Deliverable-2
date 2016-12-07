
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class InstructionView extends JPanel {

    JTextArea instructions;

    InstructionView() {
        setLayout(new FlowLayout());
        instructions = new JTextArea(" You Will Be Quized On Four Different Subjects. \n\nFirst, Set You UserName, Set Difficulty, and then choose a Subject in Options. \n\nThen Click Save Settings. \n\nFinally, Please Go Back To The Main Menu and Press Play Game!. \n\nENJOY THE GAME!");
        add(instructions);
    }
}
