import java.util.ArrayList;
import java.util.Random;

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

    
    ArrayList<ArrayList> histLevelOne = new ArrayList();
    ArrayList<ArrayList> histLevelGen = new ArrayList();
    
    
 
     HistoryModel() {

        answerListOne.add(answerOneListOne);
        answerListOne.add(answerTwoListOne);
        answerListOne.add(answerThreeListOne);
        answerListOne.add(answerFourListOne);

        
        answerListGen.add(answerOneListGen);
        answerListGen.add(answerTwoListGen);
        answerListGen.add(answerThreeListGen);
        answerListGen.add(answerFourListGen);

        

        questionListOne.add("  How many state in the United States? ");
        answerListOne.get(0).add("50");
        answerListOne.get(1).add("51");
        answerListOne.get(2).add("52");
        answerListOne.get(3).add("none");
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
        
        questionListOne.add("  The system of competitive examination for civil service was accepted in principle in the year  ");
        answerListOne.get(0).add("1833");
        answerListOne.get(1).add("1853");
        answerListOne.get(2).add("1858");
        answerListOne.get(3).add("1882");
        correctAnswerListOne.add("1853");
        
        questionListOne.add("   When was the Civil War? ");
        answerListOne.get(0).add("1850");
        answerListOne.get(1).add("1900");
        answerListOne.get(2).add("1950");
        answerListOne.get(3).add("2000");
        correctAnswerListOne.add("1850");
        
        questionListOne.add("  Who said Give me liberty or give me death?");
        answerListOne.get(0).add("Patrick");
        answerListOne.get(1).add("Adams");
        answerListOne.get(2).add("Samuel");
        answerListOne.get(3).add("none");
        correctAnswerListOne.add("Patrick");
        
        questionListOne.add("  The first successful printing press was developed by");
        answerListOne.get(0).add("Johannes");
        answerListOne.get(1).add("Benjamin");
        answerListOne.get(2).add("no");
        answerListOne.get(3).add("skip");
        correctAnswerListOne.add("Johannes");
        

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
        
        questionListOne.add("  The term \"Reconstruction\" refers to  ");
        answerListOne.get(0).add("Payment");
        answerListOne.get(1).add("Repairing");
        answerListOne.get(2).add("Readmission");
        answerListOne.get(3).add("Rebuilding");
        correctAnswerListOne.add("Readmission");
        
        questionListOne.add(" The Missouri Compromise was the act that:   ");
        answerListOne.get(0).add("Founded");
        answerListOne.get(1).add("Granted");
        answerListOne.get(2).add("Settled");
        answerListOne.get(3).add("Asmitted");
        correctAnswerListOne.add("Admitted");
        
        questionListOne.add("   On what peninsula in Washington would you find the Olympic Mountains? ");
        answerListOne.get(0).add("Seattle");
        answerListOne.get(1).add("Puget");
        answerListOne.get(2).add("Washington");
        answerListOne.get(3).add("Olympic");
        correctAnswerListOne.add("Olympic");
        
        questionListOne.add("  What is a nickname for people from Maine?  ");
        answerListOne.get(0).add("Mainlanders");
        answerListOne.get(1).add("Southers");
        answerListOne.get(2).add("Easters");
        answerListOne.get(3).add("Uplanders");
        correctAnswerListOne.add("Easters");
        
        questionListOne.add("  What is the capital of Illinois?  ");
        answerListOne.get(0).add("Springfield");
        answerListOne.get(1).add("Streator");
        answerListOne.get(2).add("Urbana");
        answerListOne.get(3).add("Chicago");
        correctAnswerListOne.add("Springfield");
        
        questionListOne.add(" In what American state would you find Denali?   ");
        answerListOne.get(0).add("Arizona");
        answerListOne.get(1).add("Alabama");
        answerListOne.get(2).add("Alaska");
        answerListOne.get(3).add("Arkansas");
        correctAnswerListOne.add("Alaska");


        questionListOne.add("  Which general famously stated 'I shall return'?");
        answerListOne.get(0).add("George");
        answerListOne.get(1).add("Bull");
        answerListOne.get(2).add("Douglas");
        answerListOne.get(3).add("Omar");
        correctAnswerListOne.add("Douglas");

        questionListOne.add("  The Magna Carta was published by the King of which country?");
        answerListOne.get(0).add("45");
        answerListOne.get(1).add("44");
        answerListOne.get(2).add("43");
        answerListOne.get(3).add("48");
        correctAnswerListOne.add("43");

        questionListOne.add("  Two friends buy a video game that costs $22 and recieve $6.50 as change?");
        answerListOne.get(0).add("France");
        answerListOne.get(1).add("Austria");
        answerListOne.get(2).add("Italy");
        answerListOne.get(3).add("England");
        correctAnswerListOne.add("England");
        
        questionListOne.add(" n which city would you find the Statue of Liberty?   ");
        answerListOne.get(0).add("Philadelphia");
        answerListOne.get(1).add("newyork");
        answerListOne.get(2).add("Francisco");
        answerListOne.get(3).add("california");
        correctAnswerListOne.add("newyork");
        
        questionListOne.add("  Through which national park does the Continental Divide not pass?  ");
        answerListOne.get(0).add("Yellowstone");
        answerListOne.get(1).add("Glacier");
        answerListOne.get(2).add("Mountain");
        answerListOne.get(3).add("Yosemite");
        correctAnswerListOne.add("Yosemite");
        
        questionListOne.add("  What automobile was named after Henry Ford’s only son?  ");
        answerListOne.get(0).add("Oldsmobile");
        answerListOne.get(1).add("Buick");
        answerListOne.get(2).add("Isuzu");
        answerListOne.get(3).add("Edsel");
        correctAnswerListOne.add("Edsel");
        
        questionListOne.add(" Which state seceded from Virginia in 1863?   ");
        answerListOne.get(0).add("Carolina");
        answerListOne.get(1).add("Maryland");
        answerListOne.get(2).add("Virginia");
        answerListOne.get(3).add("Columbia");
        correctAnswerListOne.add("Virginia");
        
        histLevelOne.add(questionListOne);
        histLevelOne.add(answerListOne);
        histLevelOne.add(correctAnswerListOne);

        
        for (int i = 0; i < 5; i++) {
            int randIndex = rand.nextInt(questionListOne.size());
            questionListGen.add(questionListOne.get(randIndex));
            answerListGen.get(0).add(answerListOne.get(0).get(randIndex));
            answerListGen.get(1).add(answerListOne.get(1).get(randIndex));
            answerListGen.get(2).add(answerListOne.get(2).get(randIndex));
            answerListGen.get(3).add(answerListOne.get(3).get(randIndex));
            correctAnswerListGen.add(correctAnswerListOne.get(randIndex));
        }

        histLevelGen.add(questionListGen);
        histLevelGen.add(answerListGen);
        histLevelGen.add(correctAnswerListGen);

        
    }

    public ArrayList<ArrayList> getHistLevelGen() {
        return histLevelGen;
    }

    public void setHistLevelGen(ArrayList<ArrayList> histLevelGen) {
        this.histLevelGen = histLevelGen;
    }

    public ArrayList<ArrayList> getHistLevelOne() {
        return histLevelOne;
    }

    public void setHistLevelOne(ArrayList<ArrayList> histLevelOne) {
        this.histLevelOne = histLevelOne;
    }
}
