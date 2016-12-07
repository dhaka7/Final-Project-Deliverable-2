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


    
    ArrayList<ArrayList> histLevelOne = new ArrayList();
    ArrayList<ArrayList> histLevelTwo = new ArrayList();
    ArrayList<ArrayList> histLevelThree = new ArrayList();

     HistoryModel() {

        answerListOne.add(answerOneListOne);
        answerListOne.add(answerTwoListOne);
        answerListOne.add(answerThreeListOne);
        answerListOne.add(answerFourListOne);


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
        
        questionListOne.add("   The Battle of Plassey was fought in ");
        answerListOne.get(0).add("1782");
        answerListOne.get(1).add("1757");
        answerListOne.get(2).add("1748");
        answerListOne.get(3).add("1764");
        correctAnswerListOne.add("1757");
        
        questionListOne.add("   ripitakas are sacred books of ");
        answerListOne.get(0).add("Buddhists");
        answerListOne.get(1).add("Hindus");
        answerListOne.get(2).add("Jains");
        answerListOne.get(3).add("none");
        correctAnswerListOne.add("Buddhists");
        
        questionListOne.add("   The trident-shaped symbol of Buddhism does not represent ");
        answerListOne.get(0).add("Nirvana");
        answerListOne.get(1).add("Sangha");
        answerListOne.get(2).add("Buddha");
        answerListOne.get(3).add("Dhamma");
        correctAnswerListOne.add("Nirvana");
        
        questionListOne.add("    ");
        answerListOne.get(0).add(" ");
        answerListOne.get(1).add(" ");
        answerListOne.get(2).add(" ");
        answerListOne.get(3).add(" ");
        correctAnswerListOne.add(" ");
        
        questionListOne.add("    ");
        answerListOne.get(0).add(" ");
        answerListOne.get(1).add(" ");
        answerListOne.get(2).add(" ");
        answerListOne.get(3).add(" ");
        correctAnswerListOne.add(" ");
        
        questionListOne.add("    ");
        answerListOne.get(0).add(" ");
        answerListOne.get(1).add(" ");
        answerListOne.get(2).add(" ");
        answerListOne.get(3).add(" ");
        correctAnswerListOne.add(" ");
        
        questionListOne.add("    ");
        answerListOne.get(0).add(" ");
        answerListOne.get(1).add(" ");
        answerListOne.get(2).add(" ");
        answerListOne.get(3).add(" ");
        correctAnswerListOne.add(" ");

        

//level 2 difficulty Hist
        questionListOne.add("  The first successful printing press was developed by");
        answerListOne.get(0).add("Johannes");
        answerListOne.get(1).add("Benjamin");
        answerListOne.get(2).add("no");
        answerListOne.get(3).add("skip");
        correctAnswerListOne.add("Johannes");
        //      [[a],[a]]
        //    [[b],[b]]
        //  [[c],[c]]
        //[[d],[d]]
        //[   [[a],[b],[c],[d]],   [[a],[b],[c],[d]] ,  [[a],[b],[c],[d]] ]

        questionListOne.add("  World War I began in which year?");
        answerListOne.get(0).add("1914");
        answerListOne.get(1).add("1915");
        answerListOne.get(2).add("1916");
        answerListOne.get(3).add("1917");
        correctAnswerListOne.add("1914");

        questionListOne.add("  The Khmer Rouge was a regime ruling this nation in the 20th century.");
        answerListOne.get(0).add("India");
        answerListOne.get(1).add("Canada");
        answerListOne.get(2).add("Cambodia");
        answerListOne.get(3).add("Nepal");
        correctAnswerListOne.add("Cambodia");
        
        questionListOne.add("    ");
        answerListOne.get(0).add(" ");
        answerListOne.get(1).add(" ");
        answerListOne.get(2).add(" ");
        answerListOne.get(3).add(" ");
        correctAnswerListOne.add(" ");
        
        questionListOne.add("    ");
        answerListOne.get(0).add(" ");
        answerListOne.get(1).add(" ");
        answerListOne.get(2).add(" ");
        answerListOne.get(3).add(" ");
        correctAnswerListOne.add(" ");
        
        questionListOne.add("    ");
        answerListOne.get(0).add(" ");
        answerListOne.get(1).add(" ");
        answerListOne.get(2).add(" ");
        answerListOne.get(3).add(" ");
        correctAnswerListOne.add(" ");
        
        questionListOne.add("    ");
        answerListOne.get(0).add(" ");
        answerListOne.get(1).add(" ");
        answerListOne.get(2).add(" ");
        answerListOne.get(3).add(" ");
        correctAnswerListOne.add(" ");
        
        questionListOne.add("    ");
        answerListOne.get(0).add(" ");
        answerListOne.get(1).add(" ");
        answerListOne.get(2).add(" ");
        answerListOne.get(3).add(" ");
        correctAnswerListOne.add(" ");
        
        questionListOne.add("    ");
        answerListOne.get(0).add(" ");
        answerListOne.get(1).add(" ");
        answerListOne.get(2).add(" ");
        answerListOne.get(3).add(" ");
        correctAnswerListOne.add(" ");
        
        questionListOne.add("    ");
        answerListOne.get(0).add(" ");
        answerListOne.get(1).add(" ");
        answerListOne.get(2).add(" ");
        answerListOne.get(3).add(" ");
        correctAnswerListOne.add(" ");

       

// level 3 difficulty Hist


        questionListOne.add("  Which general famously stated 'I shall return'?");
        answerListOne.get(0).add("George Patton");
        answerListOne.get(1).add("Bull Halsey");
        answerListOne.get(2).add("Douglas MacArthur");
        answerListOne.get(3).add("Omar");
        correctAnswerListOne.add("Douglas MacArthur");

        questionListOne.add("  The Magna Carta was published by the King of which country?");
        answerListOne.get(0).add("45 with 2 cards left");
        answerListOne.get(1).add("44 with 5 cards left");
        answerListOne.get(2).add("43 with 3 cards left");
        answerListOne.get(3).add("43 with 2 cards left");
        correctAnswerListOne.add("43 with 3 cards left");

        questionListOne.add("  Two friends buy a video game that costs $22 and recieve $6.50 as change?");
        answerListOne.get(0).add("France");
        answerListOne.get(1).add("Austria");
        answerListOne.get(2).add("Italy");
        answerListOne.get(3).add("England");
        correctAnswerListOne.add("England");
        
        questionListOne.add("    ");
        answerListOne.get(0).add(" ");
        answerListOne.get(1).add(" ");
        answerListOne.get(2).add(" ");
        answerListOne.get(3).add(" ");
        correctAnswerListOne.add(" ");
        
        questionListOne.add("    ");
        answerListOne.get(0).add(" ");
        answerListOne.get(1).add(" ");
        answerListOne.get(2).add(" ");
        answerListOne.get(3).add(" ");
        correctAnswerListOne.add(" ");
        
        questionListOne.add("    ");
        answerListOne.get(0).add(" ");
        answerListOne.get(1).add(" ");
        answerListOne.get(2).add(" ");
        answerListOne.get(3).add(" ");
        correctAnswerListOne.add(" ");
        
        questionListOne.add("    ");
        answerListOne.get(0).add(" ");
        answerListOne.get(1).add(" ");
        answerListOne.get(2).add(" ");
        answerListOne.get(3).add(" ");
        correctAnswerListOne.add(" ");
        
        questionListOne.add("    ");
        answerListOne.get(0).add(" ");
        answerListOne.get(1).add(" ");
        answerListOne.get(2).add(" ");
        answerListOne.get(3).add(" ");
        correctAnswerListOne.add(" ");
        
        questionListOne.add("    ");
        answerListOne.get(0).add(" ");
        answerListOne.get(1).add(" ");
        answerListOne.get(2).add(" ");
        answerListOne.get(3).add(" ");
        correctAnswerListOne.add(" ");
        
        questionListOne.add("    ");
        answerListOne.get(0).add(" ");
        answerListOne.get(1).add(" ");
        answerListOne.get(2).add(" ");
        answerListOne.get(3).add(" ");
        correctAnswerListOne.add(" ");

        histLevelOne.add(questionListOne);
        histLevelOne.add(answerListOne);
        histLevelOne.add(correctAnswerListOne);

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