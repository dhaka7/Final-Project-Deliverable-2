
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
        answerList.get(1).add("6");
        answerList.get(2).add("4");
        answerList.get(3).add("3");
        correctAnswerList.add("4");
        

        questionList.add("How many total degrees are there among all the angles of a hexagon?");
        answerList.get(0).add("700");
        answerList.get(1).add("720");
        answerList.get(2).add("730");
        answerList.get(3).add("701");
        correctAnswerList.add("720");

        questionList.add("What is the largest island in the United States?");
        answerList.get(0).add("Big Island of Hawaii");
        answerList.get(1).add("Long island");
        answerList.get(2).add("Don’t Know");
        answerList.get(3).add("Non of the Above");
        correctAnswerList.add("Big Island of Hawaii");

        questionList.add("What is the height of Niagara Falls?");
        answerList.get(0).add("176 ft");
        answerList.get(1).add("170 ft");
        answerList.get(2).add("160 ft");
        answerList.get(3).add("180 ft");
        correctAnswerList.add("170 ft");
        
        questionList.add("The imaginary line dividing the world into the Northern & Southern Hemisphere is called the");
        answerList.get(0).add("prime meridian");
        answerList.get(1).add("0 degrees longitude");
        answerList.get(2).add("0 degrees latitude");
        answerList.get(3).add("equator");
        correctAnswerList.add("equator");
        
        questionList.add("There is a three digit number. The second digit is four times as big as the third digit, while the first digit is three less than the second digit. What is the number? ");
        answerList.get(0).add("141");
        answerList.get(1).add("144");
        answerList.get(2).add("414");
        answerList.get(3).add("441");
        correctAnswerList.add("141");
        
        questionList.add("There are 8 people on the Trivia team, and each person shakes hands with each other person once. How many handshakes take place?");
        answerList.get(0).add("27 ");
        answerList.get(1).add("28 ");
        answerList.get(2).add("29 ");
        answerList.get(3).add("30 ");
        correctAnswerList.add("28 ");
        
        questionList.add("What is the term for a line segment with one endpoint at the center of a circle and the other endpoint on the circle?");
        answerList.get(0).add("Radius");
        answerList.get(1).add("Diameter");
        answerList.get(2).add("Perimeter");
        answerList.get(3).add("NONE");
        correctAnswerList.add("Radius");
        
        generateQuestion();
        
        
        setLayout(grid);
        label = new JLabel("Press Start to Begain the Game. First Three is Math, Second three is Geography, Third three is Science");
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
