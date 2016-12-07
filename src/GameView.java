
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

    MathModel math_model = new MathModel();
    HistoryModel hist_model = new HistoryModel();
    GeographyModel geo_model = new GeographyModel();
    GameModel game_model = new GameModel();

    GameView(String subject, int difficulty) {
        answerList.add(answerOneList);
        answerList.add(answerTwoList);
        answerList.add(answerThreeList);
        answerList.add(answerFourList);
        /*
//level 1 difficulty MATH
        questionList.add("  Which number comes next: 42, 43, 44, ?");
        answerList.get(0).add("45");
        answerList.get(1).add("47");
        answerList.get(2).add("20");
        answerList.get(3).add("1");
        correctAnswerList.add("45");
        
        questionList.add("  One quarter is equal to how many nickels?");
        answerList.get(0).add("20");
        answerList.get(1).add("10");
        answerList.get(2).add("5");
        answerList.get(3).add("25");
        correctAnswerList.add("5");
        
        questionList.add("  Oscar had 17 pencils and gave 8 to Emily. How many pencils does Oscar have now?");
        answerList.get(0).add("17");
        answerList.get(1).add("8");
        answerList.get(2).add("25");
        answerList.get(3).add("9");
        correctAnswerList.add("9");
    
=======
    *//*
        
//level 2 difficulty MATH
        questionList.add("  A normal stop sign has the shape of what geometrical figure?");
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
                      
        questionList.add("  What number must a year be divisible by to qualify as a leap year?");
        answerList.get(0).add("5");
        answerList.get(1).add("6");
        answerList.get(2).add("4");
        answerList.get(3).add("3");
        correctAnswerList.add("4");
        

        questionList.add("  How many total degrees are there among all the angles of a hexagon?");
        answerList.get(0).add("700");
        answerList.get(1).add("720");
        answerList.get(2).add("730");
        answerList.get(3).add("701");
        correctAnswerList.add("720");

    
// level 3 difficulty MATH
        questionList.add("  There are 123 boxes of candy at the warehouse. Each box contains 25 pieces of candy. How many pieces of candy are at the warehouse?");
        answerList.get(0).add("25");
        answerList.get(1).add("123");
        answerList.get(2).add("3075");
        answerList.get(3).add("148");
        correctAnswerList.add("3075");
        
        questionList.add("  There are 175 cards in a deck and four players. How many cards does each person get?");
        answerList.get(0).add("45 with 2 cards left");
        answerList.get(1).add("44 with 5 cards left");
        answerList.get(2).add("43 with 3 cards left");
        answerList.get(3).add("43 with 2 cards left");
        correctAnswerList.add("43 with 3 cards left");
        
        questionList.add("  Two friends buy a video game that costs $22 and recieve $6.50 as change?");
        answerList.get(0).add("$15.50");
        answerList.get(1).add("$6.50");
        answerList.get(2).add("16.50");
        answerList.get(3).add("15.00");
        correctAnswerList.add("$15.50");
        
    
    
 
//level 1 difficulty GEOGRAPHY
        questionList.add("  What is the largest island in the United States?");
        answerList.get(0).add("Big Island of Hawaii");
        answerList.get(1).add("Long island");
        answerList.get(2).add("Moana");
        answerList.get(3).add("None of the Above");
        correctAnswerList.add("Big Island of Hawaii");

        questionList.add("  What is the height of Niagara Falls?");
        answerList.get(0).add("176 ft");
        answerList.get(1).add("170 ft");
        answerList.get(2).add("160 ft");
        answerList.get(3).add("180 ft");
        correctAnswerList.add("170 ft");
        
        questionList.add("  The imaginary line dividing the world into the Northern & Southern Hemisphere is called the");
        answerList.get(0).add("prime meridian");
        answerList.get(1).add("0 degrees longitude");
        answerList.get(2).add("0 degrees latitude");
        answerList.get(3).add("equator");
        correctAnswerList.add("equator");
        
// level 2 difficulty GEOGRAPHY
        
        questionList.add("  What is the largest state in the United States?");
        answerList.get(0).add("Texas");
        answerList.get(1).add("California");
        answerList.get(2).add("Alaska");
        answerList.get(3).add("Canada");
        correctAnswerList.add("Alaska");
        
        questionList.add("  Which of the five 'great lakes' starts with an O?");
        answerList.get(0).add("Ohio");
        answerList.get(1).add("Ontario");
        answerList.get(2).add("Osmond");
        answerList.get(3).add("Oklahoma");
        correctAnswerList.add("Ontario");
        
        questionList.add("  Texas has which of the following mountain ranges?");
        answerList.get(0).add("Himalayas Mountain Range");
        answerList.get(1).add("Andes Mountain Range");
        answerList.get(2).add("Chisos Mountain Range");
        answerList.get(3).add("None of the above");
        correctAnswerList.add("Chisos Mountain Range");
        
        
        questionList.add("  A chain of islands is known as");
        answerList.get(0).add("Archipelago");
        answerList.get(1).add("Peninsula");
        answerList.get(2).add("Volcano");
        answerList.get(3).add("Prairie");
        correctAnswerList.add("Archipelago");
        
        questionList.add("  How many countries are in North America?");
        answerList.get(0).add("18");
        answerList.get(1).add("23");
        answerList.get(2).add("10");
        answerList.get(3).add("3");
        correctAnswerList.add("23");
        
        questionList.add(" What is the name of Mountain Range that runs along the West Coast of the North America?");
        answerList.get(0).add("Grizzly Bear Mountain Range");
        answerList.get(1).add("California Mountain Range");
        answerList.get(2).add("West Coast Ranges");
        answerList.get(3).add("Pacific Coast Ranges");
        correctAnswerList.add("Pacific Coast Ranges");
        
        
//level 1 Difficulty Science         
        questionList.add("   Which of the following is used in pencils? ");
        answerList.get(0).add("Graphite");
        answerList.get(1).add("Silicon");
        answerList.get(2).add("Charcoal");
        answerList.get(3).add("None");
        correctAnswerList.add("Graphite");
         */
 /*     
        questionList.add("  There is a three digit number. The second digit is four times as big as the third digit, while the first digit is three less than the second digit. What is the number? ");
        answerList.get(0).add("141");
        answerList.get(1).add("144");
        answerList.get(2).add("414");
        answerList.get(3).add("441");
        correctAnswerList.add("141");
        
        questionList.add("   Which of the following metals forms an amalgam with other metals?");
        answerList.get(0).add("Tin ");
        answerList.get(1).add("Mercury ");
        answerList.get(2).add("Lead ");
        answerList.get(3).add("Zinc ");
        correctAnswerList.add("Mercury ");
        
        questionList.add(" Chemical formula for water is ");
        answerList.get(0).add("NaAlO2");
        answerList.get(1).add("H2O");
        answerList.get(2).add("Al2O3");
        answerList.get(3).add("CaSiO3");
        correctAnswerList.add("H2O");
        
//level 2 Difficulty Science  
        questionList.add("  Which of the gas is not known as green house gas? ");
        answerList.get(0).add("Methane");
        answerList.get(1).add("Nitrous");
        answerList.get(2).add("Carbon");
        answerList.get(3).add("Hydrogen");
        correctAnswerList.add("Hydrogen");
        
        questionList.add(" The hardest substance available on earth is ");
        answerList.get(0).add("Diamond");
        answerList.get(1).add("Gold");
        answerList.get(2).add("Iron");
        answerList.get(3).add("NONE");
        correctAnswerList.add("Diamond");
        
        questionList.add(" The average salinity of sea water is");
        answerList.get(0).add("3%");
        answerList.get(1).add("3.5%");
        answerList.get(2).add("2.5%");
        answerList.get(3).add("2%");
        correctAnswerList.add("3.5%");
        
//level 3 Difficulty Science    
        questionList.add(" The inert gas which is substituted for nitrogen in the air used by deep sea divers for breathing, is");
        answerList.get(0).add("Argon");
        answerList.get(1).add("Xenon");
        answerList.get(2).add("Helium");
        answerList.get(3).add("Krypton");
        correctAnswerList.add("Helium");
        
        questionList.add(" Heavy water is");
        answerList.get(0).add("deuterium oxide");
        answerList.get(1).add("PH7");
        answerList.get(2).add("rain water");
        answerList.get(3).add("tritium oxide");
        correctAnswerList.add("deuterium oxide");
        
        questionList.add(" The element common to all acids is");
        answerList.get(0).add("hydrogen");
        answerList.get(1).add("carbon");
        answerList.get(2).add("sulphur");
        answerList.get(3).add("NONE");
        correctAnswerList.add("Radius");
         */
        if (subject.equalsIgnoreCase("math")) {
            if (difficulty == 1) {
                generateQuestion(math_model.getMathLevelOne());

            } else if (difficulty == 2) {
                generateQuestion(math_model.getMathLevelTwo());
            } else {
                generateQuestion(math_model.getMathLevelThree());
            }

        } else if (subject.equalsIgnoreCase("geography")) {
            if (difficulty == 1) {
                generateQuestion(geo_model.getGeoLevelOne());
            } else if (difficulty == 2) {
                generateQuestion(geo_model.getGeoLevelTwo());
            } else {
                generateQuestion(geo_model.getGeoLevelThree());
            }

        } else if (subject.equalsIgnoreCase("history")) {
            if (difficulty == 1) {
                generateQuestion(hist_model.getHistLevelOne());
            } else if (difficulty == 2) {
                generateQuestion(hist_model.getHistLevelTwo());
            } else {
                generateQuestion(hist_model.getHistLevelThree());
            }
        } else {
            game_model = new GameModel();
        }
        setLayout(grid);
        label = new JLabel("    Press Start to Play. First Questions are on Math. Second Questions are on Geography, Third Questions are on Science.");
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

    public void setAnswer(int questionNumber) {
        int i = questionNumber - 1;
        correctAnswerLabel.setText("The Correct Answer is " + correctAnswerList.get(i));
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
