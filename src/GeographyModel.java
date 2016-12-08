
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
public class GeographyModel {
    
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

    
    ArrayList<ArrayList> geoLevelOne = new ArrayList();
    ArrayList<ArrayList> geoLevelGen = new ArrayList();  

    GeographyModel() {

        answerListOne.add(answerOneListOne);
        answerListOne.add(answerTwoListOne);
        answerListOne.add(answerThreeListOne);
        answerListOne.add(answerFourListOne);

        answerListGen.add(answerOneListGen);
        answerListGen.add(answerTwoListGen);
        answerListGen.add(answerThreeListGen);
        answerListGen.add(answerFourListGen);

        
        questionListOne.add("  What is the name of the biggest ocean on Earth?");
        answerListOne.get(0).add("Pacific");
        answerListOne.get(1).add("Atlantic");
        answerListOne.get(2).add("Nile");
        answerListOne.get(3).add("Indian");
        correctAnswerListOne.add("Pacific");

        questionListOne.add("  By area, what is the biggest state in the USA?");
        answerListOne.get(0).add("Texas");
        answerListOne.get(1).add("Alaska");
        answerListOne.get(2).add("Main");
        answerListOne.get(3).add("Arizona");
        correctAnswerListOne.add("Alaska");

        questionListOne.add("  What is the name of the highest mountain on Earth?");
        answerListOne.get(0).add("Sagarmatha");
        answerListOne.get(1).add("Everest");
        answerListOne.get(2).add("America");
        answerListOne.get(3).add("height");
        correctAnswerListOne.add("Everest");

        questionListOne.add("  True or False: Iceland is covered in ice");
        answerListOne.get(0).add("True");
        answerListOne.get(1).add("False");
        answerListOne.get(2).add("ice");
        answerListOne.get(3).add("none");
        correctAnswerListOne.add("False ");

        questionListOne.add(" which ocean lies on the east coast of the United States ");
        answerListOne.get(0).add("Pacific");
        answerListOne.get(1).add("Atlantic");
        answerListOne.get(2).add("Nile");
        answerListOne.get(3).add("Indian");
        correctAnswerListOne.add("Atlantic");

        questionListOne.add("  How many Great Lakes are there");
        answerListOne.get(0).add("5");
        answerListOne.get(1).add("4");
        answerListOne.get(2).add("3");
        answerListOne.get(3).add("2");
        correctAnswerListOne.add("5");

        questionListOne.add("  Which is the longest river in the U.S.");
        answerListOne.get(0).add("Missouri");
        answerListOne.get(1).add("Yukon");
        answerListOne.get(2).add("Colorado");
        answerListOne.get(3).add("Indian");
        correctAnswerListOne.add("Missouri");

        questionListOne.add("  which of these cities is not in Europe? ");
        answerListOne.get(0).add("Madrid");
        answerListOne.get(1).add("Barcelona");
        answerListOne.get(2).add("pargue");
        answerListOne.get(3).add("Moscow");
        correctAnswerListOne.add("Moscow");

        questionListOne.add("   The location distance north or south of the equator is");
        answerListOne.get(0).add("longitude");
        answerListOne.get(1).add("latitude");
        answerListOne.get(2).add("location");
        answerListOne.get(3).add("none");
        correctAnswerListOne.add("latitude");

        questionListOne.add("  What is the largest continent?");
        answerListOne.get(0).add("Asia");
        answerListOne.get(1).add("America");
        answerListOne.get(2).add("India");
        answerListOne.get(3).add("Nepal");
        correctAnswerListOne.add("Asia");

        questionListOne.add("   The terms 'breeze' and 'gale' help describe the speed of what?");
        answerListOne.get(0).add("wind");
        answerListOne.get(1).add("water");
        answerListOne.get(2).add("air");
        answerListOne.get(3).add("cloud");
        correctAnswerListOne.add("wind");

        questionListOne.add("  What is the largest desert in the world?");
        answerListOne.get(0).add("Kali");
        answerListOne.get(1).add("Sahara");
        answerListOne.get(2).add("hot");
        answerListOne.get(3).add("cloudy");
        correctAnswerListOne.add("Sahara");

        questionListOne.add("  The United kingdom is comparied of hoe many countries? ");
        answerListOne.get(0).add("4");
        answerListOne.get(1).add("5");
        answerListOne.get(2).add("6");
        answerListOne.get(3).add("7");
        correctAnswerListOne.add("4");

        questionListOne.add("  Which of the following countries do not border France");
        answerListOne.get(0).add("Germany");
        answerListOne.get(1).add("Italy");
        answerListOne.get(2).add("Netherland");
        answerListOne.get(3).add("Spain");
        correctAnswerListOne.add("Netherland");

        questionListOne.add("  What is the imaginary line called that connects the north and south pole?");
        answerListOne.get(0).add("Line");
        answerListOne.get(1).add("Meridian");
        answerListOne.get(2).add("Axis");
        answerListOne.get(3).add("none");
        correctAnswerListOne.add("Meridian");

        questionListOne.add("  Between which is countries/states is the Bering Strait located?");
        answerListOne.get(0).add("Alaska");
        answerListOne.get(1).add("Usa");
        answerListOne.get(2).add("France");
        answerListOne.get(3).add("Finland");
        correctAnswerListOne.add("Alaska");

        questionListOne.add(" Which U.S. state is the Grand Canyon located in? ");
        answerListOne.get(0).add("Nevada");
        answerListOne.get(1).add("Arizona");
        answerListOne.get(2).add("Mexico");
        answerListOne.get(3).add("Wyoming ");
        correctAnswerListOne.add("Arizona");

        questionListOne.add(" Which is the longest river in the world? ");
        answerListOne.get(0).add("Nile");
        answerListOne.get(1).add("Amazon");
        answerListOne.get(2).add("Yellow");
        answerListOne.get(3).add("Congo");
        correctAnswerListOne.add("Nile");

        questionListOne.add(" What is this colored area of land called? ");
        answerListOne.get(0).add("MiddleEast");
        answerListOne.get(1).add("Arbian");
        answerListOne.get(2).add("Berian");
        answerListOne.get(3).add("Saharan");
        correctAnswerListOne.add("Arbian");

        questionListOne.add("   The Kalinigrad Oblast borders which body of water?");
        answerListOne.get(0).add("Mediterranean");
        answerListOne.get(1).add("Baltic");
        answerListOne.get(2).add("Gulf");
        answerListOne.get(3).add("Aden");
        correctAnswerListOne.add("Baltic");

        questionListOne.add("  Pick the top  most spoken languages in the world");
        answerListOne.get(0).add("English-Spanish");
        answerListOne.get(1).add("English-Hindi");
        answerListOne.get(2).add("English");
        answerListOne.get(3).add("English-Madrin Chinese");
        correctAnswerListOne.add("English-Madrin Chinese");

        questionListOne.add(" The capital of Fiji is_______ ");
        answerListOne.get(0).add("Suva");
        answerListOne.get(1).add("Lova");
        answerListOne.get(2).add("Kova");
        answerListOne.get(3).add("Mova");
        correctAnswerListOne.add("Suva");

        questionListOne.add(" Which is the largest body of water? ");
        answerListOne.get(0).add("Atlantic");
        answerListOne.get(1).add("Indian");
        answerListOne.get(2).add("Pacific");
        answerListOne.get(3).add("American");
        correctAnswerListOne.add("Pacific");

        questionListOne.add(" Which is the smallest country, measured by total land area? ");
        answerListOne.get(0).add("Maldives");
        answerListOne.get(1).add("Monaco");
        answerListOne.get(2).add("Vatican");
        answerListOne.get(3).add("Gettysburg");
        correctAnswerListOne.add("Vatican");

        questionListOne.add(" What is the approximate size of Earth's equator? ");
        answerListOne.get(0).add("40,000km");
        answerListOne.get(1).add("30,000km");
        answerListOne.get(2).add("20,000km");
        answerListOne.get(3).add("50,000km");
        correctAnswerListOne.add("40,000km");

        questionListOne.add(" The Homolographic projection has the correct representation of ");
        answerListOne.get(0).add("shape");
        answerListOne.get(1).add("area");
        answerListOne.get(2).add("baring");
        answerListOne.get(3).add("distance");
        correctAnswerListOne.add("area");

        questionListOne.add(" The great Victoria Desert is located in ");
        answerListOne.get(0).add("Canada");
        answerListOne.get(1).add("USA");
        answerListOne.get(2).add("Australia");
        answerListOne.get(3).add("America");
        correctAnswerListOne.add("Australia");

        questionListOne.add(" The intersecting lines drawn on maps and globes are ");
        answerListOne.get(0).add("latitudes");
        answerListOne.get(1).add("longitudes");
        answerListOne.get(2).add("geographic");
        answerListOne.get(3).add("None");
        correctAnswerListOne.add("geographic");

        questionListOne.add(" The landmass of which of the following continents is the least? ");
        answerListOne.get(0).add("Africa");
        answerListOne.get(1).add("Asia");
        answerListOne.get(2).add("Australia");
        answerListOne.get(3).add("Europe");
        correctAnswerListOne.add("Australia");

        geoLevelOne.add(questionListOne);
        geoLevelOne.add(answerListOne);
        geoLevelOne.add(correctAnswerListOne);


        for (int i = 0; i < 5; i++) {
            int randIndex = rand.nextInt(questionListOne.size());
            questionListGen.add(questionListOne.get(randIndex));
            answerListGen.get(0).add(answerListOne.get(0).get(randIndex));
            answerListGen.get(1).add(answerListOne.get(1).get(randIndex));
            answerListGen.get(2).add(answerListOne.get(2).get(randIndex));
            answerListGen.get(3).add(answerListOne.get(3).get(randIndex));
            correctAnswerListGen.add(correctAnswerListOne.get(randIndex));
        }

        geoLevelGen.add(questionListGen);
        geoLevelGen.add(answerListGen);
        geoLevelGen.add(correctAnswerListGen);

    }

    public ArrayList<ArrayList> getGeoLevelGen() {
        return geoLevelGen;
    }

    public void setGeoLevelGen(ArrayList<ArrayList> geoLevelGen) {
        this.geoLevelGen = geoLevelGen;
    }

    public ArrayList<ArrayList> getGeoLevelOne() {
        return geoLevelOne;
    }

    public void setGeoLevelOne(ArrayList<ArrayList> geoLevelOne) {
        this.geoLevelOne = geoLevelOne;
    }
}
