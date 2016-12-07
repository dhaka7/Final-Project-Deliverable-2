
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
        questionListOne.add("  How many state in the United States? ");
        answerListOne.get(0).add("50");
        answerListOne.get(1).add("51");
        answerListOne.get(2).add("52");
        answerListOne.get(3).add("I dont know");
        correctAnswerListOne.add("50");

        questionListOne.add(" World War II began in which year?");
        answerListOne.get(0).add("1919");
        answerListOne.get(1).add("1918");
        answerListOne.get(2).add("1917");
        answerListOne.get(3).add("1939");
        correctAnswerListOne.add("1939");

        questionListOne.add("  Adolf Hitler was born in which country?");
        answerListOne.get(0).add("France");
        answerListOne.get(1).add("India");
        answerListOne.get(2).add("Austria");
        answerListOne.get(3).add("Germany");
        correctAnswerListOne.add("Austria");

        histLevelOne.add(questionListOne);
        histLevelOne.add(answerListOne);
        histLevelOne.add(correctAnswerListOne);

//level 2 difficulty Hist
        questionListTwo.add("  The first successful printing press was developed by");
        answerListTwo.get(0).add("Johannes");
        answerListTwo.get(1).add("Benjamin");
        answerListTwo.get(2).add("no");
        answerListTwo.get(3).add("skip");
        correctAnswerListTwo.add("Johannes");
        //      [[a],[a]]
        //    [[b],[b]]
        //  [[c],[c]]
        //[[d],[d]]
        //[   [[a],[b],[c],[d]],   [[a],[b],[c],[d]] ,  [[a],[b],[c],[d]] ]

        questionListTwo.add("  World War I began in which year?");
        answerListTwo.get(0).add("1914");
        answerListTwo.get(1).add("1915");
        answerListTwo.get(2).add("1916");
        answerListTwo.get(3).add("1917");
        correctAnswerListTwo.add("1914");

        questionListTwo.add("  The Khmer Rouge was a regime ruling this nation in the 20th century.");
        answerListTwo.get(0).add("India");
        answerListTwo.get(1).add("Canada");
        answerListTwo.get(2).add("Cambodia");
        answerListTwo.get(3).add("Nepal");
        correctAnswerListTwo.add("Cambodia");

        histLevelTwo.add(questionListTwo);
        histLevelTwo.add(answerListTwo);
        histLevelTwo.add(correctAnswerListTwo);

// level 3 difficulty Hist


        questionListThree.add("  Which general famously stated 'I shall return'?");
        answerListThree.get(0).add("George Patton");
        answerListThree.get(1).add("Bull Halsey");
        answerListThree.get(2).add("Douglas MacArthur");
        answerListThree.get(3).add("Omar");
        correctAnswerListThree.add("Douglas MacArthur");

        questionListThree.add("  The Magna Carta was published by the King of which country?");
        answerListThree.get(0).add("45 with 2 cards left");
        answerListThree.get(1).add("44 with 5 cards left");
        answerListThree.get(2).add("43 with 3 cards left");
        answerListThree.get(3).add("43 with 2 cards left");
        correctAnswerListThree.add("43 with 3 cards left");

        questionListThree.add("  Two friends buy a video game that costs $22 and recieve $6.50 as change?");
        answerListThree.get(0).add("France");
        answerListThree.get(1).add("Austria");
        answerListThree.get(2).add("Italy");
        answerListThree.get(3).add("England");
        correctAnswerListThree.add("England");

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
