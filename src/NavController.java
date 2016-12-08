
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
    HighScoreView hs_view;
    int gameCounter = 2;
    boolean isInputInt = true;
    CongratsView congrats_view;
    int userScore;

    public NavController(NavModel n_model, NavView n_view) {
        this.n_model = n_model;
        this.n_view = n_view;
        o_model = new OptionsModel();
        o_view = new OptionsView(o_model);
        o_Controller = new OptionsController(o_model, o_view);
        m_view = new MainView();
        i_view = new InstructionView();
        c_view = new CreditView();
        g_view = new GameView("null", 0);
        g_controller = new GameController(g_view);
        hs_view = new HighScoreView();
        congrats_view = new CongratsView("NoName", 0);

        loadHighScoreArray();

        n_view.addOptionsButtonListener(new OptionsButtonListener());
        n_view.addMainButtonListener(new MainButtonListener());
        n_view.addInstructionsButtonListener(new InstructionButtonListener());
        n_view.addCreditsButtonLIstener(new CreditButtonListener());
        o_view.addSaveButtonListener(new OptionSaveButtonListener());
        m_view.addPlayGameButtonListener(new PlayGameButtonListener());
        g_view.addTestButtonListener(new NextButtonListener());
        n_view.addHighScoreButtonListener(new HighScoreButtonListener());
        congrats_view.addCongratsButtonListener(new MainButtonListener());
    }

    class OptionsButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //Pass an Options View object to our Navigation View
            n_view.switchToOptionsPanel(o_view);
        }
    }

    class CongratsButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //Pass an Options View object to our Navigation View
            n_view.switchToCongrats(congrats_view);
        }
    }

    class HighScoreButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //Pass an Options View object to our Navigation View
            n_view.switchHighScorePanel(hs_view);

            saveHighScoreArray();

            loadHighScoreArray();
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
            m_view.getSubject().setText("Subect: " + o_view.getSubjectList().getSelectedItem());
            o_view.getUserNameLabel().setText("Username: " + o_view.getUserName().getText());
            o_view.getDifficultyLabel().setText("Difficulty: " + String.valueOf(o_view.getDifficulty().getValue()));
            o_view.getSubjectSaveState().setText("Subect: " + o_view.getSubjectList().getSelectedItem());
            m_view.getPlayGame().setText("Play Game!");
        }
    }

    class NextButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent ae) {
            if ((g_view.getTotalQuestionNumber() + 2) > ((gameCounter + 2) / 2)) {
               if (gameCounter % 2 != 0) {
                    g_view.setAnswer(g_view.getCurrentQuestionNumber());
                    if (g_view.getAnswer(g_view.getCurrentQuestionNumber()).equalsIgnoreCase(g_view.getUserAnswer().getText())) {
                        userScore++;
                    }
                    g_view.increaseCurrentQuestionNumber();
                } else if (gameCounter % 2 == 0) {
                    g_view.getNext().setText("Next");
                    g_view.getLabel().setText("Question " + g_view.getCurrentQuestionNumber());
                    g_view.getCorrectAnswerLabel().setText("");
                    g_view.setQuestion(g_view.getCurrentQuestionNumber());
                }

                //End of game//
            } else {
                congrats_view = new CongratsView(o_view.getUserName().getText(), userScore);
                n_view.switchToCongrats(congrats_view);
                // reset current g_view.
                addNewScore(o_view.getUserName().getText(), userScore);

                hs_view.updateHighScore();
                saveHighScoreArray();
                loadHighScoreArray();
                userScore = 0;
            }

            gameCounter++;
        }
    }

    class PlayGameButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent ae) {
            String subject = (String) o_view.getSubjectList().getSelectedItem();
            int difficulty = o_view.getDifficulty().getValue();
            if (o_view.getSettingSaveState().getText().equalsIgnoreCase("Saved")) {
                g_view = new GameView(subject, difficulty);
                g_view.addTestButtonListener(new NextButtonListener());
                gameCounter = 2;

                n_view.switchToPlayGamePanel(g_view);
            } else {
                m_view.getPlayGame().setText("You Cannot Play This Game Until Your Settings Is Set");
            }
        }

    }

    public void loadHighScoreArray() {

        try {
            FileReader fin = new FileReader("src/Highscores.txt");
            Scanner scan = new Scanner(fin);
            String line;
            int playerNumber = 1;
            boolean isInputInt = true;

            while (scan.hasNextLine()) {
                if ((isInputInt == true) && (playerNumber == 1)) {
                    line = scan.nextLine();
                    hs_view.setP1Name((line));

                } else if ((isInputInt == true) && (playerNumber == 2)) {
                    line = scan.nextLine();
                    hs_view.setP2Name((line));
                } else if ((isInputInt == true) && (playerNumber == 3)) {
                    line = scan.nextLine();
                    hs_view.setP3Name((line));
                } else if ((isInputInt == true) && (playerNumber == 4)) {
                    line = scan.nextLine();
                    hs_view.setP4Name((line));
                } else if ((isInputInt == true) && (playerNumber == 5)) {
                    line = scan.nextLine();
                    hs_view.setP5Name((line));
                } else if ((isInputInt == true) && (playerNumber == 6)) {
                    line = scan.nextLine();
                    hs_view.setP6Name((line));
                } else if ((isInputInt == true) && (playerNumber == 7)) {
                    line = scan.nextLine();
                    hs_view.setP7Name((line));
                } else if ((isInputInt == true) && (playerNumber == 8)) {
                    line = scan.nextLine();
                    hs_view.setP8Name((line));
                } else if ((isInputInt == true) && (playerNumber == 9)) {
                    line = scan.nextLine();
                    hs_view.setP9Name((line));
                } else if ((isInputInt == true) && (playerNumber == 10)) {
                    line = scan.nextLine();
                    hs_view.setP10Name((line));
                }
                isInputInt = false;

                if ((isInputInt == false) && (playerNumber == 1)) {
                    line = scan.nextLine();
                    hs_view.setP1Score(Integer.parseInt(line));

                } else if ((isInputInt == false) && (playerNumber == 2)) {
                    line = scan.nextLine();
                    hs_view.setP2Score(Integer.parseInt(line));
                } else if ((isInputInt == false) && (playerNumber == 3)) {
                    line = scan.nextLine();
                    hs_view.setP3Score(Integer.parseInt(line));
                } else if ((isInputInt == false) && (playerNumber == 4)) {
                    line = scan.nextLine();
                    hs_view.setP4Score(Integer.parseInt(line));
                } else if ((isInputInt == false) && (playerNumber == 5)) {
                    line = scan.nextLine();
                    hs_view.setP5Score(Integer.parseInt(line));
                } else if ((isInputInt == false) && (playerNumber == 6)) {
                    line = scan.nextLine();
                    hs_view.setP6Score(Integer.parseInt(line));
                } else if ((isInputInt == false) && (playerNumber == 7)) {
                    line = scan.nextLine();
                    hs_view.setP7Score(Integer.parseInt(line));
                } else if ((isInputInt == false) && (playerNumber == 8)) {
                    line = scan.nextLine();
                    hs_view.setP8Score(Integer.parseInt(line));
                } else if ((isInputInt == false) && (playerNumber == 9)) {
                    line = scan.nextLine();
                    hs_view.setP9Score(Integer.parseInt(line));
                } else if ((isInputInt == false) && (playerNumber == 10)) {
                    line = scan.nextLine();
                    hs_view.setP10Score(Integer.parseInt(line));
                }
                playerNumber++;
                isInputInt = true;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("HighScore Data Base Not Found");
        }

        hs_view.updateHighScore();

        hs_view.getScoreArray().clear();
        hs_view.getNameArray().clear();
        hs_view.getNameAndScoreArray().clear();
        hs_view.getNameArray().add(hs_view.getP1Name());

        hs_view.getScoreArray().add(hs_view.getP1Score());
        hs_view.getNameArray().add(hs_view.getP2Name());

        hs_view.getScoreArray().add(hs_view.getP2Score());
        hs_view.getNameArray().add(hs_view.getP3Name());

        hs_view.getScoreArray().add(hs_view.getP3Score());
        hs_view.getNameArray().add(hs_view.getP4Name());

        hs_view.getScoreArray().add(hs_view.getP4Score());
        hs_view.getNameArray().add(hs_view.getP5Name());

        hs_view.getScoreArray().add(hs_view.getP5Score());

        hs_view.getNameArray().add(hs_view.getP6Name());
        hs_view.getScoreArray().add(hs_view.getP6Score());

        hs_view.getNameArray().add(hs_view.getP7Name());
        hs_view.getScoreArray().add(hs_view.getP7Score());

        hs_view.getNameArray().add(hs_view.getP8Name());
        hs_view.getScoreArray().add(hs_view.getP8Score());
        hs_view.getNameArray().add(hs_view.getP9Name());

        hs_view.getScoreArray().add(hs_view.getP9Score());
        hs_view.getNameArray().add(hs_view.getP10Name());

        hs_view.getScoreArray().add(hs_view.getP10Score());

        hs_view.getNameAndScoreArray().add(hs_view.getNameArray());
        hs_view.getNameAndScoreArray().add(hs_view.getScoreArray());
    }

    public void saveHighScoreArray() {
        try {
            FileWriter fout = new FileWriter("src/Highscores.txt");
            for (int i = 0; i < 10; i++) {
                fout.write(hs_view.getNameAndScoreArray().get(0).get(i) + "\n");
                fout.write(hs_view.getNameAndScoreArray().get(1).get(i) + "\n");
            }
            fout.close();
            fout.flush();
        } catch (IOException ex) {
        }
    }

    public void addNewScore(String name, int score) {
        hs_view.getNameArray().add(name);
        hs_view.getScoreArray().add(score);
        hs_view.getNameAndScoreArray().add(hs_view.getNameArray());
        hs_view.getNameAndScoreArray().add(hs_view.getScoreArray());
        boolean sorted;
        do {

            sorted = true;
            for (int i = 0; i < 10; i++) {

                if ((int) hs_view.getNameAndScoreArray().get(1).get(i) < (int) hs_view.getNameAndScoreArray().get(1).get(i + 1)) {
                    String tempName
                            = hs_view.getNameAndScoreArray().get(0).get(i).toString();
                    int tempScore
                            = (int) hs_view.getNameAndScoreArray().get(1).get(i);

                    hs_view.getNameAndScoreArray().get(0).set(i, hs_view.getNameAndScoreArray().get(0).get(i + 1));
                    hs_view.getNameAndScoreArray().get(1).set(i, hs_view.getNameAndScoreArray().get(1).get(i + 1));
                    hs_view.getNameAndScoreArray().get(0).set(i + 1, tempName);
                    hs_view.getNameAndScoreArray().get(1).set(i + 1, tempScore);
                    sorted = false;
                }

            }
        } while (sorted == false);
        hs_view.setNameArray(hs_view.getNameAndScoreArray().get(0));
        hs_view.setScoreArray(hs_view.getNameAndScoreArray().get(1));
    }

}
