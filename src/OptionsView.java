
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class OptionsView extends JPanel {

    JButton retButton;
    JTextField userName;
    JLabel EnterDiff;
    JSlider difficulty;
    JButton saveSetting;
    JLabel settingSaveState;
    
    JLabel difficultyLabel;
    JLabel userNameLabel;

    OptionsModel o_model;
    MainView m_view;
    GridLayout grid;
    OptionsView(OptionsModel o_model) {
        grid = new GridLayout(10,3);
        setLayout(grid);
        this.o_model = o_model;
        userName = new JTextField("--Enter Player Name--");
        difficulty = new JSlider(JSlider.HORIZONTAL, 1, 10, 5);
        difficulty.setMajorTickSpacing(1);
        difficulty.setPaintLabels(true);
        difficulty.setPaintTicks(true);

        EnterDiff = new JLabel(" Enter Difficulty:");

        saveSetting = new JButton("Save Settings");
        // It may be useful to have a Save & Return button
        //retButton = new JButton("Save and Return");
        settingSaveState = new JLabel("Settings Not Saved");
        difficultyLabel = new JLabel("Difficulty Not Set!");
        userNameLabel = new JLabel("Username Not Set!");
        add(userName);
        add(EnterDiff);
        add(difficulty);
        add(saveSetting);
        add(settingSaveState);
        add(new JLabel());
        add(difficultyLabel);
        add(userNameLabel);
        //add(retButton);               
    }

    public void addSaveButtonListener(ActionListener al) {
        this.saveSetting.addActionListener(al);
    }

    public JLabel getSettingSaveState() {
        return settingSaveState;
    }

    public void setSettingSaveState(JLabel settingSaveState) {
        this.settingSaveState = settingSaveState;
    }

    public JButton getRetButton() {
        return retButton;
    }

    public void setRetButton(JButton retButton) {
        this.retButton = retButton;
    }

    public JTextField getUserName() {
        return userName;
    }

    public void setUserName(JTextField playerName) {
        this.userName = playerName;
    }

    public JLabel getEnterDiff() {
        return EnterDiff;
    }

    public void setEnterDiff(JLabel EnterDiff) {
        this.EnterDiff = EnterDiff;
    }

    public JSlider getDifficulty() {
        return difficulty;
    }

    public JLabel getDifficultyLabel() {
        return difficultyLabel;
    }

    public void setDifficultyLabel(JLabel difficultyLabel) {
        this.difficultyLabel = difficultyLabel;
    }

    public JLabel getUserNameLabel() {
        return userNameLabel;
    }

    public void setUserNameLabel(JLabel userNameLabel) {
        this.userNameLabel = userNameLabel;
    }

    public void setDifficulty(JSlider difficulty) {
        this.difficulty = difficulty;
    }

    public JButton getSaveSetting() {
        return saveSetting;
    }

    public void setSaveSetting(JButton saveSetting) {
        this.saveSetting = saveSetting;
    }

}
