
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainView extends JPanel {

    OptionsView o_view;
    JLabel textField;
    JLabel difficulty;
    JLabel userName;
    
    MainView() {
        difficulty = new JLabel("Current Difficulty");
        textField = new JLabel("Please Set Your Settings");
        add(textField);
        add(difficulty);
    }

    public JLabel getTextField() {
        return textField;
    }

    public void setTextField(JLabel textField) {
        this.textField = textField;
    }

    public JLabel getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty.setText(difficulty);
    }

    public JLabel getUserName() {
        return userName;
    }

    public void setUserName(JLabel userName) {
        this.userName = userName;
    }
}
