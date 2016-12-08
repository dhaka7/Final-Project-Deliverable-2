
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lapper
 */
public class HighScoreView extends JPanel {

    JTextArea highScore;
    
  

    String p1Name;
    String p2Name;
    String p3Name;
    String p4Name;
    String p5Name;
    String p6Name;
    String p7Name;
    String p8Name;
    String p9Name;
    String p10Name;
    int p1Score;
    int p2Score;
    int p3Score;
    int p4Score;
    int p5Score;
    int p6Score;
    int p7Score;
    int p8Score;
    int p9Score;
    int p10Score;
    ArrayList<String> nameArray = new ArrayList();
    ArrayList<Integer> scoreArray = new ArrayList();
    ArrayList<ArrayList> nameAndScoreArray = new ArrayList();
    
   
    HighScoreView() {
        setLayout(new FlowLayout());
        p1Name = "N/A";
        p2Name = "N/A";
        p3Name = "N/A";
        p4Name = "N/A";
        p5Name = "N/A";
        p6Name = "N/A";
        p7Name = "N/A";
        p8Name = "N/A";
        p9Name = "N/A";
        p10Name = "N/A";
        p1Score = 0;
        p2Score = 0;
        p3Score = 0;
        p4Score = 0;
        p5Score = 0;
        p6Score = 0;
        p7Score = 0;
        p8Score = 0;
        p9Score = 0;
        p10Score = 0;

        highScore = new JTextArea("Top 10 Scores\n 1. " + p1Name + "   " + p1Score + "\n 2. " + p2Name + "   " + p2Score + "\n 3. "
                + p3Name + "   " + p3Score + "\n 4. " + p4Name + "   " + p4Score + "\n 4. " + p4Name + "   " + p4Score + "\n 5. " + p5Name
                + "   " + p5Score + "\n 6. " + p6Name + "   " + p6Score + "\n 7. " + p7Name + "   " + p7Score + "\n 8. " + p8Name + "   " + p8Score
                + "\n 9. " + p9Name + "   " + p9Score + "\n 10. " + p10Name + "   " + p10Score);
        add(highScore);
        
    highScore.setForeground(Color.RED);
    highScore.setBackground(Color.GREEN);

    }

    public String getP1Name() {
        return p1Name;
    }

    public JTextArea getHighScore() {
        return highScore;
    }

    public void setHighScore(JTextArea highScore) {
        this.highScore = highScore;
    }

    public ArrayList<String> getNameArray() {
        return nameArray;
    }

    public void setNameArray(ArrayList<String> nameArray) {
        this.nameArray = nameArray;
    }

    public ArrayList<ArrayList> getNameAndScoreArray() {
        return nameAndScoreArray;
    }

    public void setNameAndScoreArray(ArrayList<ArrayList> nameAndScoreArray) {
        this.nameAndScoreArray = nameAndScoreArray;
    }

    public void setP1Name(String p1Name) {
        this.p1Name = p1Name;
    }

    public String getP2Name() {
        return p2Name;
    }

    public void setP2Name(String p2Name) {
        this.p2Name = p2Name;
    }

    public String getP3Name() {
        return p3Name;
    }

    public void setP3Name(String p3Name) {
        this.p3Name = p3Name;
    }

    public String getP4Name() {
        return p4Name;
    }

    public void setP4Name(String p4Name) {
        this.p4Name = p4Name;
    }

    public String getP5Name() {
        return p5Name;
    }

    public void setP5Name(String p5Name) {
        this.p5Name = p5Name;
    }

    public String getP6Name() {
        return p6Name;
    }

    public void setP6Name(String p6Name) {
        this.p6Name = p6Name;
    }

    public String getP7Name() {
        return p7Name;
    }

    public void setP7Name(String p7Name) {
        this.p7Name = p7Name;
    }

    public String getP8Name() {
        return p8Name;
    }

    public void setP8Name(String p8Name) {
        this.p8Name = p8Name;
    }

    public String getP9Name() {
        return p9Name;
    }

    public void setP9Name(String p9Name) {
        this.p9Name = p9Name;
    }

    public String getP10Name() {
        return p10Name;
    }

    public void setP10Name(String p10Name) {
        this.p10Name = p10Name;
    }

    public int getP1Score() {
        return p1Score;
    }

    public void setP1Score(int p1Score) {
        this.p1Score = p1Score;
    }

    public int getP2Score() {
        return p2Score;
    }

    public void setP2Score(int p2Score) {
        this.p2Score = p2Score;
    }

    public int getP3Score() {
        return p3Score;
    }

    public void setP3Score(int p3Score) {
        this.p3Score = p3Score;
    }

    public int getP4Score() {
        return p4Score;
    }

    public void setP4Score(int p4Score) {
        this.p4Score = p4Score;
    }

    public int getP5Score() {
        return p5Score;
    }

    public void setP5Score(int p5Score) {
        this.p5Score = p5Score;
    }

    public int getP6Score() {
        return p6Score;
    }

    public void setP6Score(int p6Score) {
        this.p6Score = p6Score;
    }

    public int getP7Score() {
        return p7Score;
    }

    public void setP7Score(int p7Score) {
        this.p7Score = p7Score;
    }

    public int getP8Score() {
        return p8Score;
    }

    public void setP8Score(int p8Score) {
        this.p8Score = p8Score;
    }

    public int getP9Score() {
        return p9Score;
    }

    public void setP9Score(int p9Score) {
        this.p9Score = p9Score;
    }

    public int getP10Score() {
        return p10Score;
    }

    public void setP10Score(int p10Score) {
        this.p10Score = p10Score;
    }

    public void updateHighScore() {
        this.highScore.setText("Top 10 Scores\n 1. " + p1Name + "   " + p1Score + "\n 2. " + p2Name + "   " + p2Score + "\n 3. "
                + p3Name + "   " + p3Score + "\n 4. " + p4Name + "   " + p4Score + "\n 5. " + p5Name
                + "   " + p5Score + "\n 6. " + p6Name + "   " + p6Score + "\n 7. " + p7Name + "   " + p7Score + "\n 8. " + p8Name + "   " + p8Score
                + "\n 9. " + p9Name + "   " + p9Score + "\n 10. " + p10Name + "   " + p10Score);
    }

    public ArrayList<Integer> getScoreArray() {
        return scoreArray;
    }

    public void setScoreArray(ArrayList<Integer> scoreArray) {
        this.scoreArray = scoreArray;
    }

}
