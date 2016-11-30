
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
    JLabel questionLabel;
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

    GameView() {
        answerList.add(answerOneList);
        answerList.add(answerTwoList);
        answerList.add(answerThreeList);
        answerList.add(answerFourList);

        questionList.add("What is my name?");
        answerList.get(0).add("Willy");
  //      [[a],[a]]
    //    [[b],[b]]
      //  [[c],[c]]
        //[[d],[d]]
        //[   [[a],[b],[c],[d]],   [[a],[b],[c],[d]] ,  [[a],[b],[c],[d]] ]
       
        
        answerList.get(1).add("Nilly");
        answerList.get(2).add("Silly");
        answerList.get(3).add("Rilly");
        correctAnswerList.add("Timmy");

        questionList.add("What is your name?");
        answerList.get(0).add("Baby");
        answerList.get(1).add("Child");
        answerList.get(2).add("Haily");
        answerList.get(3).add("Tommy");
        correctAnswerList.add("You Have None.");

        questionList.add("What is my name?");
        answerList.get(0).add("Willy");
        answerList.get(1).add("Nilly");
        answerList.get(2).add("Silly");
        answerList.get(3).add("Rilly");
        correctAnswerList.add("Timmy");

        generateQuestion();
        
        
        setLayout(grid);
        label = new JLabel("Working");
        next = new JButton("Next");
        questionLabel = new JLabel();
        answerOneLabel = new JLabel();
        answerTwoLabel = new JLabel();
        answerThreeLabel = new JLabel();
        answerFourLabel = new JLabel();

        userAnswer = new JTextField();
        correctAnswerLabel = new JLabel();

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

    public void generateQuestion() {

        for (int i = 0; i < questionList.size(); i++) {
        }
        currentQuestionNumber = 1;
        totalQuestionNumber = questionList.size() + 1;

    }

    public void setQuestion(int questionNumber) {
        int i = questionNumber - 1;
        questionLabel.setText(questionList.get(i));
        answerOneLabel.setText((String) answerList.get(0).get(i));
        answerTwoLabel.setText((String) answerList.get(1).get(i));
        answerThreeLabel.setText((String) answerList.get(2).get(i));
        answerFourLabel.setText((String) answerList.get(3).get(i));
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

}
