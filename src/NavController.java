
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NavController {

    NavModel n_model;
    NavView n_view;
    //Instance Variables for Options Model, View, and Controller
    OptionsModel o_model;
    OptionsView o_view;
    OptionsController o_Controller;
    InstructionView i_view;
    CreditView c_view;
    // TODO: Create instances of your MainModel and MainController once you implement them
    MainView m_view;

    public NavController(NavModel n_model, NavView n_view) {
        this.n_model = n_model;
        this.n_view = n_view;
        o_model = new OptionsModel();
        o_view = new OptionsView(o_model);
        o_Controller = new OptionsController(o_model, o_view);
        m_view = new MainView();
        i_view = new InstructionView();
        c_view = new CreditView();
        n_view.addOptionsButtonListener(new OptionsButtonListener());
        n_view.addMainButtonListener(new MainButtonListener());
        n_view.addInstructionsButtonListener(new InstructionButtonListener());
        n_view.addCreditsButtonLIstener(new CreditButtonListener());
        o_view.addSaveButtonListener(new OptionSaveButtonListener());
    }

    class OptionsButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //Pass an Options View object to our Navigation View
            n_view.switchToOptionsPanel(o_view);
        }
    }

    class MainButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //Pass a Main View object to our Navigation View
            n_view.switchToMainPanel(m_view);
        }
    }

    class InstructionButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //Pass a Main View object to our Navigation View
            n_view.swtichToInstructionsPanel(i_view);
        }
    }

    class CreditButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //Pass a Main View object to our Navigation View
            n_view.switchToCreditsPanel(c_view);
        }
    }

    class OptionSaveButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent ae) {
            o_view.getSettingSaveState().setText("Saved");
            m_view.getDifficulty().setText("Difficulty: " + String.valueOf(o_view.getDifficulty().getValue()));
            m_view.getUserName().setText("Username: " + o_view.getUserName().getText());
            m_view.getSubject().setText("Subect: "+ o_view.getSubject().getText());
            o_view.getUserNameLabel().setText("Username: " + o_view.getUserName().getText());
            o_view.getDifficultyLabel().setText("Difficulty: " + String.valueOf(o_view.getDifficulty().getValue()));
            o_view.getSubjectSaveState().setText("Subect: "+ o_view.getSubject().getText());
        }
    }
}
