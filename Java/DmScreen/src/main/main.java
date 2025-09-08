/*
This update adds more functionality to the widgets without image stick 
when widgets go behind buttons while removing the view block of the button bar
*/

package main;

import gui.DMScreen;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


public class main {
    public static void main(String[] args) {

        // GUI is created and updated on the Event Dispatch
        // Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            try {
                // Set the custom UIManager properties here
                UIManager.put("InternalFrame.activeTitleBackground", new Color(60, 63, 65));
                UIManager.put("InternalFrame.activeTitleForeground", Color.WHITE);
                UIManager.put("InternalFrame.activeTitleFont", new Font("Arial", Font.BOLD, 12));
                UIManager.put("InternalFrame.titleFont", new Font("Arial", Font.BOLD, 12));
                UIManager.put("InternalFrame.border", BorderFactory.createLineBorder(new Color(60, 63, 65)));
            } catch (Exception e) {
                e.printStackTrace();
            }
            // Create an instance of the DMScreenGUI class
            DMScreen frame = new DMScreen();

            // Make the frame visible
            frame.setVisible(true);
        });
    }
}