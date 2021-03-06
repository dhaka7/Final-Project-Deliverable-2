
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class NavView extends JFrame {

    NavModel model;
    NavViewPanel nVpanel;

    NavView(NavModel model) {
        super("Welcome to TRIvia Home Page");
        this.model = model;

        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        nVpanel = new NavViewPanel();

        add(nVpanel);
    }

    public void switchToOptionsPanel(OptionsView o_view) {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeCredits();
        nVpanel.removeGame();
        nVpanel.removeInstructions();
        nVpanel.removeGame();
        nVpanel.removeHighScore();
        
        nVpanel.removeCongrats();
        nVpanel.addOptions(o_view);
    }

    public void switchToMainPanel(MainView m_view) {
        nVpanel.removeSplash();
        nVpanel.removeOptions();
        nVpanel.removeCredits();
        nVpanel.removeGame();
        nVpanel.removeInstructions();
        nVpanel.removeHighScore();
        
        nVpanel.removeCongrats();
        nVpanel.addMain(m_view);
    }
    
    
    public void switchToCongrats(CongratsView congrast_view) {
        nVpanel.removeSplash();
        nVpanel.removeOptions();
        nVpanel.removeCredits();
        nVpanel.removeGame();
        nVpanel.removeInstructions();
        nVpanel.removeHighScore();
        nVpanel.removeCongrats();
        
        nVpanel.removeCongrats();
        nVpanel.addCongrats(congrast_view);
    }

    public void switchToCreditsPanel(CreditView c_view) {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeOptions();
        nVpanel.removeInstructions();
        nVpanel.removeGame();
        nVpanel.addCredits(c_view);
        nVpanel.removeHighScore();
    }

    public void swtichToInstructionsPanel(InstructionView i_view) {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeOptions();
        nVpanel.removeCredits();
        nVpanel.removeGame();
        nVpanel.removeHighScore();
        
        nVpanel.removeCongrats();
        nVpanel.addInstructions(i_view);
    }
    
    public void switchToPlayGamePanel(GameView g_view) {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeOptions();
        nVpanel.removeCredits();
        nVpanel.removeInstructions();
        nVpanel.removeHighScore();
        
        nVpanel.removeCongrats();
        nVpanel.addPlayGame(g_view);
    }
    
    
    public void switchHighScorePanel(HighScoreView hs_view) {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeOptions();
        nVpanel.removeCredits();
        nVpanel.removeInstructions();
        nVpanel.removeHighScore();
        
        nVpanel.removeCongrats();
        nVpanel.addHighScore(hs_view);
    }

    public void addOptionsButtonListener(ActionListener al) {
        nVpanel.menu.optionsButton.addActionListener(al);
    }
    
    
    public void addHighScoreButtonListener(ActionListener al) {
        nVpanel.menu.highScoreButton.addActionListener(al);
    }

    public void addMainButtonListener(ActionListener al) {
        nVpanel.menu.mainButton.addActionListener(al);
    }

    public void addCreditsButtonLIstener(ActionListener al) {
        nVpanel.menu.creditsButton.addActionListener(al);
    }

    public void addInstructionsButtonListener(ActionListener al) {
        nVpanel.menu.instructionsButton.addActionListener(al);
    }
    
    

    //TODO: Add listeners to switch to other Panels
}
