
import java.awt.event.ActionListener;
import javax.swing.JFrame;



public class NavView extends JFrame{
    
    NavModel model;
    NavViewPanel nVpanel;
    
    NavView(NavModel model)
    {
        super("Primary View");
        this.model = model;
                          
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        nVpanel = new NavViewPanel();
        
        add(nVpanel);    
    }
    
    public void switchToOptionsPanel(OptionsView o_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        //nVPanel.removeCredits();
        //nVpanel.removeInstructions();
        nVpanel.addOptions(o_view);   
    }
    
    public void switchToMainPanel(MainView m_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeOptions();
        //nVpanel.removeCredits();
        //nVpanel.removeInstructions();
        nVpanel.addMain(m_view);        
    }
    
    public void switchToCreditsPanel()
    {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeOptions();
        nVpanel.removeInstructions();
        nVpanel.addCredits();
    }
    
    public void swtichToInstructionsPanel()
    {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeOptions();
        //nVPanel.removeCredits();
        //nVpanel.addInstructions();
    }
    
    
    public void addOptionsButtonListener(ActionListener al) 
    {    
        nVpanel.menu.optionsButton.addActionListener(al);
    }    
                    
    public void addMainButtonListener(ActionListener al) 
    {    
        nVpanel.menu.mainButton.addActionListener(al);
    }       
    
    
    //TODO: Add listeners to switch to other Panels
    
}
