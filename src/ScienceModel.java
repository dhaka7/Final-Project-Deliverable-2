
import java.util.ArrayList;

/**
 *
 * @author ohs5008
 */
public class ScienceModel {
    
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

    
    ArrayList<ArrayList> sciLevelOne = new ArrayList();
    ArrayList<ArrayList> sciLevelTwo = new ArrayList();
    ArrayList<ArrayList> sciLevelThree = new ArrayList();       

    ScienceModel() {

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
        
//level 1 Difficulty Science         
        questionListOne.add("   Which of the following is used in pencils? ");
        answerListOne.get(0).add("Graphite");
        answerListOne.get(1).add("Silicon");
        answerListOne.get(2).add("Charcoal");
        answerListOne.get(3).add("None");
        correctAnswerListOne.add("Graphite");

        questionListOne.add("   Which of the following metals forms an amalgam with other metals?");
        answerListOne.get(0).add("Tin ");
        answerListOne.get(1).add("Mercury ");
        answerListOne.get(2).add("Lead ");
        answerListOne.get(3).add("Zinc ");
        correctAnswerListOne.add("Mercury ");

        questionListOne.add(" Chemical formula for water is ");
        answerListOne.get(0).add("NaAlO2");
        answerListOne.get(1).add("H2O");
        answerListOne.get(2).add("Al2O3");
        answerListOne.get(3).add("CaSiO3");
        correctAnswerListOne.add("H2O");
        
        sciLevelOne.add(questionListOne);
        sciLevelOne.add(answerListOne);
        sciLevelOne.add(correctAnswerListOne);

//level 2 Difficulty Science  
        questionListTwo.add("  Which of the gas is not known as green house gas? ");
        answerListTwo.get(0).add("Methane");
        answerListTwo.get(1).add("Nitrous");
        answerListTwo.get(2).add("Carbon");
        answerListTwo.get(3).add("Hydrogen");
        correctAnswerListTwo.add("Hydrogen");

        questionListTwo.add(" The hardest substance available on earth is ");
        answerListTwo.get(0).add("Diamond");
        answerListTwo.get(1).add("Gold");
        answerListTwo.get(2).add("Iron");
        answerListTwo.get(3).add("Silver");
        correctAnswerListTwo.add("Diamond");

        questionListTwo.add(" The average salinity of sea water is");
        answerListTwo.get(0).add("3%");
        answerListTwo.get(1).add("3.5%");
        answerListTwo.get(2).add("2.5%");
        answerListTwo.get(3).add("2%");
        correctAnswerListTwo.add("3.5%");

        sciLevelTwo.add(questionListTwo);
        sciLevelTwo.add(answerListTwo);
        sciLevelTwo.add(correctAnswerListTwo);
        
//level 3 Difficulty Science    
        questionListThree.add(" The inert gas which is substituted for nitrogen in the air used by deep sea divers for breathing, is");
        answerListThree.get(0).add("Argon");
        answerListThree.get(1).add("Xenon");
        answerListThree.get(2).add("Helium");
        answerListThree.get(3).add("Krypton");
        correctAnswerListThree.add("Helium");

        questionListThree.add(" Heavy water is");
        answerListThree.get(0).add("deuterium oxide");
        answerListThree.get(1).add("PH7");
        answerListThree.get(2).add("rain water");
        answerListThree.get(3).add("tritium oxide");
        correctAnswerListThree.add("deuterium oxide");

        questionListThree.add(" The element common to all acids is");
        answerListThree.get(0).add("hydrogen");
        answerListThree.get(1).add("carbon");
        answerListThree.get(2).add("sulphur");
        answerListThree.get(3).add("NONE");
        correctAnswerListThree.add("Radius");

        sciLevelThree.add(questionListThree);
        sciLevelThree.add(answerListThree);
        sciLevelThree.add(correctAnswerListThree);
    }

    public ArrayList<ArrayList> getSciLevelOne() {
        return sciLevelOne;
    }

    public void setSciLevelOne(ArrayList<ArrayList> sciLevelOne) {
        this.sciLevelOne = sciLevelOne;
    }

    public ArrayList<ArrayList> getSciLevelTwo() {
        return sciLevelTwo;
    }

    public void setSciLevelTwo(ArrayList<ArrayList> sciLevelTwo) {
        this.sciLevelTwo = sciLevelTwo;
    }

    public ArrayList<ArrayList> getSciLevelThree() {
        return sciLevelThree;
    }

    public void setSciLevelThree(ArrayList<ArrayList> sciLevelThree) {
        this.sciLevelThree = sciLevelThree;
    }
    
}
