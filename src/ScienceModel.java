
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

    ArrayList<ArrayList> geoLevelOne = new ArrayList();
    
    ArrayList<ArrayList> sciLevelOne = new ArrayList();
    ArrayList<ArrayList> sciLevelTwo = new ArrayList();
    ArrayList<ArrayList> sciLevelThree = new ArrayList();       

    ScienceModel() {

        answerListOne.add(answerOneListOne);
        answerListOne.add(answerTwoListOne);
        answerListOne.add(answerThreeListOne);
        answerListOne.add(answerFourListOne);

        
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
        answerListOne.get(0).add("deuterium oxide");
        answerListOne.get(1).add("PH7");
        answerListOne.get(2).add("rain water");
        answerListOne.get(3).add("tritium oxide");
        correctAnswerListOne.add("deuterium oxide");

        questionListOne.add(" The element common to all acids is");
        answerListOne.get(0).add("hydrogen");
        answerListOne.get(1).add("carbon");
        answerListOne.get(2).add("sulphur");
        answerListOne.get(3).add("NONE");
        correctAnswerListOne.add("Radius");
        
        questionListOne.add(" When was the first plastic made of artificial materials patented? ");
        answerListOne.get(0).add("1909");
        answerListOne.get(1).add("1945");
        answerListOne.get(2).add("2003");
        answerListOne.get(3).add("1920");
        correctAnswerListOne.add("1909");
        
        questionListOne.add("Which of the following technological developments came first? ");
        answerListOne.get(0).add("telegraph");
        answerListOne.get(1).add("telescope");
        answerListOne.get(2).add("teletype");
        answerListOne.get(3).add("telephone");
        correctAnswerListOne.add("telescope");
        
        questionListOne.add("Who invented the geodesic dome? ");
        answerListOne.get(0).add("Samuel");
        answerListOne.get(1).add("Morse");
        answerListOne.get(2).add("Einstein");
        answerListOne.get(3).add("Fuller");
        correctAnswerListOne.add("Fuller");
        
        questionListOne.add(" Moths are a member of what order?");
        answerListOne.get(0).add("optica");
        answerListOne.get(1).add("lepidoptera");
        answerListOne.get(2).add("leprosy");
        answerListOne.get(3).add("octagon");
        correctAnswerListOne.add("lepidoptera");
        
        questionListOne.add(" A baby blue whale drinks this many liters of milk per day:");
        answerListOne.get(0).add("10");
        answerListOne.get(1).add("190");
        answerListOne.get(2).add("50");
        answerListOne.get(3).add("500");
        correctAnswerListOne.add("190");
        
        questionListOne.add("For what is the Jurassic period named? ");
        answerListOne.get(0).add("soccer");
        answerListOne.get(1).add("mountain");
        answerListOne.get(2).add("kind");
        answerListOne.get(3).add("word");
        correctAnswerListOne.add("mountain");
        
        questionListOne.add(" What is the biggest planet in our solar system?");
        answerListOne.get(0).add("Jupiter");
        answerListOne.get(1).add("pluto");
        answerListOne.get(2).add("mercury");
        answerListOne.get(3).add("venus");
        correctAnswerListOne.add("Jupiter");
        
        questionListOne.add("What is the chemical symbol for the element oxygen ");
        answerListOne.get(0).add("o");
        answerListOne.get(1).add("z");
        answerListOne.get(2).add("c");
        answerListOne.get(3).add("q");
        correctAnswerListOne.add("o");
        
        questionListOne.add("Another name for a tidal wave is a? ");
        answerListOne.get(0).add("Tsunami");
        answerListOne.get(1).add("Fsunami");
        answerListOne.get(2).add("Qsunami");
        answerListOne.get(3).add("Lsunami");
        correctAnswerListOne.add("Tsunami");

        geoLevelOne.add(questionListOne);
        geoLevelOne.add(answerListOne);
        geoLevelOne.add(correctAnswerListOne);
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
