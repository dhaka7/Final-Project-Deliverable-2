
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

    JTextField userAnswer;
    GridLayout grid = new GridLayout(10,3);
        ArrayList<String> questionList = new ArrayList();
    ArrayList<String> answerList = new ArrayList();
    ArrayList<String> correctAnswerList = new ArrayList();


    GameView(){
        questionList.add("What is my name?");
        answerList.add("Billy");
        
        answerList.add("Willy");
        
        answerList.add("Nilly");
        
        answerList.add("Silly");
        
        correctAnswerList.add("Willy");
    setLayout(grid);
    label = new JLabel("Working");
    next = new JButton("Next");
    questionLabel = new JLabel(questionList.get(0));
    answerOneLabel = new JLabel(answerList.get(0));
    answerTwoLabel = new JLabel(answerList.get(1));
    answerThreeLabel = new JLabel(answerList.get(2));
    answerFourLabel = new JLabel(answerList.get(3));
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
}
