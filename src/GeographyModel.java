
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
public class GeographyModel {
 

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

    
    ArrayList<ArrayList> geoLevelOne = new ArrayList();
    ArrayList<ArrayList> geoLevelTwo = new ArrayList();
    ArrayList<ArrayList> geoLevelThree = new ArrayList();

     GeographyModel() {

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

//level 1 difficulty Geo
        questionListOne.add("  What is the name of the biggest ocean on Earth?");
        answerListOne.get(0).add("Pacific Ocean");
        answerListOne.get(1).add("Atlantic Ocean");
        answerListOne.get(2).add("Nile River");
        answerListOne.get(3).add("Indian Ocean");
        correctAnswerListOne.add("Pacific Ocean");

        questionListOne.add("  By area, what is the biggest state in the USA?");
        answerListOne.get(0).add("Texas");
        answerListOne.get(1).add("Alaska");
        answerListOne.get(2).add("Main");
        answerListOne.get(3).add("Arizona");
        correctAnswerListOne.add("Alaska");

        questionListOne.add("  What is the name of the highest mountain on Earth?");
        answerListOne.get(0).add("Sagarmatha");
        answerListOne.get(1).add("Mt Everest");
        answerListOne.get(2).add("America");
        answerListOne.get(3).add("canada height");
        correctAnswerListOne.add("Mt Everest");

        geoLevelOne.add(questionListOne);
        geoLevelOne.add(answerListOne);
        geoLevelOne.add(correctAnswerListOne);

//level 2 difficulty geo
        questionListTwo.add("  What is the largest continent?");
        answerListTwo.get(0).add("Asia");
        answerListTwo.get(1).add("America");
        answerListTwo.get(2).add("India");
        answerListTwo.get(3).add("Nepal");
        correctAnswerListTwo.add("Asia");
        //      [[a],[a]]
        //    [[b],[b]]
        //  [[c],[c]]
        //[[d],[d]]
        //[   [[a],[b],[c],[d]],   [[a],[b],[c],[d]] ,  [[a],[b],[c],[d]] ]

        questionListTwo.add("   The terms 'breeze' and 'gale' help describe the speed of what?");
        answerListTwo.get(0).add("wind");
        answerListTwo.get(1).add("water");
        answerListTwo.get(2).add("air");
        answerListTwo.get(3).add("cloud");
        correctAnswerListTwo.add("wind");

        questionListTwo.add("  What is the largest desert in the world?");
        answerListTwo.get(0).add("Kali");
        answerListTwo.get(1).add("Sahara");
        answerListTwo.get(2).add("hot");
        answerListTwo.get(3).add("cloudy");
        correctAnswerListTwo.add("Sahara");

        geoLevelTwo.add(questionListTwo);
        geoLevelTwo.add(answerListTwo);
        geoLevelTwo.add(correctAnswerListTwo);

// level 3 difficulty Geo


        questionListThree.add("   The Kalinigrad Oblast borders which body of water?");
        answerListThree.get(0).add("Mediterranean Sea");
        answerListThree.get(1).add("Baltic Sea");
        answerListThree.get(2).add("Gulf of Mexico");
        answerListThree.get(3).add("Gulf of Aden");
        correctAnswerListThree.add("Baltic Sea");

        questionListThree.add("  Pick the top two most spoken languages in the world");
        answerListThree.get(0).add("English and Spanish");
        answerListThree.get(1).add("English and Hindi");
        answerListThree.get(2).add("English");
        answerListThree.get(3).add("(D)English and Madrin Chinese");
        correctAnswerListThree.add("English and Madrin Chinese");

        questionListThree.add("  The capital of Fiji is_______");
        answerListThree.get(0).add("Suva");
        answerListThree.get(1).add("lova");
        answerListThree.get(2).add("kova");
        answerListThree.get(3).add("mova");
        correctAnswerListThree.add("Suva");

        geoLevelThree.add(questionListThree);
        geoLevelThree.add(answerListThree);
        geoLevelThree.add(correctAnswerListThree);

    }

    public ArrayList<ArrayList> getGeoLevelOne() {
        return geoLevelOne;
    }

    public void setGeoLevelOne(ArrayList<ArrayList> geoLevelOne) {
        this.geoLevelOne = geoLevelOne;
    }

    public ArrayList<ArrayList> getGeoLevelTwo() {
        return geoLevelTwo;
    }

    public void setGeoLevelTwo(ArrayList<ArrayList> geoLevelTwo) {
        this.geoLevelTwo = geoLevelTwo;
    }

    public ArrayList<ArrayList> getGeoLevelThree() {
        return geoLevelThree;
    }

    public void setGeoLevelThree(ArrayList<ArrayList> geoLevelThree) {
        this.geoLevelThree = geoLevelThree;
    }
}
 