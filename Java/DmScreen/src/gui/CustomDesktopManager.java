// src/gui/CustomDesktopManager.java
package gui;

import javax.swing.DefaultDesktopManager;
import javax.swing.JInternalFrame;
import java.beans.PropertyVetoException;

public class CustomDesktopManager extends DefaultDesktopManager {
    private Taskbar taskbar;

    public CustomDesktopManager(Taskbar taskbar) {
        this.taskbar = taskbar;
    }

    @Override
    public void iconifyFrame(JInternalFrame f) {
        // Override the default iconification behavior
        try {
            f.setIcon(true); // Manually set the icon state
            f.setVisible(false); // Hide the window
            taskbar.addMinimizedWidget(f); // Add to our custom taskbar
        } catch (PropertyVetoException pve) {
            pve.printStackTrace();
        }
    }
}