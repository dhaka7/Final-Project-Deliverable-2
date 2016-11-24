
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class OptionsController {

    OptionsModel o_model;
    OptionsView o_view;
    MainView m_view;

    OptionsController(OptionsModel o_model, OptionsView o_view) {
        m_view = new MainView();
        this.o_model = o_model;
        this.o_view = o_view;
        o_view.addSaveSettingButtonListener(new ButtonListener());
    }

    class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent ae) {
            o_view.getSettingSaveState().setText("Saved");
            m_view.getDifficulty().setText("1");
        }
    }
}
