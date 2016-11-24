
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class OptionsView extends JPanel {

    JButton retButton;
    JTextField playerName;
    JLabel EnterDiff;
    JSlider difficulty;
    JButton saveSetting;
    JLabel settingSaveState;

    OptionsModel o_model;

    OptionsView(OptionsModel o_model) {
        this.o_model = o_model;

        playerName = new JTextField("--Enter Player Name--");
        difficulty = new JSlider(JSlider.HORIZONTAL, 1, 10, 5);
        difficulty.setMajorTickSpacing(1);
        difficulty.setPaintLabels(true);
        difficulty.setPaintTicks(true);

        EnterDiff = new JLabel(" Enter Difficulty:");

        saveSetting = new JButton("Save Settings");
        // It may be useful to have a Save & Return button
        //retButton = new JButton("Save and Return");
        settingSaveState = new JLabel("Settings Not Saved");
        add(settingSaveState);
        add(playerName);
        add(EnterDiff);
        add(difficulty);
        add(saveSetting);
        
        //add(retButton);               
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

    public JTextField getPlayerName() {
        return playerName;
    }

    public void setPlayerName(JTextField playerName) {
        this.playerName = playerName;
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

    public void setDifficulty(JSlider difficulty) {
        this.difficulty = difficulty;
    }
    public void addSaveSettingButtonListener(ActionListener al){
        saveSetting.addActionListener(al);
    }

    public JButton getSaveSetting() {
        return saveSetting;
    }

    public void setSaveSetting(JButton saveSetting) {
        this.saveSetting = saveSetting;
    }
    
}
