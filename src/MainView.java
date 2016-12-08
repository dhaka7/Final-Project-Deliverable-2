
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainView extends JPanel {

    OptionsView o_view;
    JLabel textField;
    JLabel difficulty;
    JLabel userName;
    GridLayout grid;
    JButton playGame;
    JLabel subject;

    MainView() {
        grid = new GridLayout(10, 1);
        setLayout(grid);
        subject = new JLabel(" Subject Not Set! ");
        difficulty = new JLabel(" Difficulty Level Not Set! ");
        textField = new JLabel(" Please, Set Your Settings ");
        userName = new JLabel(" Username Not Set! ");
        playGame = new JButton(" Play Game! ");
        add(textField);
        add(difficulty);
        add(userName);
        add(subject);
        add(playGame);
    }

    public JButton getPlayGame() {
        return playGame;
    }

    public void setPlayGame(JButton playGame) {
        this.playGame = playGame;
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

    public void addPlayGameButtonListener(ActionListener al) {
        this.playGame.addActionListener(al);
    }
}
