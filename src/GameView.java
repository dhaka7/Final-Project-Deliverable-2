
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ohs5008
 */
public class GameView extends JPanel {

    JLabel label;
    JButton next;
    JTextArea questionLabel;
    JLabel answerOneLabel;
    JLabel answerTwoLabel;
    JLabel answerThreeLabel;
    JLabel answerFourLabel;
    JLabel correctAnswerLabel;
    int currentQuestionNumber;
    int totalQuestionNumber;

    JTextField userAnswer;
    GridLayout grid = new GridLayout(10, 3);
    ArrayList<String> questionList = new ArrayList();
    ArrayList<String> answerOneList = new ArrayList();
    ArrayList<String> answerTwoList = new ArrayList();
    ArrayList<String> answerThreeList = new ArrayList();
    ArrayList<String> answerFourList = new ArrayList();
    ArrayList<String> correctAnswerList = new ArrayList();
    ArrayList<ArrayList> answerList = new ArrayList();

    MathModel math_model = new MathModel();
    HistoryModel hist_model = new HistoryModel();
    GeographyModel geo_model = new GeographyModel();
    ScienceModel sci_model = new ScienceModel();
    GameModel game_model = new GameModel();

    GameView(String subject, int difficulty) {
        answerList.add(answerOneList);
        answerList.add(answerTwoList);
        answerList.add(answerThreeList);
        answerList.add(answerFourList);

        if (subject.equalsIgnoreCase("math")) {
            if (difficulty == 1) {
                generateQuestion(math_model.getMathLevelGen(3));
            } else if (difficulty == 2) {
                generateQuestion(math_model.getMathLevelGen(5));
            } else {
                generateQuestion(math_model.getMathLevelGen(8));
            }
        } else if (subject.equalsIgnoreCase("geography")) {
            if (difficulty == 1) {
                generateQuestion(geo_model.getGeoLevelGen(3));
            } else if (difficulty == 2) {
                generateQuestion(geo_model.getGeoLevelGen(5));
            } else {
                generateQuestion(geo_model.getGeoLevelGen(8));
            }
        } else if (subject.equalsIgnoreCase("history")) {
            if (difficulty == 1) {
                generateQuestion(hist_model.getHistLevelGen(3));
            } else if (difficulty == 2) {
                generateQuestion(hist_model.getHistLevelGen(5));
            } else {
                generateQuestion(hist_model.getHistLevelGen(8));
            }
        } else if (subject.equalsIgnoreCase("science")) {
            if (difficulty == 1) {
                generateQuestion(sci_model.getSciLevelGen(3));
            } else if (difficulty == 2) {
                generateQuestion(sci_model.getSciLevelGen(5));
            } else {
                generateQuestion(sci_model.getSciLevelGen(8));
            }
        } else {
            game_model = new GameModel();
        }

        setLayout(grid);
        label = new JLabel("    Press Start to Play! ");
        next = new JButton("Start");
        
        questionLabel = new JTextArea();
        answerOneLabel = new JLabel();
        answerTwoLabel = new JLabel();
        answerThreeLabel = new JLabel();
        answerFourLabel = new JLabel();

        userAnswer = new JTextField();
        correctAnswerLabel = new JLabel();

        questionLabel.setForeground(Color.BLUE);
        userAnswer.setForeground(Color.BLACK);
        answerOneLabel.setForeground(Color.RED);
        answerTwoLabel.setForeground(Color.RED);
        answerThreeLabel.setForeground(Color.RED);
        answerFourLabel.setForeground(Color.RED);
        
        questionLabel.setLineWrap(true);
        questionLabel.setWrapStyleWord(true);
        
        add(label);
        add(questionLabel);
        add(answerOneLabel);
        add(answerTwoLabel);
        add(answerThreeLabel);
        add(answerFourLabel);
        add(userAnswer);
        add(new JLabel());
        add(next);
        add(correctAnswerLabel);

    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }

    public JButton getNext() {
        return next;
    }

    public ArrayList<String> getCorrectAnswerList() {
        return correctAnswerList;
    }

    public void setCorrectAnswerList(ArrayList<String> correctAnswerList) {
        this.correctAnswerList = correctAnswerList;
    }

    public JLabel getCorrectAnswerLabel() {
        return correctAnswerLabel;
    }

    public void setCorrectAnswerLabel(JLabel correctAnswerLabel) {
        this.correctAnswerLabel = correctAnswerLabel;
    }

    public void setNext(JButton next) {
        this.next = next;
    }

    public void addTestButtonListener(ActionListener al) {
        this.next.addActionListener(al);
    }

    public void generateQuestion(ArrayList<ArrayList> subjectLevelArray) {
        this.questionList.clear();
        this.answerList.clear();
        this.correctAnswerList.clear();

        this.questionList = subjectLevelArray.get(0);
        this.answerList = subjectLevelArray.get(1);
        this.correctAnswerList = subjectLevelArray.get(2);

        this.totalQuestionNumber = questionList.size();
        this.currentQuestionNumber = 1;
    }

    public void setQuestion(int questionNumber) {
        int i = questionNumber - 1;
        questionLabel.setText(questionList.get(i));
        answerOneLabel.setText((String) answerList.get(0).get(i));
        answerTwoLabel.setText((String) answerList.get(1).get(i));
        answerThreeLabel.setText((String) answerList.get(2).get(i));
        answerFourLabel.setText((String) answerList.get(3).get(i));
    }

    public void setAnswer(int questionNumber, Boolean isCorrect) {
        int i = questionNumber - 1;
        String isCorrectString = "Null";
        if (isCorrect == true) {
            isCorrectString = "Right! ";
        } else {
            isCorrectString = "Wrong ";
        }

        correctAnswerLabel.setText(isCorrectString + "The Correct Answer is " + correctAnswerList.get(i));
    }

    public String getAnswer(int questionNumber) {
        int i = questionNumber - 1;
        return correctAnswerList.get(i);
    }

    public int getCurrentQuestionNumber() {
        return currentQuestionNumber;
    }

    public void setCurrentQuestionNumber(int currentQuestionNumber) {
        this.currentQuestionNumber = currentQuestionNumber;
    }

    public int getTotalQuestionNumber() {
        return totalQuestionNumber;
    }

    public void setTotalQuestionNumber(int totalQuestionNumber) {
        this.totalQuestionNumber = totalQuestionNumber;
    }

    public void increaseCurrentQuestionNumber() {

        this.currentQuestionNumber += 1;
    }

    public JTextField getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(JTextField userAnswer) {
        this.userAnswer = userAnswer;
    }
}
