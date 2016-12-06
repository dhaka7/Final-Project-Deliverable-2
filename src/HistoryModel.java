
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lapper
 */
public class HistoryModel {


    ArrayList<String> questionListOne = new ArrayList();
    ArrayList<String> answerOneListOne = new ArrayList();
    ArrayList<String> answerTwoListOne = new ArrayList();
    ArrayList<String> answerThreeListOne = new ArrayList();
    ArrayList<String> answerFourListOne = new ArrayList();
    ArrayList<String> correctAnswerListOne = new ArrayList();
    ArrayList<ArrayList> answerListOne = new ArrayList();

    
    ArrayList<String> questionListTwo = new ArrayList();
    ArrayList<String> answerOneListTwo = new ArrayList();
    ArrayList<String> answerTwoListTwo = new ArrayList();
    ArrayList<String> answerThreeListTwo = new ArrayList();
    ArrayList<String> answerFourListTwo = new ArrayList();
    ArrayList<String> correctAnswerListTwo = new ArrayList();
    ArrayList<ArrayList> answerListTwo = new ArrayList();

    
    ArrayList<String> questionListThree = new ArrayList();
    ArrayList<String> answerOneListThree = new ArrayList();
    ArrayList<String> answerTwoListThree = new ArrayList();
    ArrayList<String> answerThreeListThree = new ArrayList();
    ArrayList<String> answerFourListThree = new ArrayList();
    ArrayList<String> correctAnswerListThree = new ArrayList();
    ArrayList<ArrayList> answerListThree = new ArrayList();

    
    ArrayList<ArrayList> histLevelOne = new ArrayList();
    ArrayList<ArrayList> histLevelTwo = new ArrayList();
    ArrayList<ArrayList> histLevelThree = new ArrayList();

     HistoryModel() {

        answerListOne.add(answerOneListOne);
        answerListOne.add(answerTwoListOne);
        answerListOne.add(answerThreeListOne);
        answerListOne.add(answerFourListOne);

        answerListTwo.add(answerOneListTwo);
        answerListTwo.add(answerTwoListTwo);
        answerListTwo.add(answerThreeListTwo);
        answerListTwo.add(answerFourListTwo);

        answerListThree.add(answerOneListThree);
        answerListThree.add(answerTwoListThree);
        answerListThree.add(answerThreeListThree);
        answerListThree.add(answerFourListThree);

//level 1 difficulty History
        questionListOne.add("  Which number comes next: 42, 43, 44?");
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

        questionListOne.add("  Oscar had 17 pencils and gave 8 to Emily?");
        answerListOne.get(0).add("17");
        answerListOne.get(1).add("8");
        answerListOne.get(2).add("25");
        answerListOne.get(3).add("9");
        correctAnswerListOne.add("9");

        histLevelOne.add(questionListOne);
        histLevelOne.add(answerListOne);
        histLevelOne.add(correctAnswerListOne);

//level 2 difficulty Hist
        questionListTwo.add("  A normal stop sign has the shape of what geometrical figure?");
        answerListTwo.get(0).add("Pentarino");
        answerListTwo.get(1).add("Octagon");
        answerListTwo.get(2).add("Pentagon");
        answerListTwo.get(3).add("Square");
        correctAnswerListTwo.add("Octagon");
        //      [[a],[a]]
        //    [[b],[b]]
        //  [[c],[c]]
        //[[d],[d]]
        //[   [[a],[b],[c],[d]],   [[a],[b],[c],[d]] ,  [[a],[b],[c],[d]] ]

        questionListTwo.add("  What number must a year be divisible by to qualify as a leap year?");
        answerListTwo.get(0).add("5");
        answerListTwo.get(1).add("6");
        answerListTwo.get(2).add("4");
        answerListTwo.get(3).add("3");
        correctAnswerListTwo.add("4");

        questionListTwo.add("  How many total degrees are there among all the angles of a hexagon?");
        answerListTwo.get(0).add("700");
        answerListTwo.get(1).add("720");
        answerListTwo.get(2).add("730");
        answerListTwo.get(3).add("701");
        correctAnswerListTwo.add("720");

        histLevelTwo.add(questionListTwo);
        histLevelTwo.add(answerListTwo);
        histLevelTwo.add(correctAnswerListTwo);

// level 3 difficulty Hist


        questionListThree.add("  There are 123 boxes of candy at the warehouse. Each box contains 25 pieces of candy. How many pieces of candy are at the warehouse?");
        answerListThree.get(0).add("25");
        answerListThree.get(1).add("123");
        answerListThree.get(2).add("3075");
        answerListThree.get(3).add("148");
        correctAnswerListThree.add("3075");

        questionListThree.add("  There are 175 cards in a deck and four players. How many cards does each person get?");
        answerListThree.get(0).add("45 with 2 cards left");
        answerListThree.get(1).add("44 with 5 cards left");
        answerListThree.get(2).add("43 with 3 cards left");
        answerListThree.get(3).add("43 with 2 cards left");
        correctAnswerListThree.add("43 with 3 cards left");

        questionListThree.add("  Two friends buy a video game that costs $22 and recieve $6.50 as change?");
        answerListThree.get(0).add("$15.50");
        answerListThree.get(1).add("$6.50");
        answerListThree.get(2).add("16.50");
        answerListThree.get(3).add("15.00");
        correctAnswerListThree.add("$15.50");

        histLevelThree.add(questionListThree);
        histLevelThree.add(answerListThree);
        histLevelThree.add(correctAnswerListThree);

    }

    public ArrayList<ArrayList> getHistLevelOne() {
        return histLevelOne;
    }

    public void setHistLevelOne(ArrayList<ArrayList> histLevelOne) {
        this.histLevelOne = histLevelOne;
    }

    public ArrayList<ArrayList> getHistLevelTwo() {
        return histLevelTwo;
    }

    public void setHistLevelTwo(ArrayList<ArrayList> histLevelTwo) {
        this.histLevelTwo = histLevelTwo;
    }

    public ArrayList<ArrayList> getHistLevelThree() {
        return histLevelThree;
    }

    public void setHistLevelThree(ArrayList<ArrayList> histLevelThree) {
        this.histLevelThree = histLevelThree;
    }
}
