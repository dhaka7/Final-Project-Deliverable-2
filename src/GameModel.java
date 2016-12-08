
import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author Lapper
 */
public class GameModel {

    ArrayList<String> questionList;
    ArrayList<String> answerList;
    ArrayList<String> correctAnswerList;
    JTextArea text;
    GameModel() {
        questionList = new ArrayList<>();
        answerList = new ArrayList<>();
        correctAnswerList = new ArrayList<>();

        
        
        text = new JTextArea("There was an error creating question. Please double check your settings.");
        
    }

}
