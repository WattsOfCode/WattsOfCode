package widgets;

import java.awt.Desktop;
import java.io.IOException; // Import ImageIcon
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class HelpButton extends JButton {
    public HelpButton(String text, ImageIcon icon, String url) { // Add ImageIcon parameter
        super(text, icon); // Pass text and icon to the superclass constructor
        addActionListener(e -> {
            try {
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    Desktop.getDesktop().browse(new URI(url));
                }
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace();
            }
        });
    }
}