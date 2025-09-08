// src/widgets/WidgetFrame.java
package widgets;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class WidgetFrame extends JInternalFrame {

    public WidgetFrame(String title) {
        super(title, true, true, true, true);
        
        setSize(400, 300);
        setLocation(50, 50);

        // Create a JTextArea for the code display
        JTextArea textArea = new JTextArea();
        textArea.setBackground(new Color(40, 44, 52)); // Dark background
        textArea.setForeground(new Color(171, 178, 191)); // Light gray text
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        textArea.setCaretColor(Color.WHITE); // White cursor

        // Add the JTextArea to a JScrollPane for scroll functionality
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBorder(null); // Remove the scroll pane's border
        
        // Add the scroll pane to the frame's content pane
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.add(scrollPane, BorderLayout.CENTER);
        
        add(contentPanel);
    }
}