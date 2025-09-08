package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import widgets.ApplicationToolbar;

public class DMScreen extends JFrame {
    private final JDesktopPane desktopPane;
    private final Taskbar taskbar;
    private final ApplicationToolbar toolbar;
    private final JLayeredPane layeredPane;

    public DMScreen() {
        super("DMScreen");
        setLayout(new BorderLayout());

        //  -----   ----    layering Section   ----   -----   //
        layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(800, 600));

        // desktop pane added to layered pane's default
        
        desktopPane = new JDesktopPane() {
            @Override
            public void paint(java.awt.Graphics g) {
                super.paint(g);
                toolbar.repaint(); // Always repaint the toolbar
            }
        };
        
        desktopPane.setBounds(0, 0, 800, 600);
        layeredPane.add(desktopPane, JLayeredPane.DEFAULT_LAYER);

        // toolbar added to higher layer to keep it on top
        toolbar = new ApplicationToolbar(this); 
        toolbar.setBounds(0, 0, 70, 600); 
        layeredPane.add(toolbar, JLayeredPane.PALETTE_LAYER);

        // added layered pane
        add(layeredPane, BorderLayout.CENTER);

        //  -----   ---- Taskbar section  ----   -----   //
        taskbar = new Taskbar();
        add(taskbar, BorderLayout.SOUTH);
        desktopPane.setDesktopManager(new CustomDesktopManager(taskbar));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
    }


    // The method signature is now updated to accept a JInternalFrame
    public void addWidget(JInternalFrame frame) {
        desktopPane.add(frame);
        frame.setVisible(true);

        toolbar.repaint();
    }

    public Taskbar getTaskbar() {
        return this.taskbar;
    }
}