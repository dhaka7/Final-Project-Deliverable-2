
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        hs_view = new HighScoreView();

        loadHighScoreArray();

        n_view.addOptionsButtonListener(new OptionsButtonListener());
        n_view.addMainButtonListener(new MainButtonListener());
        n_view.addInstructionsButtonListener(new InstructionButtonListener());
        n_view.addCreditsButtonLIstener(new CreditButtonListener());
        o_view.addSaveButtonListener(new OptionSaveButtonListener());
        m_view.addPlayGameButtonListener(new PlayGameButtonListener());
        g_view.addTestButtonListener(new NextButtonListener());
        n_view.addHighScoreButtonListener(new HighScoreButtonListener());
    }

    class OptionsButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //Pass an Options View object to our Navigation View
            n_view.switchToOptionsPanel(o_view);
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
            m_view.getSubject().setText("Subect: " + o_view.getSubject().getText());
            o_view.getUserNameLabel().setText("Username: " + o_view.getUserName().getText());
            o_view.getDifficultyLabel().setText("Difficulty: " + String.valueOf(o_view.getDifficulty().getValue()));
            o_view.getSubjectSaveState().setText("Subect: " + o_view.getSubject().getText());
        }
    }

    class NextButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent ae) {
            if ((g_view.getTotalQuestionNumber() + 2) > ((gameCounter + 2) / 2)) {

                System.out.println("First If total question and game counter" + g_view.getTotalQuestionNumber() + " " + gameCounter);
                if (gameCounter % 2 != 0) {
                    g_view.setAnswer(g_view.getCurrentQuestionNumber());
                    System.out.println("current question number for answer" + g_view.getCurrentQuestionNumber());
                    g_view.increaseCurrentQuestionNumber();
                    System.out.println("Counter " + gameCounter);
                    System.out.println("total q " + g_view.getTotalQuestionNumber());
                } else if (gameCounter % 2 == 0) {
                    g_view.getNext().setText("Next");
                    g_view.getLabel().setText("Question " + g_view.getCurrentQuestionNumber());
                    g_view.getCorrectAnswerLabel().setText("");
                    g_view.setQuestion(g_view.getCurrentQuestionNumber());
                    System.out.println(g_view.getCurrentQuestionNumber());

                    System.out.println("Counter " + gameCounter);
                }
            } else {
                n_view.switchToMainPanel(m_view);

                // reset current g_view.
            //    addNewScore("Timmy", 20202);
                        
                saveHighScoreArray();
                loadHighScoreArray();
                System.out.println(hs_view.getScoreArray());
                gameCounter = 2;
                g_view = new GameView();
                g_view.addTestButtonListener(new NextButtonListener());
            }

            gameCounter++;
        }
    }

    class PlayGameButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent ae) {

            n_view.switchToPlayGamePanel(g_view);
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

    }

    public void saveHighScoreArray() {

        try {
            FileWriter fout = new FileWriter("src/Highscores.txt");

            fout.write(hs_view.getP1Name() + "\n");
            fout.write(hs_view.getP1Score() + "\n");
            fout.write(hs_view.getP2Name() + "\n");
            fout.write(hs_view.getP2Score() + "\n");
            fout.write(hs_view.getP3Name() + "\n");
            fout.write(hs_view.getP3Score() + "\n");
            fout.write(hs_view.getP4Name() + "\n");
            fout.write(hs_view.getP4Score() + "\n");
            fout.write(hs_view.getP5Name() + "\n");
            fout.write(hs_view.getP5Score() + "\n");
            fout.write(hs_view.getP6Name() + "\n");
            fout.write(hs_view.getP6Score() + "\n");
            fout.write(hs_view.getP7Name() + "\n");
            fout.write(hs_view.getP7Score() + "\n");
            fout.write(hs_view.getP8Name() + "\n");
            fout.write(hs_view.getP8Score() + "\n");
            fout.write(hs_view.getP9Name() + "\n");
            fout.write(hs_view.getP9Score() + "\n");
            fout.write(hs_view.getP10Name() + "\n");
            fout.write(hs_view.getP10Score() + "\n");

            fout.close();
            fout.flush();
        } catch (IOException ex) {
        }

    }
/*
    public void addNewScore(String name, int score) {
        hs_view.getNameArray().add(name);
        hs_view.getScoreArray().add(score);
        hs_view.getNameAndScoreArray().add(hs_view.getNameArray());
        hs_view.getNameAndScoreArray().add(hs_view.getScoreArray());
        boolean sorted;
        do {

            sorted = true;
            for (int i = 0; i < 10; i++) {

                if (hs_view.getNameAndScoreArray().get(1).get(i)  < hs_view.getNameAndScoreArray().get(1).get(i+)) {
                    String tempName
                            = hs_view.getScoreArray().get(i);
                    int tempScore
                            = Integer.parseInt(hs_view.getScoreArray().get(i + 1));

                    hs_view.getScoreArray().set(i, hs_view.getScoreArray().get(i + 2));
                    hs_view.getScoreArray().set(i + 1, hs_view.getScoreArray().get(i + 3));
                    hs_view.getScoreArray().set(i + 2, tempName);
                    hs_view.getScoreArray().set(i + 3 + 1, String.valueOf(tempScore));
                    sorted = false;
                }

            }
        } while (sorted == false);
        System.out.println("new array " + hs_view.getScoreArray());
    }
*/
}
