
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class NavViewPanel extends JPanel {

    NavViewBottomMenuPanel menu;
    SplashScreenPanel splash;

    OptionsView o_view;
    MainView m_view;
    CreditView c_view;
    InstructionView i_view;
    GameView g_view;

    public NavViewPanel() {
        super();
        setLayout(new BorderLayout());
        menu = new NavViewBottomMenuPanel();
        splash = new SplashScreenPanel();

        add(menu, BorderLayout.SOUTH);
        add(splash, BorderLayout.CENTER);
    }

    //Note: Splash scrren is only shown on startup.  No need to navigate back to it.
    public void addOptions(OptionsView o_view) {
        this.o_view = o_view; //maintain handle to this view so we can remove it
        add(o_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void addMain(MainView m_view) {
        this.m_view = m_view;  //maintain handle to this view so we can remove it
        add(m_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void addCredits(CreditView c_view) {
        this.c_view = c_view;
        add(c_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void addInstructions(InstructionView i_view) {
        this.i_view = i_view;
        add(i_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void addSplash(NavView n_view) {
        add(n_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void addPlayGame(GameView g_view) {
        add(g_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void removeOptions() {
        if (this.o_view != null) {
            remove(this.o_view);
        }
    }

    public void removeMain() {
        if (this.m_view != null) {
            remove(this.m_view);
        }
    }

    public void removeCredits() {
        if (this.c_view != null) {
            remove(this.c_view);
        }
    }

    public void removeInstructions() {
        if (this.i_view != null) {
            remove(this.i_view);
        }
    }

    public void removeGame() {
        if (this.g_view != null) {
            remove(this.g_view);
        }
    }

    public void removeSplash() {
        remove(splash);
    }

}
