
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
    JLabel subject;

    MainView() {
        grid = new GridLayout(10,1);
        setLayout(grid);
        subject = new JLabel("Subject Not Set!");
        difficulty = new JLabel("Difficulty Not Set!");
        textField = new JLabel("Please Set Your Settings");
        userName = new JLabel("Username Not Set!");
        playGame = new JButton ("Play Game!");
        add(textField);
        add(difficulty);
        add(userName);
        add(subject);
        add(playGame);
    }

    public JLabel getSubject() {
        return subject;
    }

    public void setSubject(JLabel subject) {
        this.subject = subject;
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
