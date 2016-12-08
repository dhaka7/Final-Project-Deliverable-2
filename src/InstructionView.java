
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class InstructionView extends JPanel {

    JTextArea instructions;
GridLayout grid = new GridLayout(1,1);
    InstructionView() {
        setLayout(grid);
        instructions = new JTextArea(" You Will Be Quized On Four Different Subjects. \n\nFirst, Set You UserName, Set Difficulty, and then choose a Subject in Options. \n\nThen Click Save Settings. \n\nFinally, Please Go Back To The Main Menu and Press Play Game!. \n"
                + "\nThe Higher The Difficulty Is, The More Questions You Get. The Longer You Take To Answer Your Question, The More Points You Lose.\n \n GOOD LUCK AND ENJOY THE GAME!");
        instructions.setForeground(Color.pink);
        setBackground(Color.MAGENTA);
        
        
        instructions.setLineWrap(true);
        instructions.setWrapStyleWord(true);
        
        add(instructions);
        
        instructions.setForeground(Color.RED);
        instructions.setBackground(Color.yellow);
    }
}
