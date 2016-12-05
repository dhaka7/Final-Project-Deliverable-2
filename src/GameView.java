
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

        questionList.add("A normal stop sign has the shape of what geometrical figure?");
                answerList.get(0).add("Pentarino");
        answerList.get(1).add("Octagon");
        answerList.get(2).add("Pentagon");
        answerList.get(3).add("Square");
        correctAnswerList.add("Octagon");
  //      [[a],[a]]
    //    [[b],[b]]
      //  [[c],[c]]
        //[[d],[d]]
        //[   [[a],[b],[c],[d]],   [[a],[b],[c],[d]] ,  [[a],[b],[c],[d]] ]
       
        questionList.add("What number must a year be divisible by to qualify as a leap year?");
        answerList.get(0).add("5");
        answerList.get(1).add("5");
        answerList.get(2).add("4");
        answerList.get(3).add("3");
        correctAnswerList.add("3");
        

        questionList.add("How many total degrees are there among all the angles of a hexagon?");
        answerList.get(0).add("700");
        answerList.get(1).add("720");
        answerList.get(2).add("730");
        answerList.get(3).add("701");
        correctAnswerList.add("720");

        questionList.add("What is mymjkmlml name?");
        answerList.get(0).add("Wikjlly");
        answerList.get(1).add("Nillnky");
        answerList.get(2).add("Silljhnky");
        answerList.get(3).add("Rilljhiy");
        correctAnswerList.add("huuhmmy");

        
        generateQuestion();
        
        
        setLayout(grid);
        label = new JLabel("Working");
        next = new JButton("Start");
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
    
    public void setAnswer(int questionNumber){
        int i = questionNumber - 1;
correctAnswerLabel.setText("The Correct Answer is " + correctAnswerList.get(i));
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
    public void increaseCurrentQuestionNumber(){
    
    this.currentQuestionNumber += 1;
    }

}
