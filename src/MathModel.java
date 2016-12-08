/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Lapper
 */
public class MathModel {

    Random rand = new Random();
    
    ArrayList<String> questionListOne = new ArrayList();
    ArrayList<String> answerOneListOne = new ArrayList();
    ArrayList<String> answerTwoListOne = new ArrayList();
    ArrayList<String> answerThreeListOne = new ArrayList();
    ArrayList<String> answerFourListOne = new ArrayList();
    ArrayList<String> correctAnswerListOne = new ArrayList();

    
    ArrayList<String> questionListGen = new ArrayList();
    ArrayList<String> answerOneListGen = new ArrayList();
    ArrayList<String> answerTwoListGen = new ArrayList();
    ArrayList<String> answerThreeListGen = new ArrayList();
    ArrayList<String> answerFourListGen = new ArrayList();
    ArrayList<String> correctAnswerListGen = new ArrayList();

    
    ArrayList<ArrayList> answerListOne = new ArrayList();
    ArrayList<ArrayList> answerListGen = new ArrayList();

    
    ArrayList<ArrayList> mathLevelOne = new ArrayList();
    ArrayList<ArrayList> mathLevelGen = new ArrayList();

    MathModel() {

        answerListOne.add(answerOneListOne);
        answerListOne.add(answerTwoListOne);
        answerListOne.add(answerThreeListOne);
        answerListOne.add(answerFourListOne);

        answerListGen.add(answerOneListGen);
        answerListGen.add(answerTwoListGen);
        answerListGen.add(answerThreeListGen);
        answerListGen.add(answerFourListGen);

        questionListOne.add("  Which number comes next: 42, 43, 44, __?");
        answerListOne.get(0).add("45");
        answerListOne.get(1).add("47");
        answerListOne.get(2).add("20");
        answerListOne.get(3).add("1");
        correctAnswerListOne.add("45");

        questionListOne.add("  One quarter is equal to how many nickels?");
        answerListOne.get(0).add("20");
        answerListOne.get(1).add("10");
        answerListOne.get(2).add("5");
        answerListOne.get(3).add("25");
        correctAnswerListOne.add("5");

    
        questionListOne.add("  Oscar had 17 pencils and gave 8 to Emily. How many pencils does Oscar have now?");
        answerListOne.get(0).add("17");
        answerListOne.get(1).add("8");
        answerListOne.get(2).add("25");
        answerListOne.get(3).add("9");
        correctAnswerListOne.add("9");

        questionListOne.add("  A normal stop sign has the shape of what geometrical figure?");
        answerListOne.get(0).add("Pentarino");
        answerListOne.get(1).add("Octagon");
        answerListOne.get(2).add("Pentagon");
        answerListOne.get(3).add("Square");
        correctAnswerListOne.add("Octagon");

        questionListOne.add("  What number must a year be divisible by to qualify as a leap year?");
        answerListOne.get(0).add("5");
        answerListOne.get(1).add("6");
        answerListOne.get(2).add("4");
        answerListOne.get(3).add("3");
        correctAnswerListOne.add("4");

        questionListOne.add("  How many total degrees are there among all the angles of a hexagon?");
        answerListOne.get(0).add("700");
        answerListOne.get(1).add("720");
        answerListOne.get(2).add("730");
        answerListOne.get(3).add("701");
        correctAnswerListOne.add("720");

        questionListOne.add("  There are 123 boxes of candy at the warehouse. Each box contains 25 pieces of candy. How many pieces of candy are at the warehouse?");
        answerListOne.get(0).add("25");
        answerListOne.get(1).add("123");
        answerListOne.get(2).add("3075");
        answerListOne.get(3).add("148");
        correctAnswerListOne.add("3075");

        questionListOne.add("  There are 175 cards in a deck and four players. How many cards does each person get?");
        answerListOne.get(0).add("45 with 2 cards left");
        answerListOne.get(1).add("44 with 5 cards left");
        answerListOne.get(2).add("43 with 3 cards left");
        answerListOne.get(3).add("43 with 2 cards left");
        correctAnswerListOne.add("43 with 3 cards left");

        questionListOne.add("  Two friends buy a video game that costs $22 and recieve $6.50 as change?");
        answerListOne.get(0).add("$15.50");
        answerListOne.get(1).add("$6.50");
        answerListOne.get(2).add("$16.50");
        answerListOne.get(3).add("$15.00");
        correctAnswerListOne.add("$15.50");

        questionListOne.add("  What is 20/5?");
        answerListOne.get(0).add("1");
        answerListOne.get(1).add("2");
        answerListOne.get(2).add("3");
        answerListOne.get(3).add("4");
        correctAnswerListOne.add("4");
        
        questionListOne.add("  What is the next prime number after 7  ");
        answerListOne.get(0).add("11");
        answerListOne.get(1).add("12");
        answerListOne.get(2).add("13");
        answerListOne.get(3).add("14");
        correctAnswerListOne.add("11");
        
        questionListOne.add("  The perimeter of a perimeter is also known as what  ");
        answerListOne.get(0).add("perimeter");
        answerListOne.get(1).add("SKIP ");
        answerListOne.get(2).add("perimeter");
        answerListOne.get(3).add("NO");
        correctAnswerListOne.add("circumference");
        
        questionListOne.add(" What does the square root of 144 equal?   ");
        answerListOne.get(0).add("12");
        answerListOne.get(1).add("144");
        answerListOne.get(2).add("13");
        answerListOne.get(3).add("14");
        correctAnswerListOne.add("12");
        
        questionListOne.add("  How many sides does a nonagon have?  ");
        answerListOne.get(0).add("9");
        answerListOne.get(1).add("6");
        answerListOne.get(2).add("7");
        answerListOne.get(3).add("8");
        correctAnswerListOne.add("9");
        
        questionListOne.add("  What is the bigger number, a googol or a billion?");
        answerListOne.get(0).add("googol");
        answerListOne.get(1).add("skip");
        answerListOne.get(2).add("billion");
        answerListOne.get(3).add("number");
        correctAnswerListOne.add("googol");
        
        questionListOne.add("  The middle value of an ordered set of values is");
        answerListOne.get(0).add("median");
        answerListOne.get(1).add("mean");
        answerListOne.get(2).add("mode");
        answerListOne.get(3).add("skip");
        correctAnswerListOne.add("median");
        
        questionListOne.add("  The average of first 50 natural numbers is   ");
        answerListOne.get(0).add("24");
        answerListOne.get(1).add("25");
        answerListOne.get(2).add("23");
        answerListOne.get(3).add("26");
        correctAnswerListOne.add("25");
        
        questionListOne.add("   What is 1004 divided by 2? ");
        answerListOne.get(0).add("52");
        answerListOne.get(1).add("502");
        answerListOne.get(2).add("5002");
        answerListOne.get(3).add("520");
        correctAnswerListOne.add("502");
        
        questionListOne.add("  A clock strikes once at 1 o’clock, twice at 2 o’clock, thrice at 3 o’clock and so on. How many times will it strike in 24 hours?  ");
        answerListOne.get(0).add("78");
        answerListOne.get(1).add("156");
        answerListOne.get(2).add("136");
        answerListOne.get(3).add("0");
        correctAnswerListOne.add("156");
        
        questionListOne.add("  The simplest form of 1.5 : 2.5 is ");
        answerListOne.get(0).add("6:10");
        answerListOne.get(1).add("3:5");
        answerListOne.get(2).add("7:8");
        answerListOne.get(3).add("none");
        correctAnswerListOne.add("3:5");
        

        

        mathLevelOne.add(questionListOne);
        mathLevelOne.add(answerListOne);
        mathLevelOne.add(correctAnswerListOne);

        for (int i = 0; i < 5; i++) {
            int randIndex = rand.nextInt(questionListOne.size());
            questionListGen.add(questionListOne.get(randIndex));
            answerListGen.get(0).add(answerListOne.get(0).get(randIndex));
            answerListGen.get(1).add(answerListOne.get(1).get(randIndex));
            answerListGen.get(2).add(answerListOne.get(2).get(randIndex));
            answerListGen.get(3).add(answerListOne.get(3).get(randIndex));
            correctAnswerListGen.add(correctAnswerListOne.get(randIndex));
        }

        mathLevelGen.add(questionListGen);
        mathLevelGen.add(answerListGen);
        mathLevelGen.add(correctAnswerListGen);

        //     for(int i = 0; i < 5; i++){
        //   mathLevelGen.add(mathLevelOne.get(rand.nextInt(4) + 1));
    }

    public ArrayList<ArrayList> getMathLevelGen() {
        return mathLevelGen;
    }

    public void setMathLevelGen(ArrayList<ArrayList> mathLevelGen) {
        this.mathLevelGen = mathLevelGen;
    }

    public ArrayList<ArrayList> getMathLevelOne() {
        return mathLevelOne;
    }

    public void setMathLevelOne(ArrayList<ArrayList> mathLevelOne) {
        this.mathLevelOne = mathLevelOne;
    }
}
