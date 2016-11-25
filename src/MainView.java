
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainView extends JPanel {

    OptionsView o_view;
    JLabel textField;
    JLabel difficulty;
    JLabel userName;
    GridLayout grid;
    JButton playGame;

    MainView() {
        grid = new GridLayout(10,1);
        setLayout(grid);
        difficulty = new JLabel("Difficulty Not Set!");
        textField = new JLabel("Please Set Your Settings");
        userName = new JLabel("Username Not Set!");
        playGame = new JButton ("Play Game!");
        add(textField);
        add(difficulty);
        add(userName);
        add(playGame);
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

    public void setDifficulty(JLabel difficulty) {
        this.difficulty = difficulty;
    }

    public JLabel getUserName() {
        return userName;
    }

    public void setUserName(JLabel userName) {
        this.userName = userName;
    }
}
