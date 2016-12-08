
import java.util.ArrayList;
import java.util.Random;

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

    ArrayList<String> questionListGen = new ArrayList();
    ArrayList<String> answerOneListGen = new ArrayList();
    ArrayList<String> answerTwoListGen = new ArrayList();
    ArrayList<String> answerThreeListGen = new ArrayList();
    ArrayList<String> answerFourListGen = new ArrayList();
    ArrayList<String> correctAnswerListGen = new ArrayList();


     ArrayList<ArrayList> answerListOne = new ArrayList();
    ArrayList<ArrayList> answerListGen = new ArrayList();

    
    ArrayList<ArrayList> sciLevelOne = new ArrayList();
    ArrayList<ArrayList> sciLevelGen = new ArrayList();
    
Random rand = new Random();

    ScienceModel() {

        answerListOne.add(answerOneListOne);
        answerListOne.add(answerTwoListOne);
        answerListOne.add(answerThreeListOne);
        answerListOne.add(answerFourListOne);

        answerListGen.add(answerOneListGen);
        answerListGen.add(answerTwoListGen);
        answerListGen.add(answerThreeListGen);
        answerListGen.add(answerFourListGen);

        questionListOne.add(" Which of the following is used in pencils? ");
        answerListOne.get(0).add("Graphite");
        answerListOne.get(1).add("Silicon");
        answerListOne.get(2).add("Charcoal");
        answerListOne.get(3).add("None");
        correctAnswerListOne.add("Graphite");

        questionListOne.add("   Which of the following metals forms an amalgam with other metals?");
        answerListOne.get(0).add("Tin");
        answerListOne.get(1).add("Mercury");
        answerListOne.get(2).add("Lead");
        answerListOne.get(3).add("Zinc");
        correctAnswerListOne.add("Mercury");

        questionListOne.add(" Chemical formula for water is ");
        answerListOne.get(0).add("NaAlO2");
        answerListOne.get(1).add("H2O");
        answerListOne.get(2).add("Al2O3");
        answerListOne.get(3).add("CaSiO3");
        correctAnswerListOne.add("H2O");

        questionListOne.add("  Which of the gas is not known as green house gas? ");
        answerListOne.get(0).add("Methane");
        answerListOne.get(1).add("Nitrous");
        answerListOne.get(2).add("Carbon");
        answerListOne.get(3).add("Hydrogen");
        correctAnswerListOne.add("Hydrogen");

        questionListOne.add(" The hardest substance available on earth is ");
        answerListOne.get(0).add("Diamond");
        answerListOne.get(1).add("Gold");
        answerListOne.get(2).add("Iron");
        answerListOne.get(3).add("Silver");
        correctAnswerListOne.add("Diamond");

        questionListOne.add(" The average salinity of sea water is");
        answerListOne.get(0).add("3%");
        answerListOne.get(1).add("3.5%");
        answerListOne.get(2).add("2.5%");
        answerListOne.get(3).add("2%");
        correctAnswerListOne.add("3.5%");

        questionListOne.add(" The inert gas which is substituted for nitrogen in the air used by deep sea divers for breathing, is");
        answerListOne.get(0).add("Argon");
        answerListOne.get(1).add("Xenon");
        answerListOne.get(2).add("Helium");
        answerListOne.get(3).add("Krypton");
        correctAnswerListOne.add("Helium");

        questionListOne.add(" Heavy water is");
        answerListOne.get(0).add("Deuterium");
        answerListOne.get(1).add("PH7");
        answerListOne.get(2).add("Rain");
        answerListOne.get(3).add("Tritium");
        correctAnswerListOne.add("Deuterium");

        questionListOne.add(" The element common to all acids is");
        answerListOne.get(0).add("Hydrogen");
        answerListOne.get(1).add("Carbon");
        answerListOne.get(2).add("Sulphur");
        answerListOne.get(3).add("Radius");
        correctAnswerListOne.add("Radius");

        questionListOne.add(" When was the first plastic made of artificial materials patented? ");
        answerListOne.get(0).add("1909");
        answerListOne.get(1).add("1945");
        answerListOne.get(2).add("2003");
        answerListOne.get(3).add("1920");
        correctAnswerListOne.add("1909");

        questionListOne.add("Which of the following technological developments came first? ");
        answerListOne.get(0).add("Telegraph");
        answerListOne.get(1).add("Telescope");
        answerListOne.get(2).add("Teletype");
        answerListOne.get(3).add("Telephone");
        correctAnswerListOne.add("Telescope");

        questionListOne.add("Who invented the geodesic dome? ");
        answerListOne.get(0).add("Samuel");
        answerListOne.get(1).add("Morse");
        answerListOne.get(2).add("Einstein");
        answerListOne.get(3).add("Fuller");
        correctAnswerListOne.add("Fuller"); 

        questionListOne.add(" Moths are a member of what order?");
        answerListOne.get(0).add("Optica");
        answerListOne.get(1).add("Lepidoptera");
        answerListOne.get(2).add("Leprosy");
        answerListOne.get(3).add("Octagon");
        correctAnswerListOne.add("Lepidoptera");

        questionListOne.add(" A baby blue whale drinks this many liters of milk per day:");
        answerListOne.get(0).add("10");
        answerListOne.get(1).add("190");
        answerListOne.get(2).add("50");
        answerListOne.get(3).add("500");
        correctAnswerListOne.add("190");

        questionListOne.add("For what is the Jurassic period named? ");
        answerListOne.get(0).add("Soccer");
        answerListOne.get(1).add("Mountain");
        answerListOne.get(2).add("Kind");
        answerListOne.get(3).add("Word");
        correctAnswerListOne.add("Mountain");

        questionListOne.add(" What is the biggest planet in our solar system?");
        answerListOne.get(0).add("Jupiter");
        answerListOne.get(1).add("Pluto");
        answerListOne.get(2).add("Mercury");
        answerListOne.get(3).add("Venus");
        correctAnswerListOne.add("Jupiter");

        questionListOne.add("What is the chemical symbol for the element oxygen ");
        answerListOne.get(0).add("O");
        answerListOne.get(1).add("Z");
        answerListOne.get(2).add("C");
        answerListOne.get(3).add("Q");
        correctAnswerListOne.add("O");

        questionListOne.add("Another name for a tidal wave is a? ");
        answerListOne.get(0).add("Tsunami");
        answerListOne.get(1).add("Fsunami");
        answerListOne.get(2).add("Qsunami");
        answerListOne.get(3).add("Lsunami");
        correctAnswerListOne.add("Tsunami");


        sciLevelOne.add(questionListOne);
        sciLevelOne.add(answerListOne);
        sciLevelOne.add(correctAnswerListOne);

        
    }

    public ArrayList<ArrayList> getSciLevelGen(int genSize) {
        
        
        for (int i = 0; i < genSize; i++) {
            int randIndex = rand.nextInt(questionListOne.size());
            questionListGen.add(questionListOne.get(randIndex));
            answerListGen.get(0).add(answerListOne.get(0).get(randIndex));
            answerListGen.get(1).add(answerListOne.get(1).get(randIndex));
            answerListGen.get(2).add(answerListOne.get(2).get(randIndex));
            answerListGen.get(3).add(answerListOne.get(3).get(randIndex));
            correctAnswerListGen.add(correctAnswerListOne.get(randIndex));
        }

        sciLevelGen.add(questionListGen);
        sciLevelGen.add(answerListGen);
        sciLevelGen.add(correctAnswerListGen);

        return sciLevelGen;
    }

    public void setSciLevelGen(ArrayList<ArrayList> sciLevelGen) {
        this.sciLevelGen = sciLevelGen;
    }

    public ArrayList<ArrayList> getSciLevelOne() {
        return sciLevelOne;
    }

    public void setSciLevelOne(ArrayList<ArrayList> sciLevelOne) {
        this.sciLevelOne = sciLevelOne;
    }

}
