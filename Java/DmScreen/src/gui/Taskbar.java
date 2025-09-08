// src/gui/Taskbar.java
package gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Taskbar extends JPanel {
    private final Map<JInternalFrame, JButton> minimizedWidgets;

    public Taskbar() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBackground(new Color(0, 0, 0));
        setOpaque(false);
        Border border = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(border);
        minimizedWidgets = new HashMap<>();
    }

    public void addMinimizedWidget(JInternalFrame frame) {
        // Check if a button for this frame already exists in the map
        if (minimizedWidgets.containsKey(frame)) {
            return; // Button already exists, do not add another
        }

        JButton taskButton = new JButton(frame.getTitle());
        taskButton.addActionListener(e -> {
            try {
                frame.setIcon(false);
                frame.setVisible(true);
            } catch (java.beans.PropertyVetoException pve) {
                pve.printStackTrace();
            }
        });
        
        // Add the frame and its button to the map and the panel
        minimizedWidgets.put(frame, taskButton);
        this.add(taskButton);
        revalidate();
        repaint();
    }

    public void removeMinimizedWidget(JInternalFrame frame) {
        JButton buttonToRemove = minimizedWidgets.get(frame);
        if (buttonToRemove != null) {
            this.remove(buttonToRemove);
            minimizedWidgets.remove(frame);
            revalidate();
            repaint();
        }
    }
}