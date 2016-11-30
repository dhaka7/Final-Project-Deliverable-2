
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ohs5008
 */
public class GameController {
    
    GameView g_view;
    int counter = 0;

    GameController(GameView g_view) {
        this.g_view = g_view;
        g_view.addTestButtonListener(new TestButtonListener());
        
    }
    
    class TestButtonListener implements ActionListener {
        
        public void actionPerformed(ActionEvent ae) {
            counter++;
            if (counter % 2 != 0) {
                g_view.getLabel().setText("Works");
                g_view.getCorrectAnswerLabel().setText("The Correct Answer is " + g_view.getCorrectAnswerList().get(0));
            } else if (counter % 2 == 0) {
                g_view.getCorrectAnswerLabel().setText("");
                g_view.setQuestion(g_view.getCurrentQuestionNumber());
                
                System.out.println("next question");
                System.out.println("current question" + g_view.getCurrentQuestionNumber() + " total question" + g_view.getTotalQuestionNumber());
            }
        }
        
    }
}
