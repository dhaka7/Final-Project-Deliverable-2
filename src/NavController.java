
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
    GameView g_view;
    GameController g_controller;
    int gameCounter = 2;

    public NavController(NavModel n_model, NavView n_view) {
        this.n_model = n_model;
        this.n_view = n_view;
        o_model = new OptionsModel();
        o_view = new OptionsView(o_model);
        o_Controller = new OptionsController(o_model, o_view);
        m_view = new MainView();
        i_view = new InstructionView();
        c_view = new CreditView();
        g_view = new GameView();
        g_controller = new GameController(g_view);

        n_view.addOptionsButtonListener(new OptionsButtonListener());
        n_view.addMainButtonListener(new MainButtonListener());
        n_view.addInstructionsButtonListener(new InstructionButtonListener());
        n_view.addCreditsButtonLIstener(new CreditButtonListener());
        o_view.addSaveButtonListener(new OptionSaveButtonListener());
        m_view.addPlayGameButtonListener(new PlayGameButtonListener());
        g_view.addTestButtonListener(new NextButtonListener());

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
            m_view.getSubject().setText("Subect: " + o_view.getSubject().getText());
            o_view.getUserNameLabel().setText("Username: " + o_view.getUserName().getText());
            o_view.getDifficultyLabel().setText("Difficulty: " + String.valueOf(o_view.getDifficulty().getValue()));
            o_view.getSubjectSaveState().setText("Subect: " + o_view.getSubject().getText());
        }
    }

    class NextButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent ae) {
            if ((g_view.getTotalQuestionNumber() + 2) > ((gameCounter + 2) / 2)) {

                System.out.println("First If total question and game counter" + g_view.getTotalQuestionNumber() + gameCounter);
                if (gameCounter % 2 != 0) {
                    g_view.setAnswer(g_view.getCurrentQuestionNumber());
                    System.out.println("current question number for answer" + g_view.getCurrentQuestionNumber());
                    g_view.increaseCurrentQuestionNumber();
                    System.out.println("Counter " + gameCounter);
                    System.out.println("total q " + g_view.getTotalQuestionNumber());
                } else if (gameCounter % 2 == 0) {
                    g_view.getNext().setText("Next");

                    g_view.getCorrectAnswerLabel().setText("");
                    g_view.setQuestion(g_view.getCurrentQuestionNumber());
                    System.out.println(g_view.getCurrentQuestionNumber());

                    System.out.println("Counter " + gameCounter);
                }
            } else {
                System.out.println("Counter " + gameCounter);
                System.out.println("done");

            }

            gameCounter++;
        }
    }

    class PlayGameButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent ae) {

            n_view.switchToPlayGamePanel(g_view);
        }

    }
}
